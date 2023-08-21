package com.xworkz.restaurant.app.runner;

import com.xworkz.restaurant.app.dto.ThiefDTO;
import com.xworkz.restaurant.app.service.ThiefService;
import com.xworkz.restaurant.app.service.ThiefServiceImpl;

public class ThiefRunner {

	public static void main(String[] args) {
		
		ThiefDTO thiefDTO=new ThiefDTO("Hacker",10,35,"Thunder",25);
		System.out.println(thiefDTO);
		
		ThiefService thiefService=new ThiefServiceImpl();
		thiefService.validateAndSave(thiefDTO);

	}

}
