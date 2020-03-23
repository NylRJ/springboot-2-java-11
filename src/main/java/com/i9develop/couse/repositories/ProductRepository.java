package com.i9develop.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.i9develop.couse.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
	

}
