/**
 * 
 */
package com.gmg.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.gmg.dao.util.SearchUtilDao;
import com.gmg.util.DBConnection;
import com.gmg.util.EncryptStrings;
import com.gmg.util.*;
import com.gmg.*;

/**
 * @author Lasana
 *
 */
public class LoginDAO {
	
	/** Get Connection to database
	 * 
	 */
	
	Connection con = null;
	ResultSet rs = null;
	//ResultSet res = null;

	/**
	 * 
	 */
	public LoginDAO() {
		// Get Connection to database
		
		con = DBConnection.getJNDIConnection();
		//con = DBConnection.getSimpleConnection();
	}
	
	public LoginResponse getLogin(String username, String password, String tmp_password){
		Byte acct_expired =0;
		Byte acct_locked =0;
		Byte acct_enabled =0;
		String userid =null;
		String acctID = null;
		
		LoginResponse lr = new LoginResponse();
		StrongAES passwordEncoder = new StrongAES();
		// Removed on 5/29/2016 BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(11);
		try{
			String password_new = null;
			String tmp_password_new = null;
			SearchUtilDao s = new SearchUtilDao();
			//System.out.println("Test select tmp password " + tmp_password + " password " + password + " username " + username);
			if(!(password.isEmpty())){
				
				password_new = passwordEncoder.encode(password);
				System.out.println("Test select in pwd   password " + password_new + " username " + username);
				//rs = s.doSearchAll("app_user", "username",con);
				rs = s.doSearchEqual("app_user", "username", "password", username, password_new, con);
			}else {
				
				tmp_password_new = passwordEncoder.encode(tmp_password);
				System.out.println("Test select tmp password " + tmp_password +  " username " + username);
				rs = s.doSearchEqual("app_user", "username", "tmp_password", username, tmp_password_new, con);
				
			}
			
			
			while(rs.next()){
				
				acct_expired = rs.getByte("account_expired");
				acct_locked = rs.getByte("account_locked");
				acct_enabled = rs.getByte("account_enabled");
				acctID = rs.getString("account_id");
				userid = rs.getString("id");
				
				
			}
			
			if(acct_expired == 0 &&  acct_locked == 0 &&  acct_enabled == 1){
				lr.setStatus("A");
			}
			else{
				lr.setStatus("R");
			}
			lr.setUserid(userid);
			//lr.setUsersessionid("45409809");
			return lr;
			
		}
		catch (Exception ex){
			ex.printStackTrace();
			lr.setStatus("N");
			lr.setUserid("0");
			//lr.setUsersessionid("5555");
			return lr;
		}
		finally {
			
			closeConnection();
		}
	}

	
	
