package com.tyss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {

		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/test?user=postgres&password=root";

		try {
			// step 1 : Load the driver
			Class.forName(driver);

			System.out.println("driver is loaded");

			// step 2 : Create connection
			Connection connection = DriverManager.getConnection(url);

			System.out.println("connection is created");

			// step 3 : Create Statement
			Statement stm = connection.createStatement();

			System.out.println("statement is created");

			String insert = "INSERT INTO user_info VALUES(10,'Laxman','laxman@gmail.com',65678)";

			// step 4 : Execute the query
			int a = stm.executeUpdate(insert);
			System.out.println(a);

			// step 5 : Close the connection
			connection.close();

			System.out.println("record is inserted and connection is closed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
