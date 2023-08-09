package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.PrintingMachine;
import com.xworkz.abstraction.implementation.EpsonPrintingMachine;
import com.xworkz.abstraction.user.RashmikaPrintingMachine;

public class PrintingMachineRunner {

	public static void main(String[] args) {
		
		
		PrintingMachine machine=new EpsonPrintingMachine();
		machine.print();
		
		RashmikaPrintingMachine printer=new RashmikaPrintingMachine(machine);
		printer.zeroxFile();

	}

}
