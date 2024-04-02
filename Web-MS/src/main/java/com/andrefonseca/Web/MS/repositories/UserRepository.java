package com.andrefonseca.Web.MS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrefonseca.Web.MS.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
