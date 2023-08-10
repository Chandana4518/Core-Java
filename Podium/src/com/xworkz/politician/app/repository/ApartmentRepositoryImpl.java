package com.xworkz.politician.app.repository;

public class ApartmentRepositoryImpl implements ApartmentRepository {
	
	private int index=0;
	private String[] array=new String[NO_OF_FLOORS];

	@Override
	public void save(String name)
	{
		if(index<NO_OF_FLOORS)
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
		for(index=0;index<this.array.length;index++)
		{
			System.out.println("The element stored at index " +index+ " is " + array[index]);
			
		}
		
	}

}
