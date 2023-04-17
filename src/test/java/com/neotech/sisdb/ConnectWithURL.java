package com.neotech.sisdb;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectWithURL {

	public static String dbUrl = "jdbc:sqlserver://sis.neotechacademy.com:1433; "
			+ "databaseName=Test; user=SisLogin; password=Neotech#2022; ";

	public static void main(String[] args) throws SQLException {

		Connection conn = DriverManager.getConnection(dbUrl);

		// Information about Database
		DatabaseMetaData dbMeta = conn.getMetaData();

		String dbName = dbMeta.getDatabaseProductName();
		String dbVersion = dbMeta.getDatabaseProductVersion();

		System.out.println(dbName + " -> " + dbVersion);

		System.out.println("------------------------------------------------");

		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery("SELECT * FROM STAFF WHERE LastName LIKE 'AL%'");

		// Information about ResultSet
		ResultSetMetaData rsMeta = rs.getMetaData();

		// How many columns there are?
		int columnSize = rsMeta.getColumnCount();
		System.out.println("columnSize -> " + columnSize);

		// What is the NAME of the fifth column?
		String columnName5 = rsMeta.getColumnName(5);
		System.out.println("columnName5 -> " + columnName5);

		// What is the TYPE of the fifth column?
		String columnType5 = rsMeta.getColumnTypeName(5);
		System.out.println("columnType5 -> " + columnType5);

		System.out.println("------------------------------------------------");

		for (int i = 1; i <= columnSize; i++) {
			String colName = rsMeta.getColumnName(i);
			String colType = rsMeta.getColumnTypeName(i);

			System.out.println(colName + " -> " + colType);
		}

		rs.close();
		st.close();
		conn.close();

	}

}
