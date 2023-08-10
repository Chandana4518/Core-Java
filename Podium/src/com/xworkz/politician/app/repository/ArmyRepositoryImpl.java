package com.xworkz.politician.app.repository;

public class ArmyRepositoryImpl implements ArmyRepository{
	
	int index=0;
	String[] array=new String[TOTAL];

	@Override
	public void save(String name) {
		
		if(index<TOTAL)
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
	public void display() {
		for(index=0;index<TOTAL;index++)
		{
		System.out.println("The element stored at index " +index+ " is " + array[index]);
		}
		
	}

}
