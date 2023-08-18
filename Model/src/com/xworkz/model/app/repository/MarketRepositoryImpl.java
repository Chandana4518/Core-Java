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

	@Override
	public MarketDTO findByOwnerName(String name) {
		for(int index=0;index<temp;index++)
		{
			if(market[index].getOwnerName()==name)
			{
				System.out.println("Market Owner Name is Found");
				return market[index];
			}
			System.out.println("Name is not macthed,moving to next index");
		}
		System.out.println("Owner Name is not found");
		return null;
	}

	@Override
	public MarketDTO findByNoOfItems(int noOfItems) 
	{
		for(int index=0;index<temp;index++)
		{
			if(market[index].getNoOfItems()==noOfItems)
			{
				System.out.println("Market no of items is Found");
				return market[index];
			}
			System.out.println("No of items is not macthed,moving to next index");
		}
		System.out.println("No Of Items is not found");
		
		return null;
	}

	@Override
	public MarketDTO findByCapacity(int capacity)
	{
		for(int index=0;index<temp;index++)
		{
			if(market[index].getCapacity()==capacity)
			{
				System.out.println("Market Capacity is Found");
				return market[index];
			}
			System.out.println("Capacity is not macthed,moving to next index");
		}
		System.out.println("Capacity is not found");
		return null;
	}

	@Override
	public MarketDTO[] readAll() {
		System.out.println("Invoking readAll method in MarketRepositoryImpl");
		return market;
	}
	
	

}
