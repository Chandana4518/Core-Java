package com.xworkz.Computer;

public interface HpLaptop extends Laptop{
	
	
	@Override
	 void typing();
	
	default void input()
	{
		System.out.println("Running input method in HpSystem");
	}
}
