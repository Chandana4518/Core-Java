package com.xworkz.restaurant.app.service;

import com.xworkz.restaurant.app.dto.CookDTO;

public class CookServiceImpl implements CookService {

	@Override
	public void validateAndSave(CookDTO cookDTO) {
		
		if(cookDTO!=null)
		{
			System.out.println("Valid data ,can save");
			System.out.println("Valid Args :" +cookDTO);
			String specialItem=cookDTO.getSpecialItem();
			String hotelName=cookDTO.getHotelName();
			String gender=cookDTO.getGender();
			int salary=cookDTO.getSalary();
		
		if(specialItem!=null&&!specialItem.isEmpty()&&specialItem.length()>3&&specialItem.length()<20)
		{
			System.out.println("Valid specialItem...");
		}
		else
		{
			System.err.println("Invalid specialItem...");
		}
		
		if(hotelName!=null&&!hotelName.isEmpty()&&hotelName.length()>3&&hotelName.length()<20)
		{
			System.out.println("Valid hotelName...");
		}
		else
		{
			System.err.println("Invalid hotelName...");
		}
		
		if(gender!=null&&!gender.isEmpty()&&gender.length()>3&&gender.length()<20)
		{
			System.out.println("Valid gender...");
		}
		else
		{
			System.err.println(" Invalid gender...");
		}
		if(salary!=0&&salary>0&&salary<100000)
		{
			System.out.println("Valid salary...");
		}
		else
		{
			System.err.println("Invalid salary...");
		}
		}
		else
		{
			System.err.println("Invalid data,can't save..");
		}


	}

}
