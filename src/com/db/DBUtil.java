package com.db;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	 private static Connection conn=null;
	 private static final String USERNAME="sa";
	 private static final String PASSWORD="753zxc";
	 private static final String URL="jdbc:sqlserver://localhost:1433;DatabaseName=users";
	static{
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
			conn=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		return conn;
	}
	
}
