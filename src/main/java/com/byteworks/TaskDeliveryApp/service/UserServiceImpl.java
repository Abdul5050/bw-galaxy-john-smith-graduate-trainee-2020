package com.byteworks.TaskDeliveryApp.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

//import com.byteworks.TaskDeliveryApp.hibernate.HibernateUtil;
import com.byteworks.TaskDeliveryApp.model.Role;
import com.byteworks.TaskDeliveryApp.model.Todo;
import com.byteworks.TaskDeliveryApp.model.User;
import com.byteworks.TaskDeliveryApp.repository.UserRepo;
import com.byteworks.TaskDeliveryApp.repository.UserRepository;
import com.byteworks.TaskDeliveryApp.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService {

	
    
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    
    

    public User findByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public User save(UserRegistrationDto registration){
    	Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
        User user = new User();
        user.setFirstName(registration.getFirstName());
        user.setUserName(registration.getUserName());
        user.setAdminUserName(((UserDetails) principal).getUsername());
        user.setLastName(registration.getLastName());
        user.setEmail(registration.getEmail());
        user.setPassword(passwordEncoder.encode(registration.getPassword()));
        user.setRoles(Arrays.asList(new Role("ROLE_USER")));
        return userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user =  userRepository.findByUserName(email);
        if (user == null){
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getUserName(),
                user.getPassword(),
                mapRolesToAuthorities(user.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
        return roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());
    }

    @Override
	public Optional<User> getUserById(long id) {
		return userRepository.findById(id);
	}
    
    @Override
	public void updateUser(User user) {
    	userRepository.save(user);
	}

	@Override
	public User findByUserName(String user) {
		// TODO Auto-generated method stub
		return userRepository.findByUserName(user);
	}

	@Override
	public List<User> getUsersByAdminUserName(String user) {
		// TODO Auto-generated method stub
		return  userRepo.findByAdminUserName(user);
		
	}
	
	@Override
	public void deleteUser(long id) {
		Optional<User> user = userRepository.findById(id);
		if (user.isPresent()) {
			userRepository.delete(user.get());
		}
	}

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
	}
	
}
