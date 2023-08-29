package com.xworkz.curtain.app.runner;

import com.xworkz.curtain.app.dto.PlayerDTO;
import com.xworkz.curtain.app.repository.PlayerRepository;
import com.xworkz.curtain.app.repository.PlayerRepositoryImpl;
import com.xworkz.curtain.app.service.PlayerService;
import com.xworkz.curtain.app.service.PlayerServiceImpl;

public class PlayerRunner {

	public static void main(String[] args) {

		PlayerDTO playerDTO = new PlayerDTO("Rohit Sharma", "Cricket");

		PlayerRepository playerRepository = new PlayerRepositoryImpl();

		PlayerService playerService = new PlayerServiceImpl(playerRepository);

		boolean stored = playerService.validateAndSave(playerDTO);
		if (stored) {
			System.out.println("Saved :" + stored);
		} else {
			System.out.println("Do not saved :" + stored);
		}
		
		PlayerDTO foundName=playerService.findByPlayerName("Rohit Sharma");
		System.out.println(foundName);
		
		PlayerDTO foundData=playerService.findByNameAndSportsName("Rohit Sharma", "Cricket");
		System.out.println(foundData);

	}

}
