package com.xworkz.restaurant.app.runner;

import com.xworkz.restaurant.app.dto.CeoDTO;
import com.xworkz.restaurant.app.service.CeoService;
import com.xworkz.restaurant.app.service.CeoServiceImpl;

public class CeoRunner {

	public static void main(String[] args) {
		
		CeoDTO ceoDTO=new CeoDTO("Sundar Pichai","Google",16631465L,11);
		System.out.println(ceoDTO);
		
		CeoService ceoService=new CeoServiceImpl();
		ceoService.validateAndSave(ceoDTO);

	}

}
