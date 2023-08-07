package com.xworkz.Train;

public interface GoodsTrain extends Train{
	
	
	@Override
	 void storage();
	
	default void stop() {
		System.out.println("Running stop method in GoodsTrain");
	}
		
		
	

}
