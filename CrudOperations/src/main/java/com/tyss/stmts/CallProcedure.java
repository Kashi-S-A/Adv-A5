package com.tyss.stmts;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallProcedure {
	public static void main(String[] args) {

		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/test?user=postgres&password=root";

		try {
			Class.forName(driver);

			Connection con = DriverManager.getConnection(url);

			String pro = "call test_procedure(?,?,?)";//command to call stored procedure

			CallableStatement cstm = con.prepareCall(pro);
			cstm.setInt(1, 102);
			cstm.setString(2, "Dingi");
			cstm.setString(3, "dingi@gmail.com");
			
			cstm.execute();

			con.close();

			System.out.println("data is inserted");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
