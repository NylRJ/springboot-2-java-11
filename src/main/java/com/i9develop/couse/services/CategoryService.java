package com.i9develop.couse.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.i9develop.couse.entities.Category;
import com.i9develop.couse.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository userRepository;
	
	public List<Category> findAll(){
		
		return userRepository.findAll();
	}
	
	public Category findById(Long id) {
		
		Optional<Category> obj = userRepository.findById(id);
		
		return obj.get();
	}

}
