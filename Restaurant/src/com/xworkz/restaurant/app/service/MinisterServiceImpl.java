package com.xworkz.restaurant.app.service;

import com.xworkz.restaurant.app.dto.MinisterDTO;

public class MinisterServiceImpl implements MinisterService {

	@Override
	public void validateAndSave(MinisterDTO ministerDTO) {
		
		if(ministerDTO!=null)
		{
			System.out.println("Valid data ,can save");
			System.out.println("Valid Args :" +ministerDTO);
			String ministerName=ministerDTO.getMinisterName();
			int exp=ministerDTO.getExp();
			String designation=ministerDTO.getDesignation();
			String partyName=ministerDTO.getPartyName();
		
		if(ministerName!=null&&!ministerName.isEmpty()&&ministerName.length()>3&&ministerName.length()<20)
		{
			System.out.println("Valid name...");
		}
		else
		{
			System.err.println("Invalid name...");
		}
		
		if(exp!=0&&exp>0&&exp<150)
		{
			System.out.println("Valid exp...");
		}
		else
		{
			System.err.println("Invalid exp...");
		}
		
		if(designation!=null&&!designation.isEmpty()&&designation.length()>3&&designation.length()<20)
		{
			System.out.println("Valid designation...");
		}
		else
		{
			System.err.println("Invalid designation...");
		}
		
		if(partyName!=null&&!partyName.isEmpty()&&partyName.length()>3&&partyName.length()<20)
		{
			System.out.println("Valid partyName...");
		}
		else
		{
			System.err.println(" Invalid partyName...");
		}
		}
		else
		{
			System.err.println("Invalid data,can't save..");
		}

	}

}
