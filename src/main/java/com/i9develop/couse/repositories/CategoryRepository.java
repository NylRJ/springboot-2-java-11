package com.i9develop.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.i9develop.couse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
