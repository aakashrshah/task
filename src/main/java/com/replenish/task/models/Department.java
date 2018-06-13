package com.replenish.task.models;

public class Department {
	private long ID; 

	public enum department{
	    Stocker_Department,
	    Unloader_Department,
	    Warehouse_Department,
	    Store_Department
	}
	
	public String description;

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
