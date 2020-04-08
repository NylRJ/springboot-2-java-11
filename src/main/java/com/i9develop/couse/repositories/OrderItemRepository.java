package com.i9develop.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.i9develop.couse.entities.OrderItem;
import com.i9develop.couse.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
