package org.bellotech.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.bellotech.DatabaseConfig;
import org.bellotech.Entity.User;


public class UserModel {
	
	
	public List<User> listuser(){
		
		List<User> listusers = new ArrayList<>();
		
		
		//connect the object 
		Connection connect = DatabaseConfig.getConnection();
		Statement statement = null;
		ResultSet rs = null;
		
		//create db 
		
		String query = "select* from user ";
		
		try {
			statement = connect.createStatement();
			//Execution of the Statement 
			
			rs = statement.executeQuery(query);
			while(rs.next());
			listusers.add(new User(rs.getInt("user_id"), rs.getString("username"), rs.getString("projectName"), rs.getString("project")));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		return listusers;
		
	}

}
