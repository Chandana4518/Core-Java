package com.xworkz.curtain.app.service;

import com.xworkz.curtain.app.dto.PlayerDTO;
import com.xworkz.curtain.app.repository.PlayerRepository;
import com.xworkz.curtain.app.util.ValidationUtil;

public class PlayerServiceImpl implements PlayerService {

	private PlayerRepository playerRepository;

	public PlayerServiceImpl(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}

	@Override
	public boolean validateAndSave(PlayerDTO playerDTO) {

		if (playerDTO != null) {
			System.out.println("Invoking validateAndSave method in PlayerServiceImpl");
			System.out.println("Arg passed:" + playerDTO);
			String name = playerDTO.getName();
			String sport = playerDTO.getSportsName();

			if (ValidationUtil.validateString(name)) {
				System.out.println("Name is valid...");
			} else {
				System.err.println("Name is Invalid..");
				return false;
			}

			if (ValidationUtil.validateString(sport)) {
				System.out.println("Sports Name is valid...");
			} else {
				System.err.println("Sports Name is Invalid..");
				return false;
			}
			System.out.println("All data of the Player is valid..");
			playerRepository.save(playerDTO);
			return true;

		}
		return false;
	}

	@Override
	public PlayerDTO findByPlayerName(String name) {
		boolean isValid=ValidationUtil.validateString(name);
		if(isValid)
		{
			System.out.println("Player name is Valid");
			PlayerDTO isFound=playerRepository.findByPlayerName(name);
			return isFound;
		}
		System.out.println("Player name is Invalid");
		return null;
	}

	@Override
	public PlayerDTO findByNameAndSportsName(String name, String sportsName) {
		
		boolean isValid=ValidationUtil.validateString(name)&&ValidationUtil.validateString(sportsName);
		if(isValid)
		{
			System.out.println("Player name and Sportsname is Valid");
			PlayerDTO isFound=playerRepository.findByNameAndSportsName(name, sportsName);
			return isFound;
		}
		System.out.println("Player name and Sports name is Invalid");
		
		return null;
	}

}
