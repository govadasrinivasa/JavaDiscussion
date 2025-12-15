package com.jt.jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTest {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		String propertyFile ="db.properties";
		Properties prop = new Properties();
		ResultSet rs = null;
		
		try (InputStream input = JDBCTest.class.getClassLoader().getResourceAsStream(propertyFile)) {
            if (input == null) {
                System.out.println("Sorry, unable to find " + propertyFile);
                return;
            }
            prop.load(input);
		}catch (Exception e) {
			// TODO: handle exception
		}
		Class.forName(prop.getProperty("drivername"));
		Connection conn = DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("username"),prop.getProperty("password"));
		Statement stmt = conn.createStatement();
		displayData(stmt, rs);
		insertRecord(stmt, rs);
		displayData(stmt, rs);
	}
	
	static void displayData(Statement stmt, ResultSet rs) throws SQLException {
		rs = stmt.executeQuery("select * from mybank");
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCount = rsmd.getColumnCount();
        System.out.println("Total number of columns: " + columnCount);
        for (int i = 1; i <= columnCount; i++) {
            System.out.println("\nColumn #" + i);
            // Get column name
            System.out.println(" Name: " + rsmd.getColumnName(i));
            // Get column label (often same as name, but can be an alias, use for displays)
            System.out.println(" Label: " + rsmd.getColumnLabel(i));
            // Get database specific type name
            System.out.println(" SQL Type Name: " + rsmd.getColumnTypeName(i));
            // Check if nullable
            System.out.println(" Is Nullable: " + (rsmd.isNullable(i) == ResultSetMetaData.columnNullable ? "true" : "false"));
        }
		
		while(rs.next()) {
			System.out.print(rs.getString(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getDouble(3)+"\t");
			System.out.println(rs.getString(4));
		}
	}
	
	static void insertRecord(Statement stmt, ResultSet rs){
		// insert new record(s)
	}

}
