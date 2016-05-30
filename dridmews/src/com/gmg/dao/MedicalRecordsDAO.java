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
import com.gmg.*;
import com.gmg.util.*;

/**
 * @author Lasana
 *
 */
public class MedicalRecordsDAO {

	/** Get Connection to database
	 * 
	 */
	
	Connection conn = null;
	GenericLogger gl = new GenericLogger();
	

	/**
	 * 
	 */
	public MedicalRecordsDAO() {
		conn = DBConnection.getJNDIConnection();
		
		//conn = DBConnection.getSimpleConnection();
	}
	public GetMedicalRecordsResponse getMedicalRecords(GetMedicalRecordsRequest input) {
		
		Statement stmt = null;
		ResultSet rs = null;
		String img = null;
		List<MedicalRecord> mrecord = new ArrayList<MedicalRecord>();
		MedicalRecords medicalrecords = new MedicalRecords();
		MedicalRecord medicalrecord = new MedicalRecord();
		GetMedicalRecordsResponse gm = new GetMedicalRecordsResponse();
		//EncryptStrings stringEncoder = new EncryptStrings();
		try{
			if(conn!=null){
				gl.logInfo(this.getClass().getName()+"Connection is not null");
				gl.logInfo(this.getClass().getName()+"Creating statement...");
			    stmt = conn.createStatement();
				String upsql;
			    upsql = "SELECT idmed_recs, person_id,document_caption,document_name, " +
			    		 "image,created_dt"+
			    		 "  FROM test.med_recs WHERE person_id ="+input.getUserid()+"";
			    gl.logInfo(this.getClass().getName()+"SELECT SQL--> "+upsql);
			    gl.logInfo(this.getClass().getName()+"Executed");
			      rs = stmt.executeQuery(upsql);
			     
			      while(rs.next()){
			    	  medicalrecord.setDocCaption(rs.getString("document_caption"));
			    	  medicalrecord.setDocName(rs.getString("document_name"));
			    	  medicalrecord.setDocDate(rs.getString("created_dt"));
			    	  medicalrecord.setDocId(rs.getString("idmed_recs"));
			    	  img = EncryptStrings.DecryptText(rs.getString("image"));
			    	  medicalrecord.setDocument(img);
			    	  medicalrecords.setUserId(rs.getString("person_id"));
			    	  mrecord.add(medicalrecord);
			    	  medicalrecords.getMedicalRecord().add(medicalrecord);
			    	  medicalrecord = new MedicalRecord();
			    	  //medicalrecords.setMedicalRecord(mrecord);		    	  
			      }
			}
			gm.setMedicalRecords(medicalrecords);
		return gm;	
		}catch(Exception e){
			e.printStackTrace();
			return gm;
		}
		finally {
				     try {rs.close();} catch (Exception e) {e.printStackTrace();gl.logError(this.getClass().getName()+""+e.getStackTrace());}
				     try {stmt.close();} catch (Exception e) {e.printStackTrace();gl.logError(this.getClass().getName()+""+e.getStackTrace());}
				     try {conn.close();} catch (Exception e) {e.printStackTrace();gl.logError(this.getClass().getName()+""+e.getStackTrace());}
				}
	}

	public InsertMedicalRecordResponse insertMedicalRecord(InsertMedicalRecordRequest input) {
		
		Statement stmt = null;
		String img = null;
		InsertMedicalRecordResponse imcresponse = new InsertMedicalRecordResponse();	
		MedicalRecords medicalrecords = input.getMedicalRecords();
		//.imcresponse.img = input.getMedicalRecords().getMedicalRecord().
		
		List<MedicalRecord> mrecord = medicalrecords.getMedicalRecord();
		
		img = EncryptStrings.EncryptText(mrecord.get(0).getDocument());
		
		
		try{
			if(conn!=null){
				stmt = conn.createStatement();
				String insertsql;
				insertsql = " INSERT INTO test.med_recs "+
					     		 " (person_id,document_caption,document_name,"
					     		 + "created_dt,updated_dt,created_by,updated_by,image) "
					     		 + " values "+
					     		 "('"+ medicalrecords.getUserId() +"',"+"'"+mrecord.get(0).getDocCaption()+"','"+
					     		 mrecord.get(0).getDocName()+"',SYSDATE(),SYSDATE(),'DRIDME','DRIDME','"+img+"')";
									gl.logInfo(this.getClass().getName()+"insertsql"+insertsql);
					     		  
								  stmt.executeUpdate(insertsql);
			}
			imcresponse.setResponse("SUCCESS INSERTED MEDICAL RECORD RECORDS FOR THE USER "+medicalrecords.getUserId());
			return imcresponse;	
		}catch(Exception e){
		e.printStackTrace();
		imcresponse.setResponse("MEDICAL RECORD INSERT FAILED FOR THE USER "+medicalrecords.getUserId());
	    return imcresponse;
		}
		finally {
		     try {stmt.close();} catch (Exception e) {e.printStackTrace();gl.logError(this.getClass().getName()+""+e.getStackTrace());}
		     try {conn.close();} catch (Exception e) {e.printStackTrace();gl.logError(this.getClass().getName()+""+e.getStackTrace());}
		}
		
	}
}
