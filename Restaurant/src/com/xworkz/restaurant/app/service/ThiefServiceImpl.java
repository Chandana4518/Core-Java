package com.xworkz.restaurant.app.service;

import com.xworkz.restaurant.app.dto.ThiefDTO;

public class ThiefServiceImpl implements ThiefService{

	@Override
	public void validateAndSave(ThiefDTO thiefDTO) {
		if(thiefDTO!=null)
		{
			System.out.println("Valid data ,can save");
			System.out.println("Valid Args :" +thiefDTO);
			String specialization=thiefDTO.getSpecialization();
			int exp=thiefDTO.getExp();
			int age=thiefDTO.getAge();
			String gangName=thiefDTO.getGangName();
			int totalCases=thiefDTO.getTotalCases();
			
			if(specialization!=null&&!specialization.isEmpty()&&specialization.length()>3&&specialization.length()<20)
			{
				System.out.println("Valid Specialization...");
			}
			else
			{
				System.err.println("Invalid Specialization...");
			}
			
			if(exp!=0&&exp>0&&exp<150)
			{
				System.out.println("Valid exp...");
			}
			else
			{
				System.err.println("Invalid exp...");
			}
			
			if(age!=0&&age>0&&age<150)
			{
				System.out.println("Valid age...");
			}
			else
			{
				System.err.println("Invalid age...");
			}
			
			if(gangName!=null&&!gangName.isEmpty()&&gangName.length()>3&&gangName.length()<20)
			{
				System.out.println("Valid gangName...");
			}
			else
			{
				System.err.println(" Invalid gangName...");
			}
			
			if(totalCases!=0&&totalCases>0&&totalCases<500)
			{
				System.out.println("Valid totalCases...");
			}
			else
			{
				System.err.println("Invalid totalCases...");
			}
		}
		else
		{
			System.err.println("Invalid data,can't save..");
		}
		
	}

}
