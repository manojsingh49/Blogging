package com.multiplexmoments.blog.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.multiplexmoments.blog.service.AuthenticationService;

@RestController
public class AuthenticationController {
	private AuthenticationService authenticationService;
	
	  @PostMapping("/login")
	  public String login(@RequestBody LoginRequest loginRequest) {
		    String username = loginRequest.getUserName();
		    String password = loginRequest.getPassword();
		    if (authenticationService.login(username, password)) {
		        return "Login successful";
		    } else {
		        return "Invalid username or password";
		    }
		}
	   
	

	
	
	

	


}
