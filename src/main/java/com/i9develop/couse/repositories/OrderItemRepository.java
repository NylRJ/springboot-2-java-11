package com.i9develop.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.i9develop.couse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
	

}
