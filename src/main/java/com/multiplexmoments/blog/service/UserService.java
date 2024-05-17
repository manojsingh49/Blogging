package com.multiplexmoments.blog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multiplexmoments.blog.dao.UserDAO;
import com.multiplexmoments.blog.entity.User;
@Service
public class UserService {
	@Autowired
	private UserDAO userDAO;
	
	
	public User createUser(User user) {
		return userDAO.save(user);
	}
	public List<User>getAllUsers(){
		return userDAO.findAll();	
		}

	 public void deleteUser(Long userId) {
	        userDAO.deleteById(userId);
	    }
	    public Optional<User> findUserByUsername(String username) {
	        return userDAO.findByUserName(username);
	    }
	    public String getPassword(String username) {
	        Optional<User> userOptional = userDAO.findByUserName(username);
	        return userOptional.map(User::getPassword).orElse(null);
	    }
	}


