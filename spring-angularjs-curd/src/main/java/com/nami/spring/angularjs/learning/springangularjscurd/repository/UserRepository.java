package com.nami.spring.angularjs.learning.springangularjscurd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nami.spring.angularjs.learning.springangularjscurd.model.User;

@Repository
public interface  UserRepository extends JpaRepository<User, Long> {

	User findByName(String name);
	 // User findByName(String name);

	//User findOne(Long id);
}
