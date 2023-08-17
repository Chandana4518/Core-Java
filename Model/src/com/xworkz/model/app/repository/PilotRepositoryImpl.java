package com.xworkz.model.app.repository;

import com.xworkz.model.app.dto.PilotDTO;

public class PilotRepositoryImpl implements PilotRepository{
	
	private int temp=0;
	private PilotDTO[] pilot=new PilotDTO[TOTAL];

	@Override
	public void save(PilotDTO pilotDTO) 
	{
		System.out.println("Invoking PilotDTO in PilotRepositoryImpl");
		if(this.temp<TOTAL)
		{
			this.pilot[temp]=pilotDTO;
			System.out.println("Saving data about the Pilot...");
			temp++;
		}
		else
		{
			System.out.println("Array is full,can't save");
		}
		
		
	}

}
