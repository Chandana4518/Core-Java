package com.xworkz.curtain.app.repository;

import com.xworkz.curtain.app.dto.StationDTO;

public class StationRepositoryImpl implements StationRepository {
	
	private StationDTO[] dtos=new StationDTO[TOTAL];
	private int temp=0;

	@Override
	public void save(StationDTO stationDTO) 
	{
		if(temp<TOTAL)
		{
			System.out.println("Invoking save method in StationRepositoryImpl");
			this.dtos[temp]=stationDTO;
			System.out.println("The element at index :" +temp);
			temp++;
			
		}
		else
		{
			System.out.println("Array is full,can't store..");
		}
		
	}

}
