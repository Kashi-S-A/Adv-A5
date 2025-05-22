package com.tyss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String url="jdbc:postgresql://localhost:5432/test?user=postgres&password=root";
		
		try {
			Class.forName(driver);
			
			Connection connection = DriverManager.getConnection(url);
			
			Statement stm = connection.createStatement();
			
			String update= "UPDATE user_info SET phone=123 WHERE name='Manga'";
			
			int result = stm.executeUpdate(update);
			
			System.out.println("The no of rows affectec : "+result);
			
			connection.close();
			
			System.out.println("record is updated and conn is closed");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
