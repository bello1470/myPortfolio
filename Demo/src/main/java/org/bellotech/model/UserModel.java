package org.bellotech.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.bellotech.DatabaseConfig;
import org.bellotech.Entity.User;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;

public class UserModel {

	public List<User> listuser() {

		List<User> listusers = new ArrayList<>();

		// connect the object
		Connection connect = DatabaseConfig.getConnection();
		Statement statement = null;
		ResultSet rs = null;

		// create db

		String query = "Select* from users ";

		try {
			statement = connect.createStatement();
			// Execution of the Statement

			rs = statement.executeQuery(query);
			while (rs.next()) {
				listusers.add(new User(rs.getInt("user_id"), rs.getString("username"), rs.getString("projectName"),
						rs.getString("project")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listusers;

	}

	public void addUser(User newUser) {

		Connection connect = null;
		PreparedStatement stmt = null;

		try {
			connect = DatabaseConfig.getConnection();

			String username = newUser.getUsername();
			String projectName = newUser.getProjectName();
			String project = newUser.getProject();

			String query = "insert into users (username, projectName, project) values(?,?,?)";
			connect.prepareCall(query);
			stmt.setString(1, username);
			stmt.setString(2, projectName);
			stmt.setString(3, project);

			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateUser(User updateUser) {

		Connection connect = null;
		PreparedStatement stmt = null;
		try {
			connect = DatabaseConfig.getConnection();
			int user_id = updateUser.getUser_id();
			String username = updateUser.getUsername();
			String projectName = updateUser.getProjectName();
			String project = updateUser.getProject();

			String query = "update users set username = ?, projectName= ?, project = ?, where user_id = ?";
			connect.prepareStatement(query);
			stmt.setString(1, username);
			stmt.setString(2, projectName);
			stmt.setString(3, project);
			stmt.setInt(4, user_id);
			stmt.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void deleteUser(int user_id) {

		Connection connect = null;
		PreparedStatement stmt = null;

		try {

			connect = DatabaseConfig.getConnection();

			String query = "delete from users where user_id=? ";
			connect.prepareStatement(query);

			stmt.setInt(1, user_id);
			stmt.execute();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
