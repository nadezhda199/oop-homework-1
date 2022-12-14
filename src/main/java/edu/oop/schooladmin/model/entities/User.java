package edu.oop.schooladmin.model.entities;

public class User {
	private int userId;
	private String loginName;
	private String password;
	
	public User(int userId, String loginName, String password) {
		this.userId = userId;
		this.loginName = loginName;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
