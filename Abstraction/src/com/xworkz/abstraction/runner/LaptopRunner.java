package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.Laptop;
import com.xworkz.abstraction.implementation.LenovoLaptop;
import com.xworkz.abstraction.user.SonuSoodLaptop;

public class LaptopRunner {

	public static void main(String[] args) {
		
		Laptop laptop=new LenovoLaptop();
		laptop.display();
		
		SonuSoodLaptop sonu=new SonuSoodLaptop(laptop);
		sonu.buyLaptop();

	}

}
