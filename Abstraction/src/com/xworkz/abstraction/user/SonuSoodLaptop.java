package com.xworkz.abstraction.user;

import com.xworkz.abstraction.app.Laptop;

public class SonuSoodLaptop {
	
	private Laptop acer;
	
	public SonuSoodLaptop(Laptop acer)
	{
		this.acer=acer;
		System.out.println("Running Laptop const of SonuSoodLaptop");
	}
	public void buyLaptop() {
		if(acer!=null)
		{
			System.out.println("Laptop is working..");
			this.acer.display();
		}
		else
		{
			System.err.println("Laptop is not working..");
		}
	}

}
