package com.xworkz.curtain.app.service;

import com.xworkz.curtain.app.dto.StationDTO;
import com.xworkz.curtain.app.repository.HospitalRepository;
import com.xworkz.curtain.app.repository.HospitalRepositoryImpl;
import com.xworkz.curtain.app.repository.StationRepository;
import com.xworkz.curtain.app.repository.StationRepositoryImpl;
import com.xworkz.curtain.app.util.ValidationUtil;

public class StationServiceImpl implements StationService {

	@Override
	public boolean validateAndSave(StationDTO stationDTO) {
		
		if(stationDTO!=null)
		{
			System.out.println("Invoking validateAndSave method in StationServiceImpl");
			System.out.println("Arg passed :" +stationDTO);
			String type=stationDTO.getStationType();
			String location=stationDTO.getLocation();
			int platform=stationDTO.getPlatformNo();
			int price=stationDTO.getTicketPrice();
			
			
			if(ValidationUtil.validateString(type))
			{
				System.out.println("Type is Valid...");
			}
			else
			{
				System.err.println("Type is Invalid...");
				return false;
			}
			
			if(ValidationUtil.validateString(location))
			{
				System.out.println("location is Valid...");
			}
			else
			{
				System.err.println("location is Invalid...");
				return false;
			}
			
			if(ValidationUtil.validateInt(platform))
			{
				System.out.println("Platform is Valid...");
			}
			else
			{
				System.err.println("Platform is Invalid...");
				return false;
			}
			
			if(ValidationUtil.validateInt(price))
			{
				System.out.println("price is Valid...");
			}
			else
			{
				System.err.println("price is Invalid...");
				return false;
			}
			System.out.println("All the data of the Station is Valid...");
			StationRepository stationRepository=new StationRepositoryImpl();
			stationRepository.save(stationDTO);
			return true;
			
		}
		else
		{
			System.err.println("Invalid data,can't save..");
		}		
					
		return false;
	}

}
