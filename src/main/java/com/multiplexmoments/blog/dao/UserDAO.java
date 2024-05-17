package com.multiplexmoments.blog.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.multiplexmoments.blog.entity.User;
@Repository
public interface UserDAO extends JpaRepository<User, Long>{

	Optional<User> findByUserName(String userName);
	

}
