package com.xworkz.curtain.app.repository;

import com.xworkz.curtain.app.dto.PlayerDTO;

public interface PlayerRepository {
	
	int TOTAL=3;
	
	void save(PlayerDTO playerDTO);
	
	PlayerDTO findByPlayerName(String name);
	
	PlayerDTO findByNameAndSportsName(String name,String sportsName);

}
