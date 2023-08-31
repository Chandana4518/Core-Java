package com.xworkz.crudOperations.repository;

import com.xworkz.crudOperations.dto.PrimeMinisterDTO;

public interface PrimeMinisterRepository {
	
	int TOTAL_DATA=2;
	
	void save(PrimeMinisterDTO primeMinisterDTO);
	
	
	PrimeMinisterDTO findByName(String name);

}
