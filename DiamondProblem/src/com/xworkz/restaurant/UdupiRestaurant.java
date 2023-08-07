package com.xworkz.restaurant;

public interface UdupiRestaurant extends Restaurant{
	
	
	@Override
	 void sale();
	
	default void specials() {
		System.out.println("Running specialsmethod in UdupiRestaurant ");
	}

}
