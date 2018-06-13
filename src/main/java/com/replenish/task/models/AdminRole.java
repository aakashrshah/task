package com.replenish.task.models;

public class AdminRole {
	
	private long ID; 
	
	public enum role{
	    Stocker_Role,
	    Unloader_Role,
	    Warehouse_Role,
	    Store_Role
	}
	
	public String Description;

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
}
