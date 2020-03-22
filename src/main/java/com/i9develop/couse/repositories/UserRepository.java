package com.i9develop.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.i9develop.couse.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
	

}
