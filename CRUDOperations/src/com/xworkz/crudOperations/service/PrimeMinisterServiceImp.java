package com.xworkz.crudOperations.service;

import com.xworkz.crudOperations.dto.PrimeMinisterDTO;
import com.xworkz.crudOperations.repository.PrimeMinisterRepository;
import com.xworkz.crudOperations.util.ValidateUtil;

public class PrimeMinisterServiceImp implements PrimeMinisterService {
	
	private PrimeMinisterRepository primeMinisterRepository;
	
	public PrimeMinisterServiceImp(PrimeMinisterRepository primeMinisterRepository)
	{
		this.primeMinisterRepository=primeMinisterRepository;
	}

	@Override
	public boolean validateAndSave(PrimeMinisterDTO primeMinisterDTO) {
		if(primeMinisterDTO!=null)
		{
			System.out.println("Valid data,can save..");
			System.out.println("Arg passed :" +primeMinisterDTO);
			String name=primeMinisterDTO.getName();
			int id=primeMinisterDTO.getId();
			String country=primeMinisterDTO.getCountry();
			String partyName=primeMinisterDTO.getPartyName();
			
			if(ValidateUtil.validateString(partyName))
			{
				System.out.println("PartyName is valid");
			}
			else
			{
				System.err.println("PartyName is Invalid");
				return false;
			}
			if(ValidateUtil.validateInt(id))
			{
				System.out.println("id is Valid");
			}
			else
			{
				System.err.println("id is Invalid");
				return false;
			}
			if(ValidateUtil.validateString(country))
			{
				System.out.println("Country name is Valid");
			}
			else
			{
				System.err.println("Country name is Invalid");
				return false;
			}
			if(ValidateUtil.validateString(name))
			{
				System.out.println("Name is valid");
			}
			else
			{
				System.err.println("Name is Invalid");
				return false;
			}
			System.out.println("All data of the Prime Minister is Valid");
			primeMinisterRepository.save(primeMinisterDTO);
			return true;
			
		}
		System.err.println("Invalid data,can't store..");
		return false;
	}

	@Override
	public PrimeMinisterDTO findByName(String name) {
		boolean isValid=ValidateUtil.validateString(name);
		if(isValid)
		{
			System.out.println("Valid name");
			PrimeMinisterDTO isFound=primeMinisterRepository.findByName(name);
			return isFound;
		}
		System.err.println("Invalid name");
		return null;
		
	}

}
