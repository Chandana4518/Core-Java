package com.xworkz.model.app.repository;

import com.xworkz.model.app.dto.TheaterDTO;

public interface TheaterRepository {
	
	int TOTAL_ITEMS=5;
	
	void save(TheaterDTO theaterDTO);

}
