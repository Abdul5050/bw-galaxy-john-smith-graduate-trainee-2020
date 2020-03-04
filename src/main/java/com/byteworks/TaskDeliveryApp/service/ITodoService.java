package com.byteworks.TaskDeliveryApp.service;

import java.util.Date;

import java.util.List;
import java.util.Optional;

import com.byteworks.TaskDeliveryApp.model.Todo;

public interface ITodoService {

	List<Todo> getTodosByUser(String user);
	
	List<Todo> getTodosByAdminUserName(String user);

	Optional<Todo> getTodoById(long id);

	void updateTodo(Todo todo);

	void addTodo(String name, String shortdesc,String desc,String admin, Date targetDate, boolean isDone);

	void deleteTodo(long id);
	
	void saveTodo(Todo todo);

}












