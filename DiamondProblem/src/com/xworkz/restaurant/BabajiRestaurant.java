package com.xworkz.restaurant;

public interface BabajiRestaurant extends Restaurant{
	
	
	@Override
	 void sale();
	
	default void onlinePayment()
	{
		System.out.println("Running onlinePayment method in BabajiRestaurant");
	}
	

}
