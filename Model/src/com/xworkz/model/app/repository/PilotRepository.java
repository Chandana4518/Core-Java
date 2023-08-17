package com.xworkz.model.app.repository;

import com.xworkz.model.app.dto.PilotDTO;

public interface PilotRepository {
	
	int TOTAL=5;
	
	void save(PilotDTO pilotDTO);

}
