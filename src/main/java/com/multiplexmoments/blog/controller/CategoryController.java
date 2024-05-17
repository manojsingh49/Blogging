package com.multiplexmoments.blog.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multiplexmoments.blog.entity.Category;
import com.multiplexmoments.blog.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
	private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
	
	@PostMapping(value ="/create")
	public Category createCategory(@RequestBody Category category) {
		return categoryService.createCategory(category);
		
	}
	@GetMapping(value = "/category/{categoryId}")
	public Category getCAtegoryById(@PathVariable("categoryId")Integer categoryId) {
		return categoryService.getCategoryById(categoryId);
	}
	@GetMapping(value ="/category/allcategory")
	public Iterable <Category>getAllCategory(){
		return categoryService.getAllCategory();
	}
	@DeleteMapping(value = "/category/{categoryId}")
	public void deleteCategory(@PathVariable ("categoryId")Integer categoryId) {
		categoryService.deleteCategory(categoryId);
	}
	@PutMapping(value = "/category/{categoryId}/{newCategoryName}")
	public Category updateCategory(@PathVariable("categoryId")Integer categoryId, @PathVariable("newCategoryName")String newCategoryName){
		return categoryService.updateCategory(categoryId, newCategoryName);
	}
	
	

}
