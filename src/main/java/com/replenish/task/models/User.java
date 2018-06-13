package com.replenish.task.models;

public class User {
	private long ID;
	private String name;
	//Description,
	
	private AdminRole user_roles;
	private Department user_department;
	
	private Location location;

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AdminRole getUser_roles() {
		return user_roles;
	}

	public void setUser_roles(AdminRole user_roles) {
		this.user_roles = user_roles;
	}

	public Department getUser_department() {
		return user_department;
	}

	public void setUser_department(Department user_department) {
		this.user_department = user_department;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	
}
