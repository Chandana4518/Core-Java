package com.xworkz.restaurant;

public class BangaloreRestaurant implements UdupiRestaurant,BabajiRestaurant{

	@Override
	public void sale() {
		System.out.println("Running sale method in BangaloreRestaurant");
		
	}

}
