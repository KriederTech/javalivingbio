/**
 * 
 */
package com.gmg.dao;

import com.gmg.*;
import com.gmg.UpdateUserResponse;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.gmg.dao.util.SearchUtilDao;
import com.gmg.util.DBConnection;

/**
 * @author Lasana
 *
 */
public class UserProfileDAO {

	/** Get Connection to database
	 * 
	 */
	
	Connection conn = null;
	
	public UserProfileDAO() {


		//conn = DBConnection.getSimpleConnection();
		conn = DBConnection.getJNDIConnection();
	}

	public UserResponse getUserProfile(GetUserRequest input) {
		//DataBaseUtil dbu = new DataBaseUtil();
		Statement stmt = null;
		ResultSet rs = null;
		UserResponse userreponse = new UserResponse();
		UserResponse.Accountinfo userreponseaccinfo = new UserResponse.Accountinfo();
		UserResponse.Addressinfo userreponseaddinfo = new UserResponse.Addressinfo();
		UserResponse.Personalinfo userreponseperinfo = new UserResponse.Personalinfo();
		
		//Connection conn = dbu.getConnection();
		try{
			if(conn!=null){
				System.out.print("Connection is not null");
				System.out.println("Creating statement...");
			    stmt = conn.createStatement();
				String upsql;
			    upsql = "SELECT id, account_expired, account_locked, address, " +
			    		 "city,country,postal_code,province,credentials_expired,email,"+
			    		 "account_enabled,first_name,last_name,password,password_hint,"+
			    		 "phone_number, username,version, website,family_acct,height,"+
			    		 "age,weight,birthdate, gender, username, account_id, type FROM test.app_user WHERE "+
			    		 " id ="+input.getUserid()+"";
			    System.out.println("SELECT SQL--> "+upsql);
			    System.out.println("Eecuted");
			      rs = stmt.executeQuery(upsql);
			      
			      while(rs.next()){
			    	  
			    	  userreponse.setUserId(rs.getString("id")); 
			    	  userreponse.setUsername(rs.getString("username"));
			    	  userreponse.setType(rs.getString("type"));
			    	 
			    	  userreponseaccinfo.setAccountexpired(rs.getBoolean("account_expired"));
			    	  userreponseaccinfo.setAccountid(rs.getString("account_id"));
			    	  
			    	  userreponseaccinfo.setAccountlocked(rs.getBoolean("account_locked"));
			    	  
			    	  userreponseaddinfo.setAddress(rs.getString("address")!=null?rs.getString("address"):"N/A");
			    	  
			    	  userreponseaddinfo.setCity(rs.getString("city")!=null?rs.getString("city"):"N/A");
			    	  
			    	  userreponseaddinfo.setCountry(rs.getString("country")!=null?rs.getString("country"):"N/A");
			    	  
			    	  userreponseaddinfo.setProvince(rs.getString("province")!=null?rs.getString("province"):"N/A");	    	
			    	  
			    	  userreponseaccinfo.setCredentialsexpired(rs.getBoolean("credentials_expired"));
			    	 
			    	  userreponseperinfo.setEmail(rs.getString("email")!=null?rs.getString("email"):"N/A");
			    	  
			    	  userreponseaccinfo.setAccountenabled(rs.getBoolean("account_enabled"));
			    	  
			    	  userreponseperinfo.setFirsName(rs.getString("first_name")!=null?rs.getString("first_name"):"N/A");
			    	
			    	  userreponseperinfo.setLastName(rs.getString("last_name")!=null?rs.getString("last_name"):"N/A");   	  
			    	
			    	  userreponseperinfo.setPhonenumber(rs.getString("phone_number")!=null?rs.getString("phone_number"):"N/A");			    	  
			    	  
			    	  userreponseperinfo.setWebsite(rs.getString("website")!=null?rs.getString("website"):"N/A");
			    	  
			    	  userreponseperinfo.setAge(BigInteger.valueOf(rs.getInt("age")));
			    	  
			    	  userreponseperinfo.setWeight(rs.getDouble("weight"));
			    	  
			    	  userreponseperinfo.setHeight(rs.getDouble("height"));
			    	  userreponseperinfo.setBirthdate(rs.getString("birthdate"));
			    	  userreponseperinfo.setGender(rs.getString("gender"));
			    	  
			    	  
			    	  
			    	  userreponse.setPersonalinfo(userreponseperinfo);
			    	  userreponse.setAddressinfo(userreponseaddinfo);
			    	  userreponse.setAccountinfo(userreponseaccinfo);
			    	  
			      }
			}
			//rs.close();
		return userreponse;	
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
				     try {rs.close();} catch (Exception e) {e.printStackTrace();}
				     try {stmt.close();} catch (Exception e) {e.printStackTrace();}
				     try {conn.close();} catch (Exception e) {e.printStackTrace();}
				}
			throw new UnsupportedOperationException("User Profile not found");
	
	}

	public UpdateUserResponse updateUserProfile(UserRequest input) {
		//DataBaseUtil dbu = new DataBaseUtil();
		Statement stmt = null;
		UpdateUserResponse uuresponse = new UpdateUserResponse();
		
		//Connection conn = dbu.getConnection();
		try{
			if(conn!=null){
				System.out.print("Connection is not null");
				System.out.println("Creating statement...");
			    stmt = conn.createStatement();
				String updateupsql;
				updateupsql = "UPDATE test.app_user "+
					     		 "SET address='"+input.getAddressinfo().getAddress()+"',"+
					     		 "city='"+input.getAddressinfo().getCity()+"',"+
					     		 "country='"+input.getAddressinfo().getCountry()+"',"+
					    		 "province='"+input.getAddressinfo().getProvince()+"',"+
					    		 "email='"+input.getPersonalinfo().getEmail()+"',"+
					    		 "first_name='"+input.getPersonalinfo().getFirsName()+"',"+
					    		 "last_name='"+input.getPersonalinfo().getLastName()+"',"+
					    		 "phone_number='"+input.getPersonalinfo().getPhonenumber()+"',"+
					    		 "gender='"+input.getPersonalinfo().getGender()+"',"+
					    		 "birthdate='"+input.getPersonalinfo().getBirthdate()+"',"+
					    		 "username='"+input.getUsername()+"',"+
					    		  "website='"+input.getPersonalinfo().getWebsite()+"'"+
					    		  "WHERE id="+input.getUserId();
								  System.out.print("Updae SQL--> "+updateupsql);
								  stmt.executeUpdate(updateupsql);
			}
			uuresponse.setResponse("UPDATE SUCCESS");
    return uuresponse;	
	}catch(Exception e){
		e.printStackTrace();
		uuresponse.setResponse("UPDATE FAILED");
	    return uuresponse;
	}
		finally {
		     try {stmt.close();} catch (Exception e) {e.printStackTrace();}
		     try {conn.close();} catch (Exception e) {e.printStackTrace();}
		}
}

}
