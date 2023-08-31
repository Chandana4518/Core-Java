package com.xworkz.crudOperations.runner;

import com.xworkz.crudOperations.dto.PrimeMinisterDTO;
import com.xworkz.crudOperations.repository.PrimeMinisterRepository;
import com.xworkz.crudOperations.repository.PrimeMinisterRepositoryImpl;
import com.xworkz.crudOperations.service.PrimeMinisterService;
import com.xworkz.crudOperations.service.PrimeMinisterServiceImp;

public class PrimeMinisterRunner {

	public static void main(String[] args) {
		
		PrimeMinisterDTO primeMinisterDTO=new PrimeMinisterDTO(1234,"Modi","India","BJP");
		
		PrimeMinisterRepository primeMinisterRepository=new PrimeMinisterRepositoryImpl();
		
		PrimeMinisterService primeMinisterService=new PrimeMinisterServiceImp(primeMinisterRepository);
		
		boolean stored=primeMinisterService.validateAndSave(primeMinisterDTO);
		if(stored)
		{
			System.out.println("Saved :" +stored);
		}
		else
		{
			System.out.println("Not Saved :" +stored);
		}
		
		PrimeMinisterDTO foundData=primeMinisterService.findByName("Modi");
		System.out.println(foundData);

	}

}
