package com.xworkz.politician.app.repository;

public interface ArmyRepository {
	
	int TOTAL=5;
	
	void save(String name);
	
	default void display()
	{
		System.out.println("Running display method in ArmyRepository");
	}

}
