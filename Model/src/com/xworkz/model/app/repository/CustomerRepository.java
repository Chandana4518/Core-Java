package com.xworkz.model.app.repository;

import com.xworkz.model.app.dto.CustomerDTO;

public interface CustomerRepository {
	
	int TOTAL_CUSTOMERS=5;
	
	void save(CustomerDTO customerDTO);

}
