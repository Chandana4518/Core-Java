package com.xworkz.abstraction.implementation;

import com.xworkz.abstraction.app.Kidney;

public class RightSideKidney implements Kidney{

	@Override
	public boolean clean() 
	{
		System.out.println("Running clean method in  RightSideKidney");
		return true;
	}

}
