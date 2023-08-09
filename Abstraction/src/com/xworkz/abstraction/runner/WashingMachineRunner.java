package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.WashingMachine;
import com.xworkz.abstraction.implementation.WhirlpoolWashingMachine;
import com.xworkz.abstraction.user.Arjunkapoor;

public class WashingMachineRunner {

	public static void main(String[] args) {
		
		WashingMachine machine=new WhirlpoolWashingMachine();
		machine.wash();
		
		Arjunkapoor kapoor=new Arjunkapoor(machine);
		kapoor.dry();

	}

}
