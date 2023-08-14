package com.xworkz.application.runner;

import com.xworkz.application.app.CountryNamesRepository;
import com.xworkz.application.app.CountryNamesRepositoryImpl;

public class CountryNamesRunner {

	public static void main(String[] args) {
		
		CountryNamesRepository country=new CountryNamesRepositoryImpl();
		country.save("India");
		country.save("Australia");
		country.save("Canada");
		country.save("China");
		country.save("Colombia");
		country.save("France");
		country.save("Brazil");
		country.save("Netherlands");
		country.save("South Africa");
		country.save("West Indies");
		
		System.out.println("=====================");
		country.display();
		
		boolean name=country.isExist("India");
		System.out.println("India isExist :"+name);
		
		String names=country.findReturnUpperCase("China");
		System.out.println("Return name to Uppercase :"+names);
		
		System.out.println("====================");
		
		String[] names1=country.findStartsWith("C");
		for(int index=0;index<names1.length;index++)
		{
			if(names1[index]!=null)
			{
				System.out.println("Return name starts with given letter :" +names1[index]);
			}
		}
		System.out.println("====================");
		
		String[] start=country.findEndsWith("a");
		for(int index=0;index<start.length;index++)
		{
			if(start[index]!=null)
			{
				System.out.println("Return name ends with given letter :" +start[index]);
			}
		}
		System.out.println("==================");
		
		String[] ref=country.findMatching("France");
		for(int index=0;index<ref.length;index++)
		{
			if(ref[index]!=null)
			{
				System.out.println("Return the matching String :" +ref[index]);
			}
		}
		
		System.out.println("===========================");
		
		country.orderDesc();
		
		System.out.println("========================");
		country.orderAsc();
		
		country.savedCount();
		
	}

}
