package com.xworkz.restaurant.app.service;

import com.xworkz.restaurant.app.dto.MechanicDTO;

public class MechanicServiceImpl implements MechanicService {

	@Override
	public void validateAndSave(MechanicDTO mechanicDTO) {
		
		if(mechanicDTO!=null)
		{
			System.out.println("Valid data ,can save");
			System.out.println("Valid Args :" +mechanicDTO);
			String garageName=mechanicDTO.getGarageName();
			String gstNo=mechanicDTO.getGstNo();
			String specialization=mechanicDTO.getSpecialization();
			int bikeServiceCost=mechanicDTO.getBikeServiceCost();
		
		if(garageName!=null&&!garageName.isEmpty()&&garageName.length()>3&&garageName.length()<20)
		{
			System.out.println("Valid garageName...");
		}
		else
		{
			System.err.println("Invalid garageName...");
		}
		
		if(gstNo!=null&&!gstNo.isEmpty()&&gstNo.length()>3&&gstNo.length()<20)
		{
			System.out.println("Valid gstNo...");
		}
		else
		{
			System.err.println("Invalid gstNo...");
		}
		
		if(specialization!=null&&!specialization.isEmpty()&&specialization.length()>3&&specialization.length()<20)
		{
			System.out.println("Valid specialization...");
		}
		else
		{
			System.err.println(" Invalid specialization...");
		}
		if(bikeServiceCost!=0&&bikeServiceCost>0&&bikeServiceCost<50000)
		{
			System.out.println("Valid bikeServiceCost...");
		}
		else
		{
			System.err.println("Invalid bikeServiceCost...");
		}
		
		}
		else
		{
			System.err.println("Invalid data,can't save..");
		}

	}

}
