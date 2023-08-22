package com.xworkz.curtain.app.repository;

import com.xworkz.curtain.app.dto.StationDTO;

public interface StationRepository {
	
	int TOTAL=3;
	
	void save(StationDTO stationDTO);

}
