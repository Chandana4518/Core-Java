package com.xworkz.curtain.app.repository;

import com.xworkz.curtain.app.dto.HospitalDTO;

public interface HospitalRepository {
	
	int TOTAL_ITEMS=3;
	
	void save(HospitalDTO hospitalDTO);

}
