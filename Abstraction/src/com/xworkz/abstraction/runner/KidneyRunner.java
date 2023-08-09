package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.Kidney;
import com.xworkz.abstraction.implementation.RightSideKidney;
import com.xworkz.abstraction.user.HumanKidney;

public class KidneyRunner {

	public static void main(String[] args) {
		
		Kidney kidney=new RightSideKidney();
		kidney.clean();
		
		HumanKidney human=new HumanKidney(kidney);
		human.filter();
	}

}
