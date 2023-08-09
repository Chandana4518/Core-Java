package com.xworkz.abstraction.user;

import com.xworkz.abstraction.app.PrintingMachine;

public class RashmikaPrintingMachine {
	
	
	private PrintingMachine printer;
	
	public RashmikaPrintingMachine(PrintingMachine printer)
	{
		this.printer=printer;
		System.out.println("Running PrintingMachine const of RashmikaPrintingMachine");
	}
	
	public void zeroxFile() 
	{
		if(this.printer!=null)
		{
			System.out.println("Printer is working can zeroxFile");
			this.printer.print();
		}
		else
		{
			System.err.println("Printer is not working can not zeroxFile");
		}
	}

}
