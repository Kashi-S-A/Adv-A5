package com.tyss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch {

	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/test?user=postgres&password=roo";

		Connection connection = null;

		try {
			Class.forName(driver);
			System.out.println("driver is loaded");

			connection = DriverManager.getConnection(url);
			System.out.println("connection is created");

			Statement stm = connection.createStatement();
			System.out.println("statement is created");

			String select = "SELECT * FROM user_inf";

			stm.executeQuery(select);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection!=null) {
					connection.close();
					System.out.println("conn is closed");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
