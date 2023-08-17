package com.xworkz.model.runner;

import com.xworkz.model.app.dto.PilotDTO;
import com.xworkz.model.app.repository.PilotRepository;
import com.xworkz.model.app.repository.PilotRepositoryImpl;

public class PilotRunner {

	public static void main(String[] args) {
		
		PilotDTO pilotDTO=new PilotDTO("Nesha","Bengalore",true,200000,25);
		PilotRepository pilotRepository=new PilotRepositoryImpl();
		System.out.println(pilotDTO);
		pilotRepository.save(pilotDTO);
		
		PilotDTO pilotDTO1=new PilotDTO("Annie","Mysore",true,30000,29);
		System.out.println(pilotDTO1);
		pilotRepository.save(pilotDTO1);
		
		PilotDTO pilotDTO2=new PilotDTO("Sarthak","Hyderabad",true,25000,22);
		System.out.println(pilotDTO2);
		pilotRepository.save(pilotDTO2);
		
		PilotDTO pilotDTO3=new PilotDTO("Anita","Chennai",true,28000,23);
		System.out.println(pilotDTO3);
		pilotRepository.save(pilotDTO3);
		
		PilotDTO pilotDTO4=new PilotDTO("Prasanna","Pune",true,30700,30);
		System.out.println(pilotDTO4);
		pilotRepository.save(pilotDTO4);
		

	}

}
