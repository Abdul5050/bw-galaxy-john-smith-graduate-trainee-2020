package com.byteworks.TaskDeliveryApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.byteworks.TaskDeliveryApp.model.User;

public interface UserRepo extends JpaRepository<User, Long>{
	List<User> findByUserName(String user);
	List<User> findByAdminUserName(String user);
}
