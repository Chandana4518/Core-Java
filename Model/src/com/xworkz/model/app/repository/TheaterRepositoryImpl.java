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

	@Override
	public TheaterDTO findByMovieName(String movieName) {
		for(int index=0;index<temp;index++)
		{
			if(theaters[index].getMovieName()==movieName)
			{
				System.out.println("Movie name is found");
				return theaters[index];
			}
			System.out.println("movie name is not matched,moving to next index");
		}
		System.out.println("Movie name is not found");
		return null;
	}

	@Override
	public TheaterDTO findByTheaterName(String name) {
		for(int index=0;index<temp;index++)
		{
			if(theaters[index].getTheaterName()==name)
			{
				System.out.println("Theater name is found");
				return theaters[index];
			}
			System.out.println("Theater name is not matched,moving to next index");
		}
		System.out.println("Theater name is not found");
		return null;
	}

	@Override
	public TheaterDTO findByLocation(String location) {
		for(int index=0;index<temp;index++)
		{
			if(theaters[index].getLocation()==location)
			{
				System.out.println("Location is found");
				return theaters[index];
			}
			System.out.println("Locaation is not matched,moving to next index");
		}
		System.out.println("Location is not found");
		return null;
	}

	@Override
	public TheaterDTO[] readAll() {
		System.out.println("Invoking readAll method in TheaterRepositoryImpl");
		return theaters;
	}
	
	
	

}
