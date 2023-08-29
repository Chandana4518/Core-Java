package com.xworkz.curtain.app.service;

import com.xworkz.curtain.app.dto.PlayerDTO;

public interface PlayerService {
	
	boolean validateAndSave(PlayerDTO playerDTO);
	
    PlayerDTO findByPlayerName(String name);
	
	PlayerDTO findByNameAndSportsName(String name,String sportsName);

}
