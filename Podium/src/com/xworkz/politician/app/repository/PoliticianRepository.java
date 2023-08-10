package com.xworkz.politician.app.repository;

public interface PoliticianRepository {
	
	int TOTAL_DATAITEMS=5;
	
	 void save(String name);
	 
	 default void display()
	 {
		 System.out.println("Running display method in PoliticianRepository");
	 }

}
