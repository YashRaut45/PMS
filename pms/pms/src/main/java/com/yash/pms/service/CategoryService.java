package com.yash.pms.service;

import com.yash.pms.entity.Category;
import com.yash.pms.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElseThrow();
    }

	public Category saveCategory(Category category) {
		 return categoryRepository.save(category);
		
	}
}
