package com.xworkz.crudOperations.repository;

import com.xworkz.crudOperations.dto.PrimeMinisterDTO;

public class PrimeMinisterRepositoryImpl implements PrimeMinisterRepository {

	PrimeMinisterDTO[] dtos=new PrimeMinisterDTO[TOTAL_DATA];
	int temp=0;
	@Override
	public void save(PrimeMinisterDTO primeMinisterDTO) {
		
		if(temp<TOTAL_DATA)
		{
			System.out.println("Invoking save method in PrimeMinisterRepositoryImpl");
			this.dtos[temp]=primeMinisterDTO;
			System.out.println("The element stored at :" + temp);
			temp++;
		}
		else
		{
			System.err.println("Array is full,can't store..");
		}
	}

	@Override
	public PrimeMinisterDTO findByName(String name) {
	
		for(int index=0;index<temp;index++)
		{
			if(dtos[index].getName().equalsIgnoreCase(name))
			{
				System.out.println("Found name");
				return dtos[index];
			}
			System.out.println("Name is not matching moving to next index");
		}
		System.err.println("Name is not found");
		return null;
	}

}
