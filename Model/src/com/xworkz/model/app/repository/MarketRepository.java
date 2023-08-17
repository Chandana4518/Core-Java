package com.xworkz.model.app.repository;

import com.xworkz.model.app.dto.MarketDTO;

public interface MarketRepository {
	
	int COUNT=5;
	
	void save(MarketDTO marketDTO);

}
