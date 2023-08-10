package com.xworkz.politician.app.repository;

public interface ApartmentRepository {
	
	int NO_OF_FLOORS=5;
	
	void save(String name);
	
	default void display()
	{
		System.out.println("Running display method in ApartmentRepository");
	}

}
