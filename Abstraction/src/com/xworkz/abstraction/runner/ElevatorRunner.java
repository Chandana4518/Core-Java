package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.Elevator;
import com.xworkz.abstraction.implementation.PristineElevator;
import com.xworkz.abstraction.user.JacksonElevator;

public class ElevatorRunner {

	public static void main(String[] args) {
		
		Elevator elevator=new PristineElevator();
		elevator.carryLuggage();
		
		JacksonElevator jack=new JacksonElevator(elevator);
		jack.move();

	}

}
