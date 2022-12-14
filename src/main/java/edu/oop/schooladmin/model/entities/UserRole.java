package edu.oop.schooladmin.model.entities;

public class UserRole {
	private int roleId;
	private int userId;
	private String roleName;

	public UserRole(int roleId, int userId, String roleName) {
		this.roleId = roleId;
		this.userId = userId;
		this.roleName = roleName;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
