package com.xworkz.restaurant.app.service;

import com.xworkz.restaurant.app.dto.CeoDTO;

public class CeoServiceImpl implements CeoService{

	@Override
	public void validateAndSave(CeoDTO ceoDTO) {
		
		if(ceoDTO!=null)
		{
			System.out.println("Valid data ,can save");
			System.out.println("Valid Args :" +ceoDTO);
			String name=ceoDTO.getName();
			String companyName=ceoDTO.getCompanyName();
			long salary=ceoDTO.getSalary();
			int experience=ceoDTO.getExperience();
		
		if(name!=null&&!name.isEmpty()&&name.length()>3&&name.length()<20)
		{
			System.out.println("Valid name...");
		}
		else
		{
			System.err.println("Invalid name...");
		}
		
		if(companyName!=null&&!companyName.isEmpty()&&companyName.length()>3&&companyName.length()<20)
		{
			System.out.println("Valid companyName...");
		}
		else
		{
			System.err.println("Invalid companyName...");
		}
		
		if(salary!=0&&salary>0&&salary<20000000)
		{
			System.out.println("Valid salary...");
		}
		else
		{
			System.err.println("Invalid salary...");
		}
		
		if(experience!=0&&experience>0&&experience<120)
		{
			System.out.println("Valid experience...");
		}
		else
		{
			System.err.println(" Invalid experience...");
		}
		}
		else
		{
			System.err.println("Invalid data,can't save..");
		}

		
	}

}
