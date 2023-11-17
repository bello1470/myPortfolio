package org.bellotech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DatabaseConfig {
	public static Connection getConnection()  {
		
	      String url = "jdbc:mysql://localhost:3306/table?useSSL=false";
	        String user = "root";
	        String password = "Musteroy@1";
	        try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        Connection con = null;
			try {
				con = DriverManager.getConnection(url, user,password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return con;
		
	}

}
