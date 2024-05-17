package com.multiplexmoments.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multiplexmoments.blog.entity.Post;

public interface PostDAO extends JpaRepository<Post, Integer>{

}
