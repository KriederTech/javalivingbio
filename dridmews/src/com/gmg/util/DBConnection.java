package com.gmg.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import javax.naming.*;
import javax.sql.*;

/**
 * @author Lasana Crider
 * This is the JNDI Connection Class
 * Will get connection from connection pool handled
 * by Tomcat server.
 * 
 * JNDI Name: java:comp/env/jdbc/gmg
 *
 */
public class DBConnection {

	/**
	 * 
	 */
	public DBConnection() {
		// TODO Auto-generated constructor stub
	}
	/** Uses JNDI and Datasource (preferred style).   */
	  public static Connection getJNDIConnection(){
	    String DATASOURCE_CONTEXT = "java:comp/env/jdbc/gmg";
	    
	    Connection result = null;
	    try {
	      Context initialContext = new InitialContext();
	      if ( initialContext == null){
	        log("JNDI problem. Cannot get InitialContext.");
	      }
	      DataSource datasource = (DataSource)initialContext.lookup(DATASOURCE_CONTEXT);
	      if (datasource != null) {
	        result = datasource.getConnection();
	      }
	      else {
	        log("Failed to lookup datasource.");
	      }
	    }
	    catch ( NamingException ex ) {
	      log("Cannot get connection: " + ex);
	    }
	    catch(SQLException ex){
	      log("Cannot get connection: " + ex);
	    }
	    return result;
	  }
	  
	  private static void log(Object aObject){
		    System.out.println(aObject);
		  }
	  /** Uses DriverManager.  */
	  public static Connection getSimpleConnection() {
	    //See your driver documentation for the proper format of this string :
	    String DB_CONN_STRING = "jdbc:mysql://localhost:3306/test";
	    //Provided by your driver documentation. In this case, a MySql driver is used : 
	    String DRIVER_CLASS_NAME = "org.gjt.mm.mysql.Driver";
	    String USER_NAME = "root";
	    String PASSWORD = "password";
	    System.out.println("testing lc1");
	    Connection result = null;
	    try {
	       Class.forName(DRIVER_CLASS_NAME).newInstance();
	    }
	    catch (Exception ex){
	    	ex.printStackTrace();
	       log("Check classpath. Cannot load db driver: " + DRIVER_CLASS_NAME);
	    }

	    try {
	    	System.out.println("testing lc2");
	      result = DriverManager.getConnection(DB_CONN_STRING, USER_NAME, PASSWORD);
	      System.out.println("catalog " + result.getCatalog());
	    }
	    catch (SQLException e){
	    	e.printStackTrace();
	       log( "Driver loaded, but cannot connect to db: " + DB_CONN_STRING);
	    }
	    
	    return result;
	  }
		public void imageWrite(Connection con) {
			try {
				System.out.println("test 3");

			File file = new File("C:/Users/Lasana/Documents/panda.pdf");
			FileInputStream io = new FileInputStream(file);
			System.out.println("test 4");
			String sql = "insert into med_recs(idmed_recs, person_id, image) Values(null,?,?);";
			String query = "insert into image(IMG) values(?)";
			java.sql.PreparedStatement stmt = con.prepareStatement(sql);
			System.out.println("test 5");
			stmt.setString(2, "3");
			stmt.setBinaryStream(3, (InputStream)io,(int)file.length());
			stmt.executeUpdate();
			System.out.println("test 6");
			}
			catch(Exception ex) {
			System.out.println(ex.getMessage());
			}
			}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("test 1");
		Connection con = DBConnection.getSimpleConnection();
		System.out.println("test 2");
		DBConnection dcon = new DBConnection();
		dcon.imageWrite(con);
		try {
			System.out.println("test 3");

		File file = new File("C:/Users/Lasana/Documents/panda.pdf");
		FileInputStream io = new FileInputStream(file);
		System.out.println("test 4");
		String sql = "select * from app_user where password;";
		String query = "insert into image(IMG) values(?)";
		java.sql.PreparedStatement stmt = con.prepareStatement(sql);
		System.out.println("test 5");
		stmt.setString(2, "3");
		stmt.setBinaryStream(3, (InputStream)io,(int)file.length());
		stmt.executeUpdate();
		System.out.println("test 6");
		}
		catch(Exception ex) {
		System.out.println(ex.getMessage());
		}
		}

}
