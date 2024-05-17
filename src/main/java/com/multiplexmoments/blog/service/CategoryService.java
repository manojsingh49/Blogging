package com.multiplexmoments.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multiplexmoments.blog.dao.CategoryDAO;
import com.multiplexmoments.blog.entity.Category;
@Service
public class CategoryService {
	@Autowired
	private CategoryDAO categoryDAO;
	 
	public CategoryService(CategoryDAO categoryDAO) {
	        this.categoryDAO = categoryDAO;
	    }
	
	public Category createCategory(Category category) {
		return categoryDAO.save(category);
	}
	public Category getCategoryById(Integer categoryId) {
		return categoryDAO.findById(categoryId).get();
	}
	public Iterable <Category>getAllCategory(){
		return categoryDAO.findAll();
		
	}
	public void deleteCategory(Integer categoryId) {
		categoryDAO.deleteById(categoryId);
		
	}
	public Category updateCategory(Integer categoryId, String newCategoryName) {
		Category categoryFromDb = categoryDAO.findById(categoryId).get();
		categoryFromDb.setCategoryName(newCategoryName);
		Category updateCategory = categoryDAO.save(categoryFromDb);
		return updateCategory;
		
		
	}
	

}
