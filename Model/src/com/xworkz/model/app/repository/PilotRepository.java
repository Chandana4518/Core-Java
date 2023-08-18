package com.xworkz.model.app.repository;

import com.xworkz.model.app.dto.PilotDTO;

public interface PilotRepository {
	
	int TOTAL=5;
	
	void save(PilotDTO pilotDTO);
	
	public PilotDTO findByPilotFitness(boolean fitness);
	
	public PilotDTO findByPilotAge(int age);
	
	public PilotDTO findByPilotSalary(long salary);
	
	public PilotDTO[] readAll();
	
	

}
