package com.tyss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch {

	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/test?user=postgres&password=root";

		try {
			Class.forName(driver);

			Connection connection = DriverManager.getConnection(url);

			Statement stm = connection.createStatement();

			String select = "SELECT * FROM user_info WHERE uid=30";

			int rs = stm.executeUpdate(select);
			
//			System.out.println("============User==============");
//
//			if (rs.next()) {
//				System.out.println(rs.getInt(1));
//				System.out.println(rs.getString(2));
//				System.out.println(rs.getString(3));
//				System.out.println(rs.getLong(4));
//
//			} else {
//				System.out.println("Not found");
//			}

//			while (rs.next()) {
//
//				System.out.println(rs.getInt(1));
//				System.out.println(rs.getString(2));
//				System.out.println(rs.getString(3));
//				System.out.println(rs.getLong(4));
//
//				System.out.println("====================");
//			}

			connection.close();

			System.out.println("records fetched and conn is closed");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
