package com.xworkz.restaurant.app.runner;

import com.xworkz.restaurant.app.dto.MinisterDTO;
import com.xworkz.restaurant.app.service.MinisterService;
import com.xworkz.restaurant.app.service.MinisterServiceImpl;

public class MinisterRunner {

	public static void main(String[] args) {
		
		MinisterDTO ministerDTO=new MinisterDTO("Y.S Jagan",4,"Chief Minister","Y.S.R");
		System.out.println(ministerDTO);
		
		MinisterService ministerService=new MinisterServiceImpl();
		ministerService.validateAndSave(ministerDTO);

	}

}
