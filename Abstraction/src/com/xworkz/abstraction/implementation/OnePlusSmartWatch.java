package com.xworkz.abstraction.implementation;

import com.xworkz.abstraction.app.SmartWatch;

public class OnePlusSmartWatch implements SmartWatch{

	@Override
	public boolean showTime() {
		if(PRICE<=5000)
		{
			System.out.println("Watch price is resonable,can buy...");
			return true;
		}
		else 
		{
			System.err.println("Watch price is not resonable,can not buy..");
			return false;
		}
		
	}

}
