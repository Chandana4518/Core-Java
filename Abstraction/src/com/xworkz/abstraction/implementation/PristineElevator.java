package com.xworkz.abstraction.implementation;

import com.xworkz.abstraction.app.Elevator;

public class PristineElevator implements Elevator{

	@Override
	public boolean carryLuggage() {
		if(CAPACITY<=20)
		{
			System.out.println("Elevator is working");
			return true;
		}
		else
		{
			System.err.println("Elevator is not working");
			return false;
		}
		
	}

}
