package jspForm.helper;

import java.sql.*;


public class ConnectionHandler {
	private static Connection con;
	
	public static Connection getConnection() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_form","Nischal","Nischal@123");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
