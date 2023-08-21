package com.xworkz.restaurant.app.runner;

import com.xworkz.restaurant.app.dto.MechanicDTO;
import com.xworkz.restaurant.app.service.MechanicService;
import com.xworkz.restaurant.app.service.MechanicServiceImpl;

public class MechanicRunner {

	public static void main(String[] args) {
		
		
		MechanicDTO mechanicDTO=new MechanicDTO("Evolve Garage","29ABGPW7883G1ZS","Car Mechanic",1000);
		System.out.println(mechanicDTO);
		
		MechanicService mechanicService=new MechanicServiceImpl();
		mechanicService.validateAndSave(mechanicDTO);

	}

}
