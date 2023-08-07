package com.xworkz.Computer;

public interface Laptop{

	void typing();
	
	default void dataEntry() 
	{
		System.out.println("Running dataEntry method in System");
		
	}
}
