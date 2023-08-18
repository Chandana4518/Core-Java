package com.xworkz.model.app.repository;

import com.xworkz.model.app.dto.CustomerDTO;

public interface CustomerRepository {
	
	int TOTAL_CUSTOMERS=5;
	
	void save(CustomerDTO customerDTO);
	
	public CustomerDTO findByCustomerName(String name);
	
	public CustomerDTO findByCustomerAge(int age);
	
	public CustomerDTO findByCustomerLocation(String location);
	
	public CustomerDTO[] readAll();
	
	

}
