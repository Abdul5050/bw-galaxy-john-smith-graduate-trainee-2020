package com.byteworks.TaskDeliveryApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.byteworks.TaskDeliveryApp.model.Todo;
import com.byteworks.TaskDeliveryApp.model.User;
import com.byteworks.TaskDeliveryApp.repository.UserRepository;
import com.byteworks.TaskDeliveryApp.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

	User findByUserName(String user);
	
	User findByEmail(String email);

    User save(UserRegistrationDto registration);

    List<User> getUsersByAdminUserName(String user);
    
    void deleteUser(long id);
    
    void updateUser(User user);
    
    Optional<User> getUserById(long id);
    
    void saveUser(User user);

    
}























