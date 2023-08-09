package com.xworkz.abstraction.implementation;

import com.xworkz.abstraction.app.Laptop;

public class LenovoLaptop implements Laptop{

	@Override
	public boolean display() {
		if(STORAGE<=512)
		{
			System.out.println("Storage is not full,can store files");
			return true;
		}
		else {
			System.err.println("Storage is full,can not store files");
			return false;
		}
		
	}

}
