package com.replenish.task.models;

public class TaskType {
	
	private long ID;
	
	public enum Title {
	    Stocker_Role,
	    Unloader_Role,
	    Warehouse_Role,
	    Store_Role,
	}
	
	public String Description;
	
}
