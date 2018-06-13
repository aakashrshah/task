package com.replenish.task.models;

//Class for dealing with a particular product.
public class TaskItem {
	
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
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	private long ID;
	private String name;
	public String Description;
	
	
}
