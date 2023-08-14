package com.xworkz.application.app;

public class CountryNamesRepositoryImpl implements CountryNamesRepository {

	private int index=0;
	private String[] array=new String[COUNT];
	
	@Override
	public void save(String name) {
		
		if(index<COUNT)
		{
			this.array[index]=name;
			System.out.println("The element at " +index+ " is " +name);
			index=index+1;
			System.out.println("The next index is " +index);
		}
		else
		{
			System.out.println("the Array is full,can't store...");
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
	@Override
	public boolean isExist(String name)
	{
		for(int pos=0;pos<COUNT;pos++)
		{
			String string=this.array[pos];
			if(string.equals(name))
			{
				System.out.println("========================");
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String findReturnUpperCase(String name) 
	{
		for(int start=0;start<COUNT;start++)
		{
			String string=this.array[start];
			if(string.equals(name))
			{
				System.out.println("======================");
				return array[start].toUpperCase();
			}
		}
		return null;
		
	}
	
	@Override
	public String[] findStartsWith(String name) 
	{
		int temp=0;
		String[] tempArray=new String[COUNT];
		for(int pos=0;pos<COUNT;pos++)
		{
			String string=this.array[pos];
			if(string.startsWith(name))
			{
				tempArray[temp]=string;
				temp++;
			}
		}
		return tempArray;
		
	}
	
	@Override
	public String[] findEndsWith(String name) {
		
		int temp=0;
		String[] start=new String[COUNT];
		for(int pos=0;pos<COUNT;pos++)
		{
			String string=this.array[pos];
			if(string.endsWith(name))
			{
				start[temp]=string;
				temp++;
			}
		}
		return start;
	}
	
	@Override
	public String[] findMatching(String name) {
		int temp=0;
		String[] start=new String[COUNT];
		for(int pos=0;pos<COUNT;pos++)
		{
			String string=this.array[pos];
			if(string.matches(name))
			{
				start[temp]=string;
				temp=temp+1;
			}
		}
		return start;
		}
	
	@Override
	public int savedCount()
	{
		int temp = 0;
		 String[] start = new String[COUNT];
	        for (int index = 0; index < array.length; index++) {
	        	String string=this.array[index];
	            if (array[index] != null) {
	            	start[temp] = string;
	                temp++;
	            }
	        }
	        System.out.println("Elements stored at CountryNames Repository is : " + temp);
	
		return 0;
		
	}
	@Override
	public String[] orderDesc()
	{
		String[] temp=new String[COUNT];
		for(int index=0;index<COUNT;index++)
		{
			for(int pos=index+1;pos<COUNT;pos++)
			{
				if(array[index].compareTo(array[pos]) < 0) 
				{
					String temp1 = array[index];
					array[index] = array[pos];
					array[pos] = temp1;
					
				}
			}
			System.out.println("Printing CountryNames in Descending order : " +array[index]);
		}
		return temp;
	}
	
	@Override
	public String[] orderAsc()
	{
		String[] temp=new String[COUNT];
		for(int index=0;index<COUNT;index++)
		{
			for(int pos=index+1;pos<COUNT;pos++)
			{
				if(array[index].compareTo(array[pos])>0)
				{
					String temp1=array[index];
					array[index]=array[pos];
					array[pos]=temp1;
				}
			}
			System.out.println("Printing CountryNames in Ascending order : " +array[index]);
		}
		return temp;
	}
		
}
