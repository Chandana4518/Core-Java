package com.xworkz.crudOperations.service;

import com.xworkz.crudOperations.dto.PrimeMinisterDTO;

public interface PrimeMinisterService {
	
	boolean validateAndSave(PrimeMinisterDTO primeMinisterDTO);
	
	PrimeMinisterDTO findByName(String name);

}
