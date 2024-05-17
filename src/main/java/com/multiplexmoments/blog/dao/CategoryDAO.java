package com.multiplexmoments.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multiplexmoments.blog.entity.Category;


public interface CategoryDAO extends JpaRepository<Category, Integer>{

}
