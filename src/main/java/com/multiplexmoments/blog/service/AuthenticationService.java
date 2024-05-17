package com.multiplexmoments.blog.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multiplexmoments.blog.dao.UserDAO;
import com.multiplexmoments.blog.entity.User;

@Service
public class AuthenticationService {
	private boolean isAuthenticated;
	
	@Autowired
	private UserDAO userDAO;
	
	public boolean login(String username, String password) {
		Optional<User> userOptional = userDAO.findByUserName(username);
		 if (userOptional.isPresent()) {
	            User user = userOptional.get();
	            if (user.getPassword().equals(password)) {
	                isAuthenticated = true;
	            } else {
	                isAuthenticated = false;
	            }
	        } else {
	            isAuthenticated = false;
	        }
	        return isAuthenticated;
	    }

	    public void logout() {
	        isAuthenticated = false;
	    }
	

}
