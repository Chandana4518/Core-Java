package com.xworkz.restaurant;

public interface Restaurant {
	
	void sale();
	
	default void supplyItems() {
		System.out.println("Running supplyItems method in Restaurant");
	}

}
