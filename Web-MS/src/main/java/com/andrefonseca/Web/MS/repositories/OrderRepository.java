package com.andrefonseca.Web.MS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrefonseca.Web.MS.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
}