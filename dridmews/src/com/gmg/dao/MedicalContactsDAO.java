/**
 * 
 */
package com.gmg.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.gmg.dao.util.SearchUtilDao;
import com.gmg.util.DBConnection;
import com.gmg.*;


/**
 * @author Lasana
 *
 */
public class MedicalContactsDAO {
	
	/** Get Connection to database
	 * 
	 */
	
	Connection con = null;

	/**
	 * 
	 */
	public MedicalContactsDAO() {
		con = DBConnection.getJNDIConnection();
		//con = DBConnection.getSimpleConnection();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public DeleteMedicalContactResponse deleteMedicalContacts(String userid, String doc_id){
		Statement stmt = null;
		DeleteMedicalContactResponse dmresponse = new DeleteMedicalContactResponse();
		//Connection conn = dbu.getConnection();
		try{
			if(con!=null){
				System.out.print("Connection is not null");
				System.out.println("Creating statement...");
			    stmt = con.createStatement();
				String deletesql;
				deletesql = "DELETE FROM test.doctor_hosp_info WHERE ID = "+userid+ " and doc_id = " + doc_id;
				System.out.print("delete SQL--> "+deletesql);
				stmt.executeUpdate(deletesql);
			}
			dmresponse.setResponse("Success");
			
    return dmresponse;	
	}catch(Exception e){
		e.printStackTrace();
		dmresponse.setResponse("Failure");
	    return dmresponse;
	}
		finally {
		     try {stmt.close();} catch (Exception e) {e.printStackTrace();}
		     try {con.close();} catch (Exception e) {e.printStackTrace();}
		}
	}
	
	public InsertMedicalContactResponse insertMedicalContact(InsertMedicalContactRequest input) {	
	
		Statement stmt = null;
		InsertMedicalContactResponse imcresponse = new InsertMedicalContactResponse();	
		MedicalContacts medicalcontacts = input.getMedicalContacts();
		
		List<MedicalContact> mcontact = medicalcontacts.getMedicalContact();
	
		Address address = mcontact.get(0).getAddress();
		int rs = 0;
		
		try{
			if(con!=null){
				stmt = con.createStatement();
				String insertsql;
				insertsql = " INSERT INTO test.doctor_hosp_info "+
					     		 " (id, first_name,last_name,"
					     		 + "address1, address2,city,state,zipcode,phone,hospital_name,doctor_type,dte_created,dte_updated,created_by,updated_by) "
					     		 + " values "+
					     		 "('"+input.getMedicalContacts().getUserId()+"','"+mcontact.get(0).getFirstName()+"',"+"'"+mcontact.get(0).getLastName()+"','"+
					     		 address.getAddress1()+"','"+address.getAddress2()+"','"+address.getCity()+"','"+
					     		 address.getState()+"','"+address.getZipCode()+"','"+address.getPhone()+"','NA','NA',SYSDATE(),SYSDATE(),'DRIDME','DRIDME')";
					     		
					     		  System.out.print("insertsql --> "+insertsql);
								  rs = stmt.executeUpdate(insertsql);
								  //System.out.println("after insert" + rs);
			}
								  
			imcresponse.setResponse("SUCCESS INSERTED MEDICAL CONTACT RECORDS FOR THE USER "+input.getMedicalContacts().getUserId());
			//System.out.println("after insert" + imcresponse.getResponse().toString());
			return imcresponse;	
		}catch(Exception e){
		e.printStackTrace();
		imcresponse.setResponse("INSERT FAILED FOR THE USER "+input.getMedicalContacts().getUserId());
	    return imcresponse;
		}
		finally {
		     try {stmt.close();} catch (Exception e) {e.printStackTrace();}
		     try {con.close();} catch (Exception e) {e.printStackTrace();}
		}	
	
		}
	public UpdateMedicalContactResponse updateMedicalContact(UpdateMedicalContactRequest input) {
		//DataBaseUtil dbu = new DataBaseUtil();
		Statement stmt = null;
		UpdateMedicalContactResponse umcresponse = new UpdateMedicalContactResponse();	
		MedicalContacts medicalcontacts = input.getMedicalContacts();
		
		List<MedicalContact> mcontact = medicalcontacts.getMedicalContact();
		Address address = mcontact.get(0).getAddress();
		
		try{
			if(con!=null){
				stmt = con.createStatement();
				String updateupsql;
				updateupsql = "UPDATE test.doctor_hosp_info "+
					     		 "SET FIRST_NAME='"+mcontact.get(0).getFirstName()+"',"+
					     		 "LAST_NAME='"+mcontact.get(0).getLastName()+"',"+
					     		 "DOCTOR_TYPE='"+mcontact.get(0).getDoctorType()+"',"+
					    		 "address1='"+address.getAddress1()+"',"+
					    		 "address2='"+address.getAddress2()+"',"+
					    		 "city='"+address.getCity()+"',"+
					    		 "STATE='"+address.getState()+"',"+
					    		 "ZIPCODE='"+address.getZipCode()+"',"+
					    		  "PHONE='"+address.getPhone()+"'"+
					    		  "WHERE id="+input.getMedicalContacts().getUserId() +
					    		  " and doc_id= " +input.getMedicalContacts().getMedicalContact().get(0).getDoctorId();
								  System.out.print("Updae SQL--> "+updateupsql);
								  stmt.executeUpdate(updateupsql);
			}
			umcresponse.setResponse("UPDATE SUCCESS");
			return umcresponse;	
		}catch(Exception e){
		e.printStackTrace();
		umcresponse.setResponse("UPDATE FAILED");
	    return umcresponse;
		}
		finally {
		     try {stmt.close();} catch (Exception e) {e.printStackTrace();}
		     try {con.close();} catch (Exception e) {e.printStackTrace();}
		}
	}
		






