package com.tyss.closeConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class A {

	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/test?user=postgres&password=roo";

		try {
			Class.forName(driver);
			System.out.println("driver loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try (Connection con = DriverManager.getConnection(url);)
		{
			Statement stm = con.createStatement();
			
			stm.execute("select * from user_info");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
