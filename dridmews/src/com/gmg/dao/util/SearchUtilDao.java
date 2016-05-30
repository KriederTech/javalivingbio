/**
 * 
 */
package com.gmg.dao.util;

//import com.gmg.app.util.DBConnection;
import java.sql.*;

/**
 * @author Lasana
 *
 */
public class SearchUtilDao {
	//Connection con;

	/**
	 * 
	 */
	public SearchUtilDao() {
		//con = DBConnection.getJNDIConnection();
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
	public ResultSet doSearchEqual(String tName, String cName1, String cName2, String value1, String value2, Connection con){
		ResultSet rs = null;
		//System.out.println("hello" + value1);
		String sql = "select * from ";
		if (!(value2 == null))
		    sql = sql + tName + " where " +cName1 +" = '" + value1 +"' and "+ cName2 + " = '" + value2 + "';";
		else
			sql = sql + tName + " where " +cName1 +" = '" + value1 + "';";
		try{
			//System.out.println(sql);
			Statement stmt = con.createStatement();
//			CallableStatement cstmt = con.prepareCall(sql);
			//System.out.println("name again: " + medRecs.getDoctor_name());

			//CallableStatement cstmt = con.prepareCall("{call INSERT_HOSPITAL_INFO(?,?,?,?,?,?,?,?,?)}");

			rs = stmt.executeQuery(sql); 
				//cstmt.executeQuery(sql);

		}
		catch(Exception ex){
			ex.printStackTrace();
			return rs;
			
		}	
		
		return rs;
	}
	public ResultSet doSearchEqual(String tName, String cName1, String cName2, Date value1, String value2, Connection con){
		ResultSet rs;
		//System.out.println("hello" + value1);
		String sql = "select * from ";
		if (!(cName2 == null))
		    sql = sql + tName + " where " +cName1 +" = " + value1 +" and "+ cName2 + " = " + value2 + ";";
		else
			sql = sql + tName + " where " +cName1 +" = " + value1 + ";";
		try{
			//System.out.println(sql);
			Statement stmt = con.createStatement();
			//CallableStatement cstmt = con.prepareCall(sql);
			//System.out.println("name again: " + medRecs.getDoctor_name());

			//CallableStatement cstmt = con.prepareCall("{call INSERT_HOSPITAL_INFO(?,?,?,?,?,?,?,?,?)}");

			//rs = cstmt.executeQuery(sql);
			rs = stmt.executeQuery(sql); 
			return rs;

		}
		catch(Exception ex){
			ex.printStackTrace();
			return null;
		}
	}

	public ResultSet doSearchEqual(String tName, String cName1, String cName2, long value1, int value2, Connection con){
		ResultSet rs;
		//System.out.println("hello" + value1);
		String sql = "select * from ";
		if (!(cName2 == null))
		    sql = sql + tName + " where " +cName1 +" = " + value1 +" and "+ cName2 + " = " + value2 + ";";
		else
			sql = sql + tName + " where " +cName1 +" = " + value1 + ";";
		try{
			//System.out.println(sql);
			Statement stmt = con.createStatement();
			//CallableStatement cstmt = con.prepareCall(sql);
			//System.out.println("name again: " + medRecs.getDoctor_name());

			//CallableStatement cstmt = con.prepareCall("{call INSERT_HOSPITAL_INFO(?,?,?,?,?,?,?,?,?)}");

			//rs = cstmt.executeQuery(sql);
			rs = stmt.executeQuery(sql); 
			return rs;

		}
		catch(Exception ex){
			ex.printStackTrace();
			return null;
		}
	}
	
	public ResultSet doSearchEqual(String tName, String cName1, String cName2, int value1, int value2, Connection con){
		ResultSet rs;
		//System.out.println("hello" + value1);
		String sql = "select * from ";
		if (!(cName2 == null))
		    sql = sql + tName + " where " +cName1 +" = " + value1 +" and "+ cName2 + " = " + value2 + ";";
		else
			sql = sql + tName + " where " +cName1 +" = " + value1 + ";";
		try{
			//System.out.println(sql);
			Statement stmt = con.createStatement();
			//CallableStatement cstmt = con.prepareCall(sql);
			//System.out.println("name again: " + medRecs.getDoctor_name());

			//CallableStatement cstmt = con.prepareCall("{call INSERT_HOSPITAL_INFO(?,?,?,?,?,?,?,?,?)}");

			//rs = cstmt.executeQuery(sql);
			rs = stmt.executeQuery(sql); 
			return rs;

		}
		catch(Exception ex){
			ex.printStackTrace();
			return null;
		}
	}

	/**
	 * The method will take in find results based on 1 column that is passed in.
	 * 
	 * @param tName Table Name
	 * @param cName1 Column Name
	 * @param value1 Search Value
	 * @return Result Set
	 */	
		public ResultSet doSearchLike(String tName, String cName1, String value1, Connection con){
			ResultSet rs = null;
			String sql = "select * from ";
			sql = sql + tName + " where " +cName1 +" like % " + value1 + "%;";
			try{
				//System.out.println(sql);
				CallableStatement cstmt = con.prepareCall(sql);
				//System.out.println("name again: " + medRecs.getDoctor_name());

				//CallableStatement cstmt = con.prepareCall("{call INSERT_HOSPITAL_INFO(?,?,?,?,?,?,?,?,?)}");

				rs = cstmt.executeQuery(sql);

			}
			catch(Exception ex){
				ex.printStackTrace();
				return rs;
				
			}				
			return rs;
		}

	public ResultSet doSearchAll(String tName, String col, Connection con){
		ResultSet rs = null;
		String sql = "select " + col+" from ";
		sql = sql + tName +  ";";
		try{
			//System.out.println(sql);
			Statement stmt = con.createStatement();
//			CallableStatement cstmt = con.prepareCall(sql);
			//System.out.println("name again: " + medRecs.getDoctor_name());

			//CallableStatement cstmt = con.prepareCall("{call INSERT_HOSPITAL_INFO(?,?,?,?,?,?,?,?,?)}");

			rs = stmt.executeQuery(sql); 
				//cstmt.executeQuery(sql);

		}
		catch(Exception ex){
			ex.printStackTrace();
			return rs;
			
		}	
		
		return rs;
	}
	public ResultSet doSearchAll(String tName, Connection con){
		ResultSet rs = null;
		String sql = "select * from ";
		sql = sql + tName +  ";";
		try{
			//System.out.println(sql);
			Statement stmt = con.createStatement();
//			CallableStatement cstmt = con.prepareCall(sql);
			//System.out.println("name again: " + medRecs.getDoctor_name());

			//CallableStatement cstmt = con.prepareCall("{call INSERT_HOSPITAL_INFO(?,?,?,?,?,?,?,?,?)}");

			rs = stmt.executeQuery(sql); 
				//cstmt.executeQuery(sql);

		}
		catch(Exception ex){
			ex.printStackTrace();
			return rs;
			
		}	
		
		return rs;
	}	


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SearchUtilDao u = new SearchUtilDao();
		//u.doSearchEqual("app_user", "id", "-2", null, null);

	}

}
