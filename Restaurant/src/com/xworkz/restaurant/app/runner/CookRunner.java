package com.xworkz.restaurant.app.runner;

import com.xworkz.restaurant.app.dto.CookDTO;
import com.xworkz.restaurant.app.service.CookService;
import com.xworkz.restaurant.app.service.CookServiceImpl;

public class CookRunner {

	public static void main(String[] args) {


		CookDTO cookDTO=new CookDTO("Pork Roast","Udupi","Male",50000);
		System.out.println(cookDTO);
		
		CookService cookService=new CookServiceImpl();
		cookService.validateAndSave(cookDTO);

	}

}
