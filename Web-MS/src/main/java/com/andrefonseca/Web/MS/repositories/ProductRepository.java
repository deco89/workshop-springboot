package com.andrefonseca.Web.MS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrefonseca.Web.MS.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
