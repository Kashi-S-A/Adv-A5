package com.tyss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/test?user=postgres&password=root";

		try {
			Class.forName(driver);

			Connection connection = DriverManager.getConnection(url);

			Statement stm = connection.createStatement();

			String delete = "DELETE FROM user_info WHERE name='Manga'";

			System.out.println(stm.executeUpdate(delete));

			connection.close();

			System.out.println("record is delete and conn is closed");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
