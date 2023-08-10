package com.xworkz.politician.app.repository;

public class PoliticianRepositoryImpl implements PoliticianRepository {

	
	private String[] array=new String[TOTAL_DATAITEMS];
	private int index=0;
	
	@Override
	public void save(String name) 
	{
		if(index<TOTAL_DATAITEMS)
		{
			System.out.println("The element is stored at " +index+ " is "+name);
			this.array[index]=name;
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
		for(int start=0;start<TOTAL_DATAITEMS;start++)
		{
			System.out.println("The element stored at index " +start+ " is " + array[start]);
		}
		
	}

}
