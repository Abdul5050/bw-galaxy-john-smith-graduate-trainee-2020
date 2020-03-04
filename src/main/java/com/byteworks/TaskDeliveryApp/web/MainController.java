package com.byteworks.TaskDeliveryApp.web;

import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.byteworks.TaskDeliveryApp.model.User;
import com.byteworks.TaskDeliveryApp.repository.UserRepository;
import com.byteworks.TaskDeliveryApp.service.UserService;
import com.byteworks.TaskDeliveryApp.service.UserServiceImpl;
import com.byteworks.TaskDeliveryApp.web.dto.UserRegistrationDto;


@Controller
public class MainController {

	 
	//private UserService userService;
	
	//UserRepository userR;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	//@RequestMapping(method={RequestMethod.GET})
    public String root(ModelMap model) {
		    	//String name = getLoggedInUserName(model);
		//model.put("user", name);
    	//User u = userR.findByEmail(name);
	 //model.put("user", u.getFirstName());
        return "front";
    }
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
    public String admin(ModelMap model) {
		//To get all user roles:

			//org.springframework.security.core.Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

			//Set<String> roles = authentication.getAuthorities().stream()
			  //  .map(r -> r.getAuthority()).collect(Collectors.toSet());

			//To check if the user has a particular role, for example, ROLE_USER:

			//org.springframework.security.core.Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

			//boolean hasUserRole = authentication.getAuthorities().stream()
			         // .anyMatch(r -> r.getAuthority().equals("ROLE_USER"));
    	String name = getLoggedInUserName(model);
		model.put("user", name);
    	//User u = userR.findByEmail(name);
	 //model.put("user", u.getFirstName());
        return "home";
    }
    

    @GetMapping("/login")
    public String login(Model model) {
        return "log-in";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user";
    }
    
    private String getLoggedInUserName(ModelMap model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
			//return principal.toString();
		}

		return principal.toString();
	}
}
