package com.xworkz.Computer;

public class LaptopRunner {

	public static void main(String[] args) {
		
		
		AcerLaptop as=new AcerLaptop();
		as.dataEntry();
		as.application();
		as.input();
		as.typing();
		
		HpLaptop hs=new AcerLaptop();
		hs.dataEntry();
		hs.input();
		hs.typing();
		
		LenovoLaptop ls=new AcerLaptop();
		ls.application();
		ls.dataEntry();
		ls.typing();
		
		Laptop system=new AcerLaptop();
		system.dataEntry();
		system.typing();
		

	}

}
