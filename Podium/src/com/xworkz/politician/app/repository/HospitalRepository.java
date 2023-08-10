package com.xworkz.politician.app.repository;

public interface HospitalRepository {
	
	int COUNT=5;
	
	void save(String name);
	
	default void display()
	{
		System.out.println("Running display method in HospitalRepository");
	}

}
