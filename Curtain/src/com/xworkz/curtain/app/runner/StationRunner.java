package com.xworkz.curtain.app.runner;

import com.xworkz.curtain.app.dto.StationDTO;
import com.xworkz.curtain.app.service.StationService;
import com.xworkz.curtain.app.service.StationServiceImpl;

public class StationRunner {

	public static void main(String[] args) {
		
		
		StationDTO stationDTO=new StationDTO("Railway Station","BLR",4,100);
		
		StationService stationService=new StationServiceImpl();
		boolean stored=stationService.validateAndSave(stationDTO);
		if(stored)
		{
			System.out.println("Stored :" +stored);
		}
		else
		{
			System.out.println("Do not stored :" +stored);
		}
		
		StationDTO foundType=stationService.findByStationType("Railway Station");
		System.out.println(foundType);
		
		StationDTO foundData=stationService.findByTypeAndTicketPrice("Railway Station", 100);
		System.out.println(foundData);
	}

}
