package com.myapp.myapp.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.myapp.myapp.entity.Customer;


import dto.OrderResponse;


public interface CustomerRepo extends JpaRepository<Customer,Integer> {
	
	@Query("SELECT new dto.OrderResponse(c.name,p.productName) from CUSTOMER c JOIN c.products p")
	public List<OrderResponse> getInformation();

}
