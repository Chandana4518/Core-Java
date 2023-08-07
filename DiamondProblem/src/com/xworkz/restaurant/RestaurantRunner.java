package com.xworkz.restaurant;

public class RestaurantRunner {

	public static void main(String[] args) {
		
		BangaloreRestaurant br=new BangaloreRestaurant();
		br.sale();
		br.supplyItems();
		br.onlinePayment();
		br.specials();
		
		BabajiRestaurant br1=new BangaloreRestaurant();
		br1.supplyItems();
		br1.sale();
		br1.onlinePayment();
		
		UdupiRestaurant ur=new BangaloreRestaurant();
		ur.sale();
		ur.specials();
		ur.supplyItems();
		
		Restaurant restaurant=new BangaloreRestaurant();
		restaurant.sale();
		restaurant.supplyItems();
		
		
	

	}

}