		public GetMedicalContactsResponse getMedicalContacts(GetMedicalContactsRequest input) {

			Statement stmt = null;
			ResultSet rs = null;
			List<MedicalContact> mcontact = new ArrayList<MedicalContact>();
			MedicalContact medicalcontact = new MedicalContact();
			List<HospitalContact> hcontact = new ArrayList<HospitalContact>();
			HospitalContact hospitalcontact = new HospitalContact();
			MedicalContacts medicalcontacts = new MedicalContacts();
			Address address = new Address();
			GetMedicalContactsResponse gm = new GetMedicalContactsResponse();

			try{
				if(con!=null){
					System.out.print("Connection is not null");
					System.out.println("Creating statement...");
				    stmt = con.createStatement();
					String upsql;
				    upsql = "SELECT id, first_name,last_name,address1, " +
				    		 "address2,city,state,zipcode,phone,hospital_name,doctor_type, doc_id"+
				    		 "  FROM test.doctor_hosp_info WHERE id ="+input.getUserid()+"" + " and first_name is not null";
				    System.out.println("SELECT SQL--> "+upsql);
				    System.out.println("Executed");
				      rs = stmt.executeQuery(upsql);
				      int i=0;
				      while(rs.next()){
				    	  
				    	  System.out.println("Inside while");
				    	  medicalcontact.setFirstName(rs.getString("first_name"));
				    	  medicalcontact.setLastName(rs.getString("last_name"));
				    	  address.setAddress1(rs.getString("address1"));
				    	  address.setAddress2(rs.getString("address2"));
				    	  address.setCity(rs.getString("city"));
				    	  address.setState(rs.getString("state"));
				    	  address.setZipCode(rs.getString("zipcode"));
				    	  address.setPhone(rs.getString("phone"));
				    	  medicalcontact.setAddress(address);
				    	  medicalcontact.setDoctorId(rs.getString("doc_id"));
				    	  //hospitalcontact.setAddress(address);
				    	  //hospitalcontact.setHospitalName(rs.getString("hospital_name"));
				    	  medicalcontact.setDoctorType(rs.getString("doctor_type"));
				    	  mcontact.add(medicalcontact);
				    	  //medicalcontacts.getMedicalContact().add(e)
				    	  //mcontact.add(medicalcontact);
				    	 // gm.setMedicalContacts(medicalcontacts);
				    	  System.out.println("test med contacts" + medicalcontact.getFirstName());
				    	  medicalcontacts.setUserId(rs.getString("id"));
				    	  medicalcontacts.getMedicalContact().add(medicalcontact);
				    	  System.out.println("test med contacts" + medicalcontacts.getMedicalContact().get(i).getLastName());
				    	  i=i+1;
				    	  medicalcontact = new MedicalContact();
				    	  address = new Address();
				    	  //hcontact.add(hospitalcontact);
				    	 // medicalcontacts.getMedicalContact().add(//)setMedicalContact(mcontact);
				    	  //medicalcontacts.setHospitalContact(hcontact);
				      }
				}
				gm.setMedicalContacts(medicalcontacts);
			return gm;	
			}catch(Exception e){
				e.printStackTrace();
			}
			finally {
					     try {rs.close();} catch (Exception e) {e.printStackTrace();}
					     try {stmt.close();} catch (Exception e) {e.printStackTrace();}
					     try {con.close();} catch (Exception e) {e.printStackTrace();}
					}
			throw new UnsupportedOperationException("Not implemented yet.");
		}	
}
