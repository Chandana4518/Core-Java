package com.xworkz.curtain.app.repository;

import com.xworkz.curtain.app.dto.PlayerDTO;

public class PlayerRepositoryImpl implements PlayerRepository {
	
	private PlayerDTO[] dtos=new PlayerDTO[TOTAL];
	private int temp=0;

	@Override
	public void save(PlayerDTO playerDTO) {
		
		if(temp<TOTAL)
		{
			System.out.println("Invoking save method in PlayerRepositoryImpl");
			this.dtos[temp]=playerDTO;
			System.out.println("The element at index :" +temp);
			temp++;
		}
		else
		{
			System.err.println("Array is full,can't store...");
		}
	}

	@Override
	public PlayerDTO findByPlayerName(String name) {
		for(int index=0;index<temp;index++)
		{
			if(dtos[index].getName().equalsIgnoreCase(name))
			{
				System.out.println("Found Player name ");
				return dtos[index];
			}
			System.out.println("PlayerName is not matching moving to next index");
		}
		System.err.println("PlayerName is not Found");
		return null;
	}

	@Override
	public PlayerDTO findByNameAndSportsName(String name, String sportsName) {
		for(int index=0;index<temp;index++)
		{
			if(dtos[index].getName().equalsIgnoreCase(name)&&dtos[index].getSportsName().equalsIgnoreCase(sportsName))
			{
				System.out.println("Found Player name and Sportsname");
				return dtos[index];
			}
			System.out.println("PlayerName and Sportsname is not matching moving to next index");
		}
		System.err.println("PlayerName and Sportsname is not Found");
		return null;
	}

}
