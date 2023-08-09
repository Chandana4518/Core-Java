package com.xworkz.abstraction.implementation;

import com.xworkz.abstraction.app.WaterPurifier;

public class KentWaterPurifier implements WaterPurifier{

	@Override
	public boolean filter() {
		System.out.println("Running filter method in KentWaterPurifier");
		return true;
	}
	
	

}
