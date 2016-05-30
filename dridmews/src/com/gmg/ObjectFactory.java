package com.gmg;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.gmg package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _InsertMedicalRecordRequest_QNAME = new QName(
			"http://services.gmg.com/InsertMedicalRecordRequest/1.0",
			"InsertMedicalRecordRequest");
	private final static QName _InsertMedicalConditionResponse_QNAME = new QName(
			"http://services.gmg.com/InsertMedicalConditionResponse/1.0",
			"InsertMedicalConditionResponse");
	private final static QName _DeleteMedicalConditionResponse_QNAME = new QName(
			"http://services.gmg.com/DeleteMedicalConditionResponse/1.0",
			"DeleteMedicalConditionResponse");
	private final static QName _UpdateMedicalConditionsResponse_QNAME = new QName(
			"http://services.gmg.com/UpdateMedicalConditionsResponse/1.0",
			"UpdateMedicalConditionsResponse");
	private final static QName _UpdateMedicalConditionsRequest_QNAME = new QName(
			"http://services.gmg.com/UpdateMedicalConditionsRequest/1.0",
			"UpdateMedicalConditionsRequest");
	private final static QName _InsertMedicalContactRequest_QNAME = new QName(
			"http://services.gmg.com/InsertMedicalContactRequest/1.0",
			"InsertMedicalContactRequest");
	private final static QName _UpdateUserResponse_QNAME = new QName(
			"http://services.gmg.com/UpdateUserResponse/1.0",
			"UpdateUserResponse");
	private final static QName _MedicalContacts_QNAME = new QName(
			"http://services.gmg.com/MedicalContacts/1.0", "MedicalContacts");
	private final static QName _UpdateMedicalContactResponse_QNAME = new QName(
			"http://services.gmg.com/UpdateMedicalContactResponse/1.0",
			"UpdateMedicalContactResponse");
	private final static QName _GetMedicalConditionsRequest_QNAME = new QName(
			"http://services.gmg.com/GetMedicalConditionsRequest/1.0",
			"GetMedicalConditionsRequest");
	private final static QName _InsertMedicalContactResponse_QNAME = new QName(
			"http://services.gmg.com/InsertMedicalContactResponse/1.0",
			"InsertMedicalContactResponse");
	private final static QName _InsertMedicalRecordResponse_QNAME = new QName(
			"http://services.gmg.com/InsertMedicalRecordResponse/1.0",
			"InsertMedicalRecordResponse");
	private final static QName _MedicalRecords_QNAME = new QName(
			"http://services.gmg.com/MedicalRecords/1.0", "MedicalRecords");
	private final static QName _DeleteMedicalContactResponse_QNAME = new QName(
			"http://services.gmg.com/DeleteMedicalContactResponse/1.0",
			"DeleteMedicalContactResponse");
	private final static QName _UserResponse_QNAME = new QName(
			"http://services.gmg.com/UserResponse/1.0", "UserResponse");
	private final static QName _UserRequest_QNAME = new QName(
			"http://services.gmg.com/UserRequest/1.0", "UserRequest");
	private final static QName _GetMedicalContactsResponse_QNAME = new QName(
			"http://services.gmg.com/GetMedicalContactsResponse/1.0",
			"GetMedicalContactsResponse");
	private final static QName _MedicalConditions_QNAME = new QName(
			"http://services.gmg.com/MedicalConditions/1.0",
			"MedicalConditions");
	private final static QName _GetMedicalRecordsRequest_QNAME = new QName(
			"http://services.gmg.com/GetMedicalRecordsRequest/1.0",
			"GetMedicalRecordsRequest");
	private final static QName _DeleteMedicalContactRequest_QNAME = new QName(
			"http://services.gmg.com/DeleteMedicalContactRequest/1.0",
			"DeleteMedicalContactRequest");
	private final static QName _GetMedicalRecordsResponse_QNAME = new QName(
			"http://services.gmg.com/GetMedicalRecordsResponse/1.0",
			"GetMedicalRecordsResponse");
	private final static QName _UpdateMedicalContactRequest_QNAME = new QName(
			"http://services.gmg.com/UpdateMedicalContactRequest/1.0",
			"UpdateMedicalContactRequest");
	private final static QName _GetMedicalConditionsResponse_QNAME = new QName(
			"http://services.gmg.com/GetMedicalConditionsResponse/1.0",
			"GetMedicalConditionsResponse");
	private final static QName _GetUserRequest_QNAME = new QName(
			"http://services.gmg.com/GetUserRequest/1.0", "GetUserRequest");
	private final static QName _DeleteMedicalConditionRequest_QNAME = new QName(
			"http://services.gmg.com/DeleteMedicalConditionRequest/1.0",
			"DeleteMedicalConditionRequest");
	private final static QName _InsertMedicalConditionRequest_QNAME = new QName(
			"http://services.gmg.com/InsertMedicalConditionRequest/1.0",
			"InsertMedicalConditionRequest");
	private final static QName _GetMedicalContactsRequest_QNAME = new QName(
			"http://services.gmg.com/GetMedicalContactsRequest/1.0",
			"GetMedicalContactsRequest");
	private final static QName _LoginRequest_QNAME = new QName(
			"http://services.gmg.com/LoginRequest/1.0", "LoginRequest");
	private final static QName _LoginResponse_QNAME = new QName(
			"http://services.gmg.com/LoginResponse/1.0", "LoginResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.gmg
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link GetMedicalConditionsResponse }
	 * 
	 */
	public GetMedicalConditionsResponse createGetMedicalConditionsResponse() {
		return new GetMedicalConditionsResponse();
	}

	/**
	 * Create an instance of {@link UpdateMedicalContactResponse }
	 * 
	 */
	public UpdateMedicalContactResponse createUpdateMedicalContactResponse() {
		return new UpdateMedicalContactResponse();
	}

	/**
	 * Create an instance of {@link UpdateMedicalConditionsRequest }
	 * 
	 */
	public UpdateMedicalConditionsRequest createUpdateMedicalConditionsRequest() {
		return new UpdateMedicalConditionsRequest();
	}

	/**
	 * Create an instance of {@link DeleteMedicalConditionRequest }
	 * 
	 */
	public DeleteMedicalConditionRequest createDeleteMedicalConditionRequest() {
		return new DeleteMedicalConditionRequest();
	}

	/**
	 * Create an instance of {@link GetUserRequest }
	 * 
	 */
	public GetUserRequest createGetUserRequest() {
		return new GetUserRequest();
	}

	/**
	 * Create an instance of {@link LoginRequest }
	 * 
	 */
	public LoginRequest createLoginRequest() {
		return new LoginRequest();
	}

	/**
	 * Create an instance of {@link InsertMedicalContactRequest }
	 * 
	 */
	public InsertMedicalContactRequest createInsertMedicalContactRequest() {
		return new InsertMedicalContactRequest();
	}

	/**
	 * Create an instance of {@link GetMedicalContactsRequest }
	 * 
	 */
	public GetMedicalContactsRequest createGetMedicalContactsRequest() {
		return new GetMedicalContactsRequest();
	}

	/**
	 * Create an instance of {@link DeleteMedicalContactRequest }
	 * 
	 */
	public DeleteMedicalContactRequest createDeleteMedicalContactRequest() {
		return new DeleteMedicalContactRequest();
	}

	/**
	 * Create an instance of {@link DeleteMedicalContactResponse }
	 * 
	 */
	public DeleteMedicalContactResponse createDeleteMedicalContactResponse() {
		return new DeleteMedicalContactResponse();
	}

	/**
	 * Create an instance of {@link InsertMedicalConditionRequest }
	 * 
	 */
	public InsertMedicalConditionRequest createInsertMedicalConditionRequest() {
		return new InsertMedicalConditionRequest();
	}

	/**
	 * Create an instance of {@link GetMedicalRecordsResponse }
	 * 
	 */
	public GetMedicalRecordsResponse createGetMedicalRecordsResponse() {
		return new GetMedicalRecordsResponse();
	}

	/**
	 * Create an instance of {@link MedicalCondition }
	 * 
	 */
	public MedicalCondition createMedicalCondition() {
		return new MedicalCondition();
	}

	/**
	 * Create an instance of {@link MedicalRecord }
	 * 
	 */
	public MedicalRecord createMedicalRecord() {
		return new MedicalRecord();
	}

	/**
	 * Create an instance of {@link HospitalContact }
	 * 
	 */
	public HospitalContact createHospitalContact() {
		return new HospitalContact();
	}

	/**
	 * Create an instance of {@link GetMedicalContactsResponse }
	 * 
	 */
	public GetMedicalContactsResponse createGetMedicalContactsResponse() {
		return new GetMedicalContactsResponse();
	}

	/**
	 * Create an instance of {@link UserResponse.Personalinfo }
	 * 
	 */
	public UserResponse.Personalinfo createUserResponsePersonalinfo() {
		return new UserResponse.Personalinfo();
	}

	/**
	 * Create an instance of {@link LoginResponse }
	 * 
	 */
	public LoginResponse createLoginResponse() {
		return new LoginResponse();
	}

	/**
	 * Create an instance of {@link com.gmg.Personalinfo }
	 * 
	 */
	public com.gmg.Personalinfo createPersonalinfo() {
		return new com.gmg.Personalinfo();
	}

	/**
	 * Create an instance of {@link InsertMedicalRecordResponse }
	 * 
	 */
	public InsertMedicalRecordResponse createInsertMedicalRecordResponse() {
		return new InsertMedicalRecordResponse();
	}

	/**
	 * Create an instance of {@link UserResponse.Addressinfo }
	 * 
	 */
	public UserResponse.Addressinfo createUserResponseAddressinfo() {
		return new UserResponse.Addressinfo();
	}

	/**
	 * Create an instance of {@link UpdateMedicalConditionsResponse }
	 * 
	 */
	public UpdateMedicalConditionsResponse createUpdateMedicalConditionsResponse() {
		return new UpdateMedicalConditionsResponse();
	}

	/**
	 * Create an instance of {@link MedicalContacts }
	 * 
	 */
	public MedicalContacts createMedicalContacts() {
		return new MedicalContacts();
	}

	/**
	 * Create an instance of {@link GetMedicalConditionsRequest }
	 * 
	 */
	public GetMedicalConditionsRequest createGetMedicalConditionsRequest() {
		return new GetMedicalConditionsRequest();
	}

	/**
	 * Create an instance of {@link GetMedicalRecordsRequest }
	 * 
	 */
	public GetMedicalRecordsRequest createGetMedicalRecordsRequest() {
		return new GetMedicalRecordsRequest();
	}

	/**
	 * Create an instance of {@link MedicalRecords }
	 * 
	 */
	public MedicalRecords createMedicalRecords() {
		return new MedicalRecords();
	}

	/**
	 * Create an instance of {@link UpdateMedicalContactRequest }
	 * 
	 */
	public UpdateMedicalContactRequest createUpdateMedicalContactRequest() {
		return new UpdateMedicalContactRequest();
	}

	/**
	 * Create an instance of {@link com.gmg.Accountinfo }
	 * 
	 */
	public com.gmg.Accountinfo createAccountinfo() {
		return new com.gmg.Accountinfo();
	}

	/**
	 * Create an instance of {@link MedicalConditions }
	 * 
	 */
	public MedicalConditions createMedicalConditions() {
		return new MedicalConditions();
	}

	/**
	 * Create an instance of {@link DeleteMedicalConditionResponse }
	 * 
	 */
	public DeleteMedicalConditionResponse createDeleteMedicalConditionResponse() {
		return new DeleteMedicalConditionResponse();
	}

	/**
	 * Create an instance of {@link InsertMedicalRecordRequest }
	 * 
	 */
	public InsertMedicalRecordRequest createInsertMedicalRecordRequest() {
		return new InsertMedicalRecordRequest();
	}

	/**
	 * Create an instance of {@link Address }
	 * 
	 */
	public Address createAddress() {
		return new Address();
	}

	/**
	 * Create an instance of {@link com.gmg.Addressinfo }
	 * 
	 */
	public com.gmg.Addressinfo createAddressinfo() {
		return new com.gmg.Addressinfo();
	}

	/**
	 * Create an instance of {@link UpdateUserResponse }
	 * 
	 */
	public UpdateUserResponse createUpdateUserResponse() {
		return new UpdateUserResponse();
	}

	/**
	 * Create an instance of {@link UserResponse }
	 * 
	 */
	public UserResponse createUserResponse() {
		return new UserResponse();
	}

	/**
	 * Create an instance of {@link MedicalContact }
	 * 
	 */
	public MedicalContact createMedicalContact() {
		return new MedicalContact();
	}

	/**
	 * Create an instance of {@link InsertMedicalConditionResponse }
	 * 
	 */
	public InsertMedicalConditionResponse createInsertMedicalConditionResponse() {
		return new InsertMedicalConditionResponse();
	}

	/**
	 * Create an instance of {@link UserRequest }
	 * 
	 */
	public UserRequest createUserRequest() {
		return new UserRequest();
	}

	/**
	 * Create an instance of {@link UserResponse.Accountinfo }
	 * 
	 */
	public UserResponse.Accountinfo createUserResponseAccountinfo() {
		return new UserResponse.Accountinfo();
	}

	/**
	 * Create an instance of {@link InsertMedicalContactResponse }
	 * 
	 */
	public InsertMedicalContactResponse createInsertMedicalContactResponse() {
		return new InsertMedicalContactResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link InsertMedicalRecordRequest }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/InsertMedicalRecordRequest/1.0", name = "InsertMedicalRecordRequest")
	public JAXBElement<InsertMedicalRecordRequest> createInsertMedicalRecordRequest(
			InsertMedicalRecordRequest value) {
		return new JAXBElement<InsertMedicalRecordRequest>(
				_InsertMedicalRecordRequest_QNAME,
				InsertMedicalRecordRequest.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link InsertMedicalConditionResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/InsertMedicalConditionResponse/1.0", name = "InsertMedicalConditionResponse")
	public JAXBElement<InsertMedicalConditionResponse> createInsertMedicalConditionResponse(
			InsertMedicalConditionResponse value) {
		return new JAXBElement<InsertMedicalConditionResponse>(
				_InsertMedicalConditionResponse_QNAME,
				InsertMedicalConditionResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteMedicalConditionResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/DeleteMedicalConditionResponse/1.0", name = "DeleteMedicalConditionResponse")
	public JAXBElement<DeleteMedicalConditionResponse> createDeleteMedicalConditionResponse(
			DeleteMedicalConditionResponse value) {
		return new JAXBElement<DeleteMedicalConditionResponse>(
				_DeleteMedicalConditionResponse_QNAME,
				DeleteMedicalConditionResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateMedicalConditionsResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/UpdateMedicalConditionsResponse/1.0", name = "UpdateMedicalConditionsResponse")
	public JAXBElement<UpdateMedicalConditionsResponse> createUpdateMedicalConditionsResponse(
			UpdateMedicalConditionsResponse value) {
		return new JAXBElement<UpdateMedicalConditionsResponse>(
				_UpdateMedicalConditionsResponse_QNAME,
				UpdateMedicalConditionsResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateMedicalConditionsRequest }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/UpdateMedicalConditionsRequest/1.0", name = "UpdateMedicalConditionsRequest")
	public JAXBElement<UpdateMedicalConditionsRequest> createUpdateMedicalConditionsRequest(
			UpdateMedicalConditionsRequest value) {
		return new JAXBElement<UpdateMedicalConditionsRequest>(
				_UpdateMedicalConditionsRequest_QNAME,
				UpdateMedicalConditionsRequest.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link InsertMedicalContactRequest }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/InsertMedicalContactRequest/1.0", name = "InsertMedicalContactRequest")
	public JAXBElement<InsertMedicalContactRequest> createInsertMedicalContactRequest(
			InsertMedicalContactRequest value) {
		return new JAXBElement<InsertMedicalContactRequest>(
				_InsertMedicalContactRequest_QNAME,
				InsertMedicalContactRequest.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateUserResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/UpdateUserResponse/1.0", name = "UpdateUserResponse")
	public JAXBElement<UpdateUserResponse> createUpdateUserResponse(
			UpdateUserResponse value) {
		return new JAXBElement<UpdateUserResponse>(_UpdateUserResponse_QNAME,
				UpdateUserResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MedicalContacts }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/MedicalContacts/1.0", name = "MedicalContacts")
	public JAXBElement<MedicalContacts> createMedicalContacts(
			MedicalContacts value) {
		return new JAXBElement<MedicalContacts>(_MedicalContacts_QNAME,
				MedicalContacts.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateMedicalContactResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/UpdateMedicalContactResponse/1.0", name = "UpdateMedicalContactResponse")
	public JAXBElement<UpdateMedicalContactResponse> createUpdateMedicalContactResponse(
			UpdateMedicalContactResponse value) {
		return new JAXBElement<UpdateMedicalContactResponse>(
				_UpdateMedicalContactResponse_QNAME,
				UpdateMedicalContactResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetMedicalConditionsRequest }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/GetMedicalConditionsRequest/1.0", name = "GetMedicalConditionsRequest")
	public JAXBElement<GetMedicalConditionsRequest> createGetMedicalConditionsRequest(
			GetMedicalConditionsRequest value) {
		return new JAXBElement<GetMedicalConditionsRequest>(
				_GetMedicalConditionsRequest_QNAME,
				GetMedicalConditionsRequest.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link InsertMedicalContactResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/InsertMedicalContactResponse/1.0", name = "InsertMedicalContactResponse")
	public JAXBElement<InsertMedicalContactResponse> createInsertMedicalContactResponse(
			InsertMedicalContactResponse value) {
		return new JAXBElement<InsertMedicalContactResponse>(
				_InsertMedicalContactResponse_QNAME,
				InsertMedicalContactResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link InsertMedicalRecordResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/InsertMedicalRecordResponse/1.0", name = "InsertMedicalRecordResponse")
	public JAXBElement<InsertMedicalRecordResponse> createInsertMedicalRecordResponse(
			InsertMedicalRecordResponse value) {
		return new JAXBElement<InsertMedicalRecordResponse>(
				_InsertMedicalRecordResponse_QNAME,
				InsertMedicalRecordResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MedicalRecords }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/MedicalRecords/1.0", name = "MedicalRecords")
	public JAXBElement<MedicalRecords> createMedicalRecords(MedicalRecords value) {
		return new JAXBElement<MedicalRecords>(_MedicalRecords_QNAME,
				MedicalRecords.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteMedicalContactResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/DeleteMedicalContactResponse/1.0", name = "DeleteMedicalContactResponse")
	public JAXBElement<DeleteMedicalContactResponse> createDeleteMedicalContactResponse(
			DeleteMedicalContactResponse value) {
		return new JAXBElement<DeleteMedicalContactResponse>(
				_DeleteMedicalContactResponse_QNAME,
				DeleteMedicalContactResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UserResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/UserResponse/1.0", name = "UserResponse")
	public JAXBElement<UserResponse> createUserResponse(UserResponse value) {
		return new JAXBElement<UserResponse>(_UserResponse_QNAME,
				UserResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UserRequest }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/UserRequest/1.0", name = "UserRequest")
	public JAXBElement<UserRequest> createUserRequest(UserRequest value) {
		return new JAXBElement<UserRequest>(_UserRequest_QNAME,
				UserRequest.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetMedicalContactsResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/GetMedicalContactsResponse/1.0", name = "GetMedicalContactsResponse")
	public JAXBElement<GetMedicalContactsResponse> createGetMedicalContactsResponse(
			GetMedicalContactsResponse value) {
		return new JAXBElement<GetMedicalContactsResponse>(
				_GetMedicalContactsResponse_QNAME,
				GetMedicalContactsResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link MedicalConditions }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/MedicalConditions/1.0", name = "MedicalConditions")
	public JAXBElement<MedicalConditions> createMedicalConditions(
			MedicalConditions value) {
		return new JAXBElement<MedicalConditions>(_MedicalConditions_QNAME,
				MedicalConditions.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetMedicalRecordsRequest }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/GetMedicalRecordsRequest/1.0", name = "GetMedicalRecordsRequest")
	public JAXBElement<GetMedicalRecordsRequest> createGetMedicalRecordsRequest(
			GetMedicalRecordsRequest value) {
		return new JAXBElement<GetMedicalRecordsRequest>(
				_GetMedicalRecordsRequest_QNAME,
				GetMedicalRecordsRequest.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteMedicalContactRequest }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/DeleteMedicalContactRequest/1.0", name = "DeleteMedicalContactRequest")
	public JAXBElement<DeleteMedicalContactRequest> createDeleteMedicalContactRequest(
			DeleteMedicalContactRequest value) {
		return new JAXBElement<DeleteMedicalContactRequest>(
				_DeleteMedicalContactRequest_QNAME,
				DeleteMedicalContactRequest.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetMedicalRecordsResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/GetMedicalRecordsResponse/1.0", name = "GetMedicalRecordsResponse")
	public JAXBElement<GetMedicalRecordsResponse> createGetMedicalRecordsResponse(
			GetMedicalRecordsResponse value) {
		return new JAXBElement<GetMedicalRecordsResponse>(
				_GetMedicalRecordsResponse_QNAME,
				GetMedicalRecordsResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link UpdateMedicalContactRequest }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/UpdateMedicalContactRequest/1.0", name = "UpdateMedicalContactRequest")
	public JAXBElement<UpdateMedicalContactRequest> createUpdateMedicalContactRequest(
			UpdateMedicalContactRequest value) {
		return new JAXBElement<UpdateMedicalContactRequest>(
				_UpdateMedicalContactRequest_QNAME,
				UpdateMedicalContactRequest.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetMedicalConditionsResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/GetMedicalConditionsResponse/1.0", name = "GetMedicalConditionsResponse")
	public JAXBElement<GetMedicalConditionsResponse> createGetMedicalConditionsResponse(
			GetMedicalConditionsResponse value) {
		return new JAXBElement<GetMedicalConditionsResponse>(
				_GetMedicalConditionsResponse_QNAME,
				GetMedicalConditionsResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetUserRequest }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/GetUserRequest/1.0", name = "GetUserRequest")
	public JAXBElement<GetUserRequest> createGetUserRequest(GetUserRequest value) {
		return new JAXBElement<GetUserRequest>(_GetUserRequest_QNAME,
				GetUserRequest.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteMedicalConditionRequest }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/DeleteMedicalConditionRequest/1.0", name = "DeleteMedicalConditionRequest")
	public JAXBElement<DeleteMedicalConditionRequest> createDeleteMedicalConditionRequest(
			DeleteMedicalConditionRequest value) {
		return new JAXBElement<DeleteMedicalConditionRequest>(
				_DeleteMedicalConditionRequest_QNAME,
				DeleteMedicalConditionRequest.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link InsertMedicalConditionRequest }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/InsertMedicalConditionRequest/1.0", name = "InsertMedicalConditionRequest")
	public JAXBElement<InsertMedicalConditionRequest> createInsertMedicalConditionRequest(
			InsertMedicalConditionRequest value) {
		return new JAXBElement<InsertMedicalConditionRequest>(
				_InsertMedicalConditionRequest_QNAME,
				InsertMedicalConditionRequest.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetMedicalContactsRequest }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/GetMedicalContactsRequest/1.0", name = "GetMedicalContactsRequest")
	public JAXBElement<GetMedicalContactsRequest> createGetMedicalContactsRequest(
			GetMedicalContactsRequest value) {
		return new JAXBElement<GetMedicalContactsRequest>(
				_GetMedicalContactsRequest_QNAME,
				GetMedicalContactsRequest.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link LoginRequest }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/LoginRequest/1.0", name = "LoginRequest")
	public JAXBElement<LoginRequest> createLoginRequest(LoginRequest value) {
		return new JAXBElement<LoginRequest>(_LoginRequest_QNAME,
				LoginRequest.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://services.gmg.com/LoginResponse/1.0", name = "LoginResponse")
	public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
		return new JAXBElement<LoginResponse>(_LoginResponse_QNAME,
				LoginResponse.class, null, value);
	}

}
