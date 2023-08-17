package com.xworkz.model.app.repository;

import com.xworkz.model.app.dto.MarketDTO;

public class MarketRepositoryImpl implements MarketRepository{
	
	private int temp=0;
	private MarketDTO[] market=new MarketDTO[COUNT];

	@Override
	public void save(MarketDTO marketDTO) 
	{
		System.out.println("Invoking MarketDTO in MarketRepositoryImpl");
		if(this.temp<COUNT)
		{
			this.market[temp]=marketDTO;
			System.out.println("Saving data about the Market...");
			temp++;
		}
		else
		{
			System.out.println("Array is full,can't save");
		}
		
		
	}
	
	

}
