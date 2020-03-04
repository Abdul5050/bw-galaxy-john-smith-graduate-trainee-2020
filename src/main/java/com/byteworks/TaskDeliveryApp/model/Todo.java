package com.byteworks.TaskDeliveryApp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "todos")
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String userName;
	private String adminUserName;

	@Size(min = 10, message = "Enter at least 10 Characters...")
	private String description;
	private String shortDescription;

	private Date targetDate;
	
	public Todo() {
		super();
	}

	public Todo(String user, String shortdesc, String desc,String admin, Date targetDate, boolean isDone) {
		super();
		this.userName = user;
		this.shortDescription = shortdesc;
		this.description = desc;
		this.adminUserName = admin;
		this.targetDate = targetDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getAdminUserName() {
		return adminUserName;
	}

	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortdescription) {
		this.shortDescription = shortdescription;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
}