package org.bellotech.Entity;

public class User {
	
	private int user_id;
	private String username;
	private String projectName;
	private String project;
	

	
	public User(int user_id, String username, String projectName, String project) {
		this.user_id = user_id;
		this.username = username;
		this.projectName = projectName;
		this.project = project;
	}
	
	public User( String username, String projectName, String project) {
		
		this.username = username;
		this.projectName = projectName;
		this.project = project;
	}
	
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}

	
	
}