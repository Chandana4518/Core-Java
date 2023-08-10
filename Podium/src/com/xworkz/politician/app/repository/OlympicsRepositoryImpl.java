package com.xworkz.politician.app.repository;

public class OlympicsRepositoryImpl implements OlympicsRepository {
	
	int index=0;
	int[] array=new int[TOTAL];

	@Override
	public void save(int year)
	{
		
		if(index<TOTAL)
		{
			System.out.println("The element is stored at " +index+ " is "+year);
			this.array[index]=year;
			index=index+1;
			System.out.println("The next index is " +index);
		}
		else
		{
			System.err.println("The array is full,can not store");
		}
	}
	@Override
	public void display() 
	{
		for(index=0;index<TOTAL;index++)
		{
			System.out.println("The element stored at index " +index+ " is " + array[index]);
		}
	}

}
