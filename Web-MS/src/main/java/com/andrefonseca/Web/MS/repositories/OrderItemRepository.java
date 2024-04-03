package com.andrefonseca.Web.MS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrefonseca.Web.MS.entities.OrderItem;
import com.andrefonseca.Web.MS.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
	

}
