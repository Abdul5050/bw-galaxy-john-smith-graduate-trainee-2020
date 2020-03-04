package com.byteworks.TaskDeliveryApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyWebMvcConfig extends WebMvcConfigurerAdapter {

	  @Override
	  public void addViewControllers(ViewControllerRegistry registry) {
	      registry.addViewController("/{spring:\\w+}")
	            .setViewName("forward:/");
	      registry.addViewController("/**/{spring:\\w+}")
	            .setViewName("forward:/");
	      //registry.addViewController("/{spring:\\w+}/**{spring:?!(\\.js|\\.css)$}")
	        //    .setViewName("forward:/");
	      //registry.addViewController("/admin").setViewName(
            //      "forward:/home");
          //registry.addViewController("/user").setViewName(
            //      "forward:/user");
	  }
	}
    
    













