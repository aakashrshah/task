package com.replenish.task.models;

import java.util.List;

public class Task {
	
	private long ID;
	//Name, Description,
	
	private String task_notes;
	private boolean task_feedback;
	
	private TaskStatus task_status;
	private TaskFrequency task_frequency;
	private TaskPriority task_priority;
	private TaskType task_type;
	private TaskItem task_item;
	
	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getTask_notes() {
		return task_notes;
	}

	public void setTask_notes(String task_notes) {
		this.task_notes = task_notes;
	}

	public boolean isTask_feedback() {
		return task_feedback;
	}

	public void setTask_feedback(boolean task_feedback) {
		this.task_feedback = task_feedback;
	}

	public TaskStatus getTask_status() {
		return task_status;
	}

	public void setTask_status(TaskStatus task_status) {
		this.task_status = task_status;
	}

	public TaskFrequency getTask_frequency() {
		return task_frequency;
	}

	public void setTask_frequency(TaskFrequency task_frequency) {
		this.task_frequency = task_frequency;
	}

	public TaskPriority getTask_priority() {
		return task_priority;
	}

	public void setTask_priority(TaskPriority task_priority) {
		this.task_priority = task_priority;
	}

	public TaskType getTask_type() {
		return task_type;
	}

	public void setTask_type(TaskType task_type) {
		this.task_type = task_type;
	}

	public TaskItem getTask_item() {
		return task_item;
	}

	public void setTask_item(TaskItem task_item) {
		this.task_item = task_item;
	}

	public Long getTask_assigned_by() {
		return task_assigned_by;
	}

	public void setTask_assigned_by(Long task_assigned_by) {
		this.task_assigned_by = task_assigned_by;
	}

	public List<Long> getTask_assigned_to() {
		return task_assigned_to;
	}

	public void setTask_assigned_to(List<Long> task_assigned_to) {
		this.task_assigned_to = task_assigned_to;
	}

	public int getTask_recommended_priority() {
		return task_recommended_priority;
	}

	public void setTask_recommended_priority(int task_recommended_priority) {
		this.task_recommended_priority = task_recommended_priority;
	}

	private Long task_assigned_by;
	private List<Long> task_assigned_to;
	
	private int task_recommended_priority;
	

}
