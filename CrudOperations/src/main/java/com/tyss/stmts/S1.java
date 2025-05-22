package com.tyss.stmts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class S1 {

	public static void main(String[] args) {

		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/test?user=postgres&password=root";

		try {
			Class.forName(driver);
			
			Connection con = DriverManager.getConnection(url);
			
			String insert = "INSERT INTO user_info VALUES(?,?,?,?)";
			
			PreparedStatement pstm = con.prepareStatement(insert);
			pstm.setInt(1, 6);
			pstm.setString(2, "Dingi");
			pstm.setString(3, "dingi@gmail.com");
			pstm.setLong(4, 2345678);
			
			pstm.execute();
			
			con.close();
			
			System.out.println("data is inserted");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
