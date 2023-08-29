package com.xworkz.curtain.app.service;

import com.xworkz.curtain.app.dto.StationDTO;
import com.xworkz.curtain.app.repository.HospitalRepository;
import com.xworkz.curtain.app.repository.HospitalRepositoryImpl;
import com.xworkz.curtain.app.repository.StationRepository;
import com.xworkz.curtain.app.repository.StationRepositoryImpl;
import com.xworkz.curtain.app.util.ValidationUtil;

public class StationServiceImpl implements StationService {
	
	private StationRepository stationRepository=new StationRepositoryImpl();

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
			
			stationRepository.save(stationDTO);
			return true;
			
		}
		else
		{
			System.err.println("Invalid data,can't save..");
		}		
					
		return false;
	}

	@Override
	public StationDTO findByStationType(String type) {
		boolean isValid=ValidationUtil.validateString(type);
		if(isValid)
		{
			System.out.println("Station Type is Valid");
			StationDTO isFound=stationRepository.findByStationType(type);
			return isFound;
		}
		System.err.println("Station type is Invalid");
		return null;
	}

	@Override
	public StationDTO findByTypeAndTicketPrice(String type, int price) {
		boolean isValid=ValidationUtil.validateString(type)&&ValidationUtil.validateInt(price);
		if(isValid)
		{
			System.out.println("Station Type and Price is Valid");
			StationDTO isFound=stationRepository.findByTypeAndTicketPrice(type, price);
			return isFound;
		}
		System.err.println("Station type and Price is Invalid");
		
		return null;
	}

}
