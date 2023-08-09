package com.xworkz.abstraction.user;

import com.xworkz.abstraction.app.Kidney;

public class HumanKidney {
	
	private Kidney kidney;
	
	public HumanKidney(Kidney kidney)
	{
		this.kidney=kidney;
		System.out.println("RUnning Kidney const of HumanKidney");
	}
	public void filter() {
		if(kidney!=null) {
			System.out.println("Kidney is working");
			this.kidney.clean();
		}
		else
		{
			System.out.println("Kidney is not working");
		}
	}

}
