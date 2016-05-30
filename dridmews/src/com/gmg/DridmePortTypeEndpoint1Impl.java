package com.gmg;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.gmg.dao.*;


@javax.jws.WebService(endpointInterface = "com.gmg.DridmePortType", targetNamespace = "http://xmlns.example.com/1399970793097", serviceName = "drIDme", portName = "DridmePortTypeEndpoint1", wsdlLocation = "WEB-INF/wsdl/dridme-new.wsdl")
public class DridmePortTypeEndpoint1Impl {



	public UpdateMedicalConditionsResponse updateMedicalCondition(
			UpdateMedicalConditionsRequest input) {
		MedicalConditionDAO mc = new MedicalConditionDAO();
		UpdateMedicalConditionsResponse uc = new UpdateMedicalConditionsResponse();
		uc = mc.UpdateMedicalCondition(input);
		return uc;
		
	}



	public DeleteMedicalConditionResponse deleteMedicalCondition(
			DeleteMedicalConditionRequest input) {
		DeleteMedicalConditionResponse dc = new DeleteMedicalConditionResponse();
		MedicalConditionDAO mc = new MedicalConditionDAO();
		dc = mc.DeleteMedicalCondition(input);
		return dc;
		
	}



	public GetMedicalConditionsResponse getMedicalConditions(
			GetMedicalConditionsRequest input) {
		MedicalConditionDAO mc = new MedicalConditionDAO();
		GetMedicalConditionsResponse gc = new GetMedicalConditionsResponse();
		gc = mc.GetMedicalConditions(input);
		return gc;
	}

	public InsertMedicalConditionResponse insertMedicalCondition(
			InsertMedicalConditionRequest input) {
		MedicalConditionDAO mc = new MedicalConditionDAO();
		InsertMedicalConditionResponse im = new InsertMedicalConditionResponse();
		im = mc.InsertMedicalCondition(input);
		return im;
		
	}



	public DeleteMedicalContactResponse deleteMedicalContact(
			DeleteMedicalContactRequest input) {
		MedicalContactsDAO mc = new MedicalContactsDAO();
		DeleteMedicalContactResponse resp = new DeleteMedicalContactResponse();
		String userid = input.medicalContacts.userId;
		String doc_id = input.medicalContacts.medicalContact.get(0).doctorId;

		resp = mc.deleteMedicalContacts(userid, doc_id);
		return resp;
	}

	public GetMedicalContactsResponse getMedicalContacts(
			GetMedicalContactsRequest input) {
		GetMedicalContactsResponse gm = new GetMedicalContactsResponse();
		MedicalContactsDAO mc = new MedicalContactsDAO();
		try{
			gm = mc.getMedicalContacts(input);
			return gm;
		}
		catch(Exception ex){
			ex.printStackTrace();
			return null;
		}
		
		
	}

	public LoginResponse getLogin(LoginRequest input) {
		LoginResponse lr = new LoginResponse();
		LoginDAO l = new LoginDAO();
		String pwd = null;
		pwd = input.getPassword();
		lr = l.getLogin(input.getUserid(), input.getPassword(), input.getTmp_password());
		return lr;
	}

	public UserResponse getUserProfile(GetUserRequest input) {
		UserProfileDAO upd = new UserProfileDAO();
		UserResponse urp = new UserResponse();
		
		try{
			urp = upd.getUserProfile(input);
			return urp;
		}
		catch(Exception ex){
			ex.printStackTrace();
			return urp;
		}
			
	}
	public GetMedicalRecordsResponse getMedicalRecords(
			GetMedicalRecordsRequest input) {
		MedicalRecordsDAO md = new MedicalRecordsDAO();
		GetMedicalRecordsResponse gm = new GetMedicalRecordsResponse();
		gm = md.getMedicalRecords(input);
		return gm;
	}

	public InsertMedicalRecordResponse insertMedicalRecord(
			InsertMedicalRecordRequest input) {
		MedicalRecordsDAO md = new MedicalRecordsDAO();
		InsertMedicalRecordResponse im = new InsertMedicalRecordResponse();
		im = md.insertMedicalRecord(input);
		return im;
		
	}

	public InsertMedicalContactResponse insertMedicalContact(
			InsertMedicalContactRequest input) {
		MedicalContactsDAO mc = new MedicalContactsDAO();
		InsertMedicalContactResponse resp = new InsertMedicalContactResponse();
		resp = mc.insertMedicalContact(input);
		return resp;
	}

	public UpdateUserResponse updateUserProfile(UserRequest input) {
		UserProfileDAO upd = new UserProfileDAO();
		UpdateUserResponse urp = new UpdateUserResponse();
		
		try{
			urp = upd.updateUserProfile(input);
			return urp;
		}
		catch(Exception ex){
			ex.printStackTrace();
			return urp;
		}
			
	}



	public UpdateMedicalContactResponse updateMedicalContact(
			UpdateMedicalContactRequest input) {
		MedicalContactsDAO mc = new MedicalContactsDAO();
		UpdateMedicalContactResponse response = new UpdateMedicalContactResponse();
		response = mc.updateMedicalContact(input);
		return response;
		
	}

	public ChangePasswordResponse changePassword(ChangePasswordRequest input) {
		LoginDAO ld = new LoginDAO();
		ChangePasswordResponse cp = new ChangePasswordResponse();
		cp = ld.ChangePassword(input.getUsername(), input.getTmpPassword(), input.getPassword());
		return cp;
	}

	public ResetPasswordResponse resetPassword(ResetPasswordRequest input) {
		LoginDAO ld = new LoginDAO();
		ResetPasswordResponse rp = new ResetPasswordResponse();
		rp = ld.resetPassword(input.getUsername());
		return rp;
		
	}
}