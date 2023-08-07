package com.xworkz.Computer;

public interface LenovoLaptop extends Laptop{
	
	
	@Override
	 void typing();
	
	default void application() {
		System.out.println("Running application method in LenovoSystem");
	}
	

}
