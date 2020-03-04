package com.byteworks.TaskDeliveryApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.byteworks.TaskDeliveryApp.model.Todo;
import com.byteworks.TaskDeliveryApp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
	User findByUserName(String user);
	List<User> findAll();
}