	public ResetPasswordResponse resetPassword(String username){

		String email =null;
		String tmp_password = null;
		String tmp_password_old = null;
		String userid = null;
		String response = null;
		int noOfCAPSAlpha = 1;
		int noOfDigits = 1;
		int noOfSplChars = 1;
		int minLen = 8;
		int maxLen = 12;
		String sql = "update app_user " + " SET tmp_password = '";
		int resp = 0;
		
		ResetPasswordResponse rp = new ResetPasswordResponse();
		StrongAES passwordEncoder = new StrongAES();
		// Removed on 5/29/2016 BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(11);
		try{
			
			char[] pswd = RandomPasswordGenerator.generatePswd(minLen, maxLen,
					noOfCAPSAlpha, noOfDigits, noOfSplChars);
			//System.out.println("Len = " + pswd.length + ", " + new String(pswd));
			
			
			tmp_password_old = new String(pswd);
			tmp_password = passwordEncoder.encode(tmp_password_old);
		
			SearchUtilDao s = new SearchUtilDao();
			rs = s.doSearchEqual("app_user", "username", null, username, null, con);
			while(rs.next()){
				

				userid = rs.getString("id");
				email = rs.getString("email");
				
			}
            sql = sql + tmp_password + "'";
			
			Statement stmt = con.createStatement();
			if(userid == null){
				rp.setResponse("Failed");
			}
			else {
				sql = sql + " WHERE ID = '" + userid + "'";
				//System.out.println("update statement " + sql);
				resp = stmt.executeUpdate(sql);
				rp.setResponse("Success");
			}
			rp.setEmail(email);
			rp.setTmpPassword(tmp_password_old);
			if(email == null){
				rp.setResponse("Failed");
			}
			else {
				rp.setResponse("Success");
			}
			//lr.setUsersessionid("45409809");
			return rp;
			
		}
		catch (Exception ex){
			ex.printStackTrace();
			rp.setEmail(email);
			rp.setTmpPassword(tmp_password);
			rp.setResponse("Failed");
			return rp;
		}
		finally {
			
			closeConnection();
		}
	}

	
	public ChangePasswordResponse ChangePassword(String username, String tmp_password, String password){

		
		ChangePasswordResponse cp = new ChangePasswordResponse();
		String userid = null;
		String sql = "update app_user " + " SET password = '";
		int resp = 0;
		String password_new = null;
		String tmp_password_new = null;
		StrongAES a = new StrongAES();
		//EncryptStrings st = new EncryptStrings();
		//st.EncryptText(RawText)
		StrongAES passwordEncoder = new StrongAES();
		// Removed on 5/29/2016 BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(11);
		
		//tmp_password_new = EncryptStrings.EncryptText(tmp_password);
		//password_new = EncryptStrings.EncryptText(password);

		
		try{
			SearchUtilDao s = new SearchUtilDao();
			//if(!(password.isEmpty())){
				
				password_new = passwordEncoder.encode(password);
				//rs = s.doSearchEqual("app_user", "username", "password", username, password_new, con);
			//}else {
				
				tmp_password_new = passwordEncoder.encode(tmp_password);
				//System.out.println("Test update tmp password " + tmp_password + " password " + password + " username " + username);
				//System.out.println("Test update tmp password " + tmp_password_new + " password " + password_new + " username " + username);
				rs = s.doSearchEqual("app_user", "username", "tmp_password", username, tmp_password_new, con);
				//password_new = tmp_password_new;
				
			//}
		
			//SearchUtilDao s = new SearchUtilDao();
			//rs = s.doSearchEqual("app_user", "username", "tmp_password", username, tmp_password_new, con);
			while(rs.next()){
				

				userid = rs.getString("id");
				//tmp_password = rs.getString("tmp_password");
				
			}
			sql = sql + password_new + "'";
			
			Statement stmt = con.createStatement();
			if(userid == null){
				cp.setResponse("Failed");
			}
			else {
				sql = sql + " WHERE ID = '" + userid + "'";
				//System.out.println("update statement " + sql);
				resp = stmt.executeUpdate(sql);
				
				if (resp > 0 ){
					cp.setResponse("Success");
				}
				else{
					cp.setResponse("Failed");
				}
			}
			//lr.setUsersessionid("45409809");
			return cp;
			
		}
		catch (Exception ex){
			ex.printStackTrace();
			cp.setResponse("Failed");
			return cp;
		}
		finally {
			
			closeConnection();
		}
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LoginDAO ld = new LoginDAO();
		//ResetPasswordResponse cp = new ResetPasswordResponse();
		//cp = ld.resetPassword("test");
		//System.out.println("test response: "+ cp.getResponse()+ " another tmp password: " + cp.getTmpPassword() );
		
		LoginResponse lr = new LoginResponse();
		ld = new LoginDAO();
		lr = ld.getLogin("user", "test",null);
		System.out.println("test Login status: "+ lr.getStatus()+ " userid " + lr.getUserid() );
		
		/*StrongAES pw = new StrongAES();
		System.out.println("Password: " +pw.encode("g7*tlhjsbelO"));
		ChangePasswordResponse cr = new ChangePasswordResponse();
		ld = new LoginDAO();
		cr = ld.ChangePassword("user", "g7*tlhjsbelO", "test");
		System.out.println("test change response: "+ cr.getResponse() );*/
		
	}

	public void closeConnection(){
		try{
			rs.close();
			con.close();
			//res.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}
