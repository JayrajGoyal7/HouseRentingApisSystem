package com.project.house.services;

import java.util.List;


import com.project.house.payloads.CategoryDto;

public interface CategoryService {

	
	//create
	CategoryDto createCategory(CategoryDto categoryDto);
	
	//put
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	//delete
	void deleteCategory(Integer categoryId);
	
	//get
	CategoryDto getCategory(Integer categoryId);
	
	//getall
	List<CategoryDto> getCategories();
}
