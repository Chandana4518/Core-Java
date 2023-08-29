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

	@Override
	public StationDTO findByStationType(String type) {
		for(int index=0;index<temp;index++)
		{
			if(dtos[index].getStationType().equalsIgnoreCase(type))
			{
				System.out.println("Station type is Found");
				return dtos[index];
			}
			System.out.println("Station Type is not matchinng moving to next index");
		}
		System.err.println("Station type is not found");
		return null;
	}

	@Override
	public StationDTO findByTypeAndTicketPrice(String type, int price) {
		
		for(int index=0;index<temp;index++)
		{
			if(dtos[index].getStationType().equalsIgnoreCase(type)&&dtos[index].getTicketPrice()==price)
			{
				System.out.println("Station type and Ticket price is Found");
				return dtos[index];
			}
			System.out.println("Station Type  and Price is not matchinng moving to next index");
		}
		System.err.println("Station type and Ticket Price is not found");
		
		return null;
	}

}
