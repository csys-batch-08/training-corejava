package com.javaprojectsample.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionUtil {

	public static Connection getDbConnect() {
		Connection con = null;
		try {
			// load driver may throw Class Not Found Exception
			Class.forName("oracle.jdbc.OracleDriver");
			// get Connection may throw Sql Exception
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");

		} 
		//catch block to handle the exception
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return con;
	}

}
