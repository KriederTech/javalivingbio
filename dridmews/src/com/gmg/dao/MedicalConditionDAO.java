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
import com.gmg.util.*;


/**
 * @author Lasana
 *
 */
public class MedicalConditionDAO {

	/** Get Connection to database
	 * 
	 */
	
	Connection conn = null;
	GenericLogger gl = new GenericLogger();
	

	/**
	 * 
	 */
	public MedicalConditionDAO() {
		conn = DBConnection.getJNDIConnection();
		
		//conn = DBConnection.getSimpleConnection();
	}
	// Medical Conditions

	public GetMedicalConditionsResponse GetMedicalConditions(GetMedicalConditionsRequest input) {
		//DataBaseUtil dbu = new DataBaseUtil();
		Statement stmt = null;
		ResultSet rs = null;
		GetMedicalConditionsResponse medCondRes = new GetMedicalConditionsResponse();
		List<MedicalCondition> lmedicalCondition = new ArrayList<MedicalCondition>();
		MedicalCondition medicalCondition = new MedicalCondition();
		MedicalConditions medicalConditions = new MedicalConditions();
		//Connection conn = dbu.getConnection();
		try{
			if(conn!=null){
				//gl.logInfo(this.getClass().getName()+"Connection is not null");
				//gl.logInfo(this.getClass().getName()+"Creating statement...");
			    stmt = conn.createStatement();
				String upsql;
			    upsql = "SELECT id,med_condition, med_status,onset,details, person_id " +
			    		 "  FROM test.med_condition WHERE person_id ="+input.getUserid()+"";
			    gl.logInfo(this.getClass().getName()+"SELECT MEDICAL CONDITIONS SQL--> "+upsql);
			    gl.logInfo(this.getClass().getName()+"Execute Medical Conditions");
			    rs = stmt.executeQuery(upsql);
			     
			      while(rs.next()){
			    	  
			    	  medicalCondition.setId(rs.getString("id"));
			    	  medicalCondition.setCondition(rs.getString("med_condition"));
			    	  medicalCondition.setStatus(rs.getString("med_status"));
			    	  medicalCondition.setOnset(rs.getString("onset"));
			    	  medicalCondition.setDetails(rs.getString("details"));
			    	  medicalConditions.setUserId(rs.getString("person_id"));
			    	  System.out.println("in result set" + medicalCondition.getCondition());
			    	  //lmedicalCondition.add(medicalCondition); 
			    	  medicalConditions.getMedicalCondition().add(medicalCondition);
			    	  //medCondRes.setMedicalConditions(medicalConditions);
			    	  medicalCondition = new MedicalCondition();
			      }
			}
			medCondRes.setMedicalConditions(medicalConditions);
			return medCondRes;	
		}catch(Exception e){
			e.printStackTrace();
			return medCondRes;
		}
		finally {
				     try {rs.close();} catch (Exception e) {e.printStackTrace();gl.logError(this.getClass().getName()+""+e.getStackTrace());}
				     try {stmt.close();} catch (Exception e) {e.printStackTrace();gl.logError(this.getClass().getName()+""+e.getStackTrace());}
				     try {conn.close();} catch (Exception e) {e.printStackTrace();gl.logError(this.getClass().getName()+""+e.getStackTrace());}
				}
	}


