package com.i9develop.couse.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.i9develop.couse.entities.Product;
import com.i9develop.couse.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository userRepository;
	
	public List<Product> findAll(){
		
		return userRepository.findAll();
	}
	
	public Product findById(Long id) {
		
		Optional<Product> obj = userRepository.findById(id);
		
		return obj.get();
	}

}
