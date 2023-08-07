package com.xworkz.Train;

public interface Train {
	
	void storage();
	
	default void travel() {
		System.out.println("Running travel method in Train");
	}

}