	public InsertMedicalConditionResponse InsertMedicalCondition(InsertMedicalConditionRequest input) {
		//DataBaseUtil dbu = new DataBaseUtil();
		Statement stmt = null;
		InsertMedicalConditionResponse imcondresponse = new InsertMedicalConditionResponse();	
		MedicalConditions medicalConditions = input.getMedicalConditions();
		
		List<MedicalCondition> mcondition = medicalConditions.getMedicalCondition();
		
		
		
		try{
			if(conn!=null){
				stmt = conn.createStatement();
				String insertsql;
				insertsql = " INSERT INTO test.med_condition "+
					     		 " (med_condition,med_status,"
					     		 + "onset, details, person_id) "
					     		 + " values "+
					     		 "('"+mcondition.get(0).getCondition()+"',"+"'"+mcondition.get(0).getStatus()+"','"+
					     		mcondition.get(0).getOnset()+"','"+mcondition.get(0).getDetails()+ "','"+
					     		 input.getMedicalConditions().getUserId() +   "')";
					     		
					     		
				gl.logInfo(this.getClass().getName()+"insertsql --> "+insertsql);
								  stmt.executeUpdate(insertsql);
			}
			imcondresponse.setResponse("SUCCESS INSERTED MEDICAL CONDITIONS RECORDS FOR THE USER "+input.getMedicalConditions().getUserId());
			return imcondresponse;	
		}catch(Exception e){
		e.printStackTrace();
		imcondresponse.setResponse("INSERT FAILED FOR THE USER "+input.getMedicalConditions().getUserId());
	    return imcondresponse;
		}
		finally {
		     try {stmt.close();} catch (Exception e) {e.printStackTrace();gl.logError(this.getClass().getName()+""+e.getStackTrace());}
		     try {conn.close();} catch (Exception e) {e.printStackTrace();}
		}
			
	}


	public UpdateMedicalConditionsResponse UpdateMedicalCondition(UpdateMedicalConditionsRequest input) {
		
		Statement stmt = null;
		UpdateMedicalConditionsResponse umcresponse = new UpdateMedicalConditionsResponse();	
		MedicalConditions medicalconditions = input.getMedicalConditions();
		
		List<MedicalCondition> mcondition = medicalconditions.getMedicalCondition();
		
			
		try{
			if(conn!=null){
				stmt = conn.createStatement();
				String updateupsql;
				updateupsql = "UPDATE test.med_condition "+
					     		 "SET med_condition='"+mcondition.get(0).getCondition()+"',"+
					     		 "med_status='"+mcondition.get(0).getStatus()+"',"+
					     		 "onset='"+mcondition.get(0).getOnset()+"',"+
					    		 "details='"+mcondition.get(0).getDetails()+"'"+
					    		  "WHERE id=" + mcondition.get(0).getId();
					    		// +input.getMedicalConditions().getUserId();
				gl.logInfo(this.getClass().getName()+"Update Med conditions--> "+updateupsql);
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
		     try {stmt.close();} catch (Exception e) {e.printStackTrace();gl.logError(this.getClass().getName()+""+e.getStackTrace());}
		     try {conn.close();} catch (Exception e) {e.printStackTrace();gl.logError(this.getClass().getName()+""+e.getStackTrace());}
		}
	}

	public DeleteMedicalConditionResponse DeleteMedicalCondition(DeleteMedicalConditionRequest input) {
	   /*
	    * We will have to correct the WSDL/XSD we do not need to send the who;e contacts delete 
	    */
		
		Statement stmt = null;
		DeleteMedicalConditionResponse dmresponse = new DeleteMedicalConditionResponse();
		
		try{
			if(conn!=null){
				gl.logInfo(this.getClass().getName()+"Delete med cond Connection is not null");
				gl.logInfo(this.getClass().getName()+"Delete med cond Creating statement...");
			    stmt = conn.createStatement();
				String deletesql;
				deletesql = "DELETE FROM test.med_condition WHERE ID = "+input.getMedicalConditions().getMedicalCondition().get(0).getId();
				gl.logInfo(this.getClass().getName()+"delete med cond SQL--> "+deletesql);
				stmt.executeUpdate(deletesql);
			}
			dmresponse.setResponse("MEDICAL CONDITIONS DELETED SUCCESSFULLY FOR THE USER ID"+input.getMedicalConditions().getUserId());
			
	return dmresponse;	
	}catch(Exception e){
		e.printStackTrace();
		dmresponse.setResponse("MEDICAL CONDITIONS DELETION FAILED FOR THE USER ID"+input.getMedicalConditions().getUserId());
	    return dmresponse;
	}
		finally {
		     try {stmt.close();} catch (Exception e) {e.printStackTrace();gl.logError(this.getClass().getName()+""+e.getStackTrace());}
		     try {conn.close();} catch (Exception e) {e.printStackTrace();gl.logError(this.getClass().getName()+""+e.getStackTrace());}
		}
		
		// TODO Auto-generated method stub
		
	}
}
