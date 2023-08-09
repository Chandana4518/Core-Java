package com.xworkz.abstraction.implementation;

import com.xworkz.abstraction.app.WashingMachine;

public class WhirlpoolWashingMachine implements WashingMachine{

	@Override
	public boolean wash() {
		System.out.println("Running wash method in WhirlpoolWashingMachine");
		return true;
	}
	
	

}
