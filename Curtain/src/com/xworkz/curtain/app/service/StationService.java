package com.xworkz.curtain.app.service;

import com.xworkz.curtain.app.dto.StationDTO;

public interface StationService {
	
	boolean validateAndSave(StationDTO stationDTO);
	
    StationDTO findByStationType(String type);
	
	StationDTO findByTypeAndTicketPrice(String type,int price);

}
