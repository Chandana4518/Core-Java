package com.xworkz.model.app.repository;

import com.xworkz.model.app.dto.TheaterDTO;

public interface TheaterRepository {
	
	int TOTAL_ITEMS=5;
	
	void save(TheaterDTO theaterDTO);
	
	public TheaterDTO findByMovieName(String movieName);
	
	public TheaterDTO findByTheaterName(String name);
	
	public TheaterDTO findByLocation(String location);
	
	public TheaterDTO[] readAll();

}
