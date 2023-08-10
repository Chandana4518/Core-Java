package com.xworkz.politician.app.repository;

public interface OlympicsRepository {
	
	int TOTAL=5;
	
	void save(int year);
	
	default void display()
	{
		System.out.println("Running display method in OlympicsRepository");
	}

}
