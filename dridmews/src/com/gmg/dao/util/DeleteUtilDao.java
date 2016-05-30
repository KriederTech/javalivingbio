/**
 * 
 */
package com.gmg.dao.util;

import com.gmg.util.DBConnection;
import java.sql.*;

/**
 * @author Lasana Crider
 *
 */
public class DeleteUtilDao {
	Connection con;

	/**
	 * 
	 */
	public DeleteUtilDao() {
		con = DBConnection.getJNDIConnection();
		//con = DBConnection.getSimpleConnection();
	}
/**
 * The method will take in find results based on 2 columns that are passed in.
 * 
 * @param tName Table Name
 * @param cName1 Column Name
 * @param cName2 Column Name
 * @param value1 Search Value
 * @param value2 Search Value
 * @return Result Set
 */	
	public int doDeleteEqual(String tName, String cName1, String cName2, String value1, String value2){
		int rs;
		System.out.println("hello" + value1);
		String sql = "delete from ";
		if (value2.length() > 0)
		    sql = sql + tName + " where " +cName1 +" = " + value1 +" and "+ cName2 + " = " + value2 + ";";
		else
			sql = sql + tName + " where " +cName1 +" = " + value1 + ";";
		try{
			System.out.println(sql);
			Statement stmt = con.createStatement();
//			CallableStatement cstmt = con.prepareCall(sql);
			//System.out.println("name again: " + medRecs.getDoctor_name());

			//CallableStatement cstmt = con.prepareCall("{call INSERT_HOSPITAL_INFO(?,?,?,?,?,?,?,?,?)}");

			rs = stmt.executeUpdate(sql); 
			return rs;
				//cstmt.executeQuery(sql);

		}
		catch(Exception ex){
			ex.printStackTrace();
			return 0;
			
		}	
		finally {
			closeConnection();
		}
	}
	public int doDeleteEqual(String tName, String cName1, String cName2, long value1, long value2){
		int rs;
		System.out.println("hello" + value1);
		String sql = "delete from ";
		if (cName2.length() > 0)
		    sql = sql + tName + " where " +cName1 +" = " + value1 +" and "+ cName2 + " = " + value2 + ";";
		else
			sql = sql + tName + " where " +cName1 +" = " + value1 + ";";
		try{
			System.out.println(sql);
			Statement stmt = con.createStatement();
			//CallableStatement cstmt = con.prepareCall(sql);
			//System.out.println("name again: " + medRecs.getDoctor_name());

			//CallableStatement cstmt = con.prepareCall("{call INSERT_HOSPITAL_INFO(?,?,?,?,?,?,?,?,?)}");

			//rs = cstmt.executeQuery(sql);
			rs = stmt.executeUpdate(sql); 
			return rs;

		}
		catch(Exception ex){
			ex.printStackTrace();
			return 0;
		}
		finally {
			closeConnection();
		}
	}




	
	
	public void closeConnection(){
		try{
			
		
			con.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	


	/**
	 * @param args
	 */
	public static void main(String[] args) {


	}

}
