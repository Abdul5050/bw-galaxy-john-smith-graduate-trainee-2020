package com.byteworks.TaskDeliveryApp.model;


import javax.persistence.*;

	@Entity
	public class AssignTask {

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    private Long userId;
	    private Long taskId;
	    
	    

	    public AssignTask() {
	    }

	    public AssignTask(Long userId, Long taskId) {
	        this.userId = userId;
	        this.taskId = taskId;
	    }
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }
	    public Long getUserId() {
	        return userId;
	    }

	    public void setUserId(Long id) {
	        this.userId = id;
	    }
	    public Long getTaskId() {
	        return taskId;
	    }

	    public void setTaskId(Long taskId) {
	        this.taskId = taskId;
	    }

	    

	    @Override
	    public String toString() {
	        return "AssignTask{" +
	        		"id=" + id +
	                "userId=" + userId +
	                ", taskId='" + taskId + '\'' +
	                '}';
	    }
	}
