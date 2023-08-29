package com.xworkz.curtain.app.service;

import com.xworkz.curtain.app.dto.HospitalDTO;

public interface HospitalService {
	
	boolean validateAndSave(HospitalDTO hospitalDTO);
	
	 HospitalDTO findByHospitalName(String name);
	
     HospitalDTO findByNameAndDoctors(String name,int doctors);

}
