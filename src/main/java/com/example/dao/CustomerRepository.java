package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.CustomerEntity;
@Repository
public interface CustomerRepository  extends JpaRepository<CustomerEntity,Integer> {
	@Query("select c from CustomerEntity c where customerId=?1 and password=?2")
	CustomerEntity validateCustomer(int i, String password);

}
