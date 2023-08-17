package com.xworkz.model.app.repository;

import com.xworkz.model.app.dto.TheaterDTO;

public class TheaterRepositoryImpl implements TheaterRepository{
	
	
	private int temp=0;
	private TheaterDTO[] theaters=new TheaterDTO[TOTAL_ITEMS];
	
	@Override
	public void save(TheaterDTO theaterDTO) 
	{
		System.out.println("Invoking TheaterDTO in TheaterRepositoryImpl");
		if(this.temp<TOTAL_ITEMS)
		{
			this.theaters[temp]=theaterDTO;
			System.out.println("Saving data about the Theater...");
			temp++;
		}
		else
		{
			System.out.println("Array is full,can't save");
		}
		
	}
	
	
	

}
