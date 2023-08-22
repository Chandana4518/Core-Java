package com.xworkz.curtain.app.runner;

import com.xworkz.curtain.app.dto.HospitalDTO;
import com.xworkz.curtain.app.repository.HospitalRepository;
import com.xworkz.curtain.app.repository.HospitalRepositoryImpl;
import com.xworkz.curtain.app.service.HospitalService;
import com.xworkz.curtain.app.service.HospitalServiceImpl;

public class HospitalRunner {

	public static void main(String[] args) {
		
		
		HospitalDTO hospitalDTO=new HospitalDTO("St.John's", "BLR", 100, 10000);
		
		HospitalService hospitalService=new HospitalServiceImpl();
		boolean service=hospitalService.validateAndSave(hospitalDTO);
		if(service)
		{
			System.out.println("Saved :" +service);
		}
		else
		{
			System.out.println("Do not saved :" +service );
		}
		

	}

}
