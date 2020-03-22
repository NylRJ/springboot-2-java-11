package com.i9develop.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.i9develop.couse.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {
	

}
