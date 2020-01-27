package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
	
	
	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://mysqltest.cbevecjbhf34.us-east-1.rds.amazonaws.com/hb-01-one-to-one-uni?useSSL=false&serverTimezone=UTC";
		String user = "admin";
		String pass = "Daniel900628";
		
		
		try {
			System.out.println("Connecting to database: " + jdbcUrl);
			Connection myConn = 
					DriverManager.getConnection(jdbcUrl,user,pass);
			
			System.out.println("Connection successful!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
