package com.xworkz.Train;

public interface ExpressTrain extends Train{
	
	
	@Override
	 void storage();
	
	default void heavyThingCarry() {
		System.out.println("Running heavyThingCarry method in ExpressTrain");
	}
	
	

}
