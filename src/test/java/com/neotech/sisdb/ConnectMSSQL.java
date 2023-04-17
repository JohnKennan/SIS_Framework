package com.neotech.sisdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectMSSQL {

	public static String dbUserName = "SisLogin";
	public static String dbPassword = "Neotech#2022";

	public static String dbUrl = "jdbc:sqlserver://sis.neotechacademy.com:1433;databaseName=Test";
	
	public static void main(String[] args) throws SQLException {
		
		Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		
		Statement st = conn.createStatement();
		
		ResultSet rs = st.executeQuery("SELECT * FROM STUDENT WHERE LastName = 'JACKSON'");
		
		while(rs.next()) {
			String fName = rs.getObject("FirstName").toString();
			String lName = rs.getObject("LastName").toString();
			String user = rs.getString("Username");
			String pass = rs.getString("Password");
			
			System.out.println(fName + " " + lName + " " + user + " " + pass);
		}
		rs.close();
		st.close();
		conn.close();
	}

}
