package com.byteworks.TaskDeliveryApp.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.byteworks.TaskDeliveryApp.model.Role;
import com.byteworks.TaskDeliveryApp.model.Todo;
import com.byteworks.TaskDeliveryApp.model.User;
import com.byteworks.TaskDeliveryApp.service.ITodoService;
import com.byteworks.TaskDeliveryApp.service.UserService;
import com.byteworks.TaskDeliveryApp.service.UserServiceImpl;
import com.byteworks.TaskDeliveryApp.web.dto.UserRegistrationDto;

@Controller
public class UserController {

	@Autowired
	private UserService userserv;
	
	@Autowired
	private ITodoService todoService;
	
	@Autowired
    private BCryptPasswordEncoder passwordEncoder;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// Date - dd/MM/yyyy
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	@RequestMapping(value = "/add-user", method = RequestMethod.GET)
	public String showAddUserPage(ModelMap model) {
		model.addAttribute("addUser", new User());
		return "addnewuser";
	}
	@RequestMapping(value = "/add-user", method = RequestMethod.POST)
	public String addUser(ModelMap model, @Valid User userDto, BindingResult result) {

		User existing = userserv.findByEmail(userDto.getEmail());
        if (existing != null){
            result.rejectValue("email", null, "There is already an account registered with that email address");
            return "addnewuser";
        }
        
        User user = userserv.findByUserName(userDto.getUserName());
        if (user != null){
            result.rejectValue("userName", null, "There is already an account registered with that username");
            return "addnewuser";
        }
		if (result.hasErrors()) {
			return "addnewuser";
		}

		//user.setUserName(getLoggedInUserName(model));
Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
       userDto.setAdminUserName(((UserDetails) principal).getUsername());
       userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
       userDto.setRoles(Arrays.asList(new Role("ROLE_USER")));
		userserv.saveUser(userDto);
		return "redirect:/list-users";
	}
	@RequestMapping(value = "/list-users", method = RequestMethod.GET)
	public String showUsers( ModelMap model) {
		String name = getLoggedInUserName(model);
		
		model.put("users", userserv.getUsersByAdminUserName(name));
		return "users";
	}
	@RequestMapping(value = "/assign-users", method = RequestMethod.GET)
	public String assignUsers( ModelMap model) {
		String name = getLoggedInUserName(model);
		
		model.put("users", userserv.getUsersByAdminUserName(name));
		//Todo iid = todoService.getTodoById(id).get();
		//model.put("ids", iid);
		return "assign-users";
	}
	
	
	@RequestMapping(value = "/delete-user", method = RequestMethod.GET)
	public String deleteUser(@RequestParam long id) {
		userserv.deleteUser(id);
		// service.deleteTodo(id);
		return "redirect:/list-users";
	}
	
	@RequestMapping(value = "/update-user", method = RequestMethod.GET)
	public String showUpdateUserPage(@RequestParam long id, ModelMap model) {
		User user = userserv.getUserById(id).get();
		model.put("updateuser", user);
		return "updateuser";
	}

	@RequestMapping(value = "/update-user", method = RequestMethod.POST)
	public String updateUser(@ModelAttribute("updateuser") @Valid User user, BindingResult result) {

		if (result.hasErrors()) {
			return "updateuser";
		}
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String u = ((UserDetails) principal).getUsername();

		user.setAdminUserName(u);
		user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(Arrays.asList(new Role("ROLE_USER")));
		userserv.updateUser(user);
		return "redirect:/list-users";
	}

	private String getLoggedInUserName(ModelMap model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}

		return principal.toString();
	}
}
