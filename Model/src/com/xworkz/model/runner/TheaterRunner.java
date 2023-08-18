package com.xworkz.model.runner;

import com.xworkz.model.app.dto.TheaterDTO;
import com.xworkz.model.app.repository.TheaterRepository;
import com.xworkz.model.app.repository.TheaterRepositoryImpl;

public class TheaterRunner {

	public static void main(String[] args) {
		
		TheaterDTO theaterDto=new TheaterDTO("PVR","Bro", "Kane", false,"Mlleswaram");
		TheaterRepository theaterRepository=new TheaterRepositoryImpl();
		System.out.println(theaterDto);
		theaterRepository.save(theaterDto);
		
		TheaterDTO theaterDto1=new TheaterDTO("INOX","Baby", "Jp", false,"Whitefield");
		System.out.println(theaterDto1);
		theaterRepository.save(theaterDto1);
		
		TheaterDTO theaterDto2=new TheaterDTO("Balaji","Jailer", "Alex", false,"Hebbal");
		System.out.println(theaterDto2);
		theaterRepository.save(theaterDto2);
		
		TheaterDTO theaterDto3=new TheaterDTO("Gopalan","Yogi", "Kumar", false,"Mysore Road");
		System.out.println(theaterDto3);
		theaterRepository.save(theaterDto3);
		
		TheaterDTO theaterDto4=new TheaterDTO("Sampige","Venky", "Venkat", false,"Malleswaram");
		System.out.println(theaterDto4);
		theaterRepository.save(theaterDto4);
		
		
		System.out.println("========================================");
		
		TheaterDTO dto=theaterRepository.findByMovieName("Jailer");
		System.out.println(dto);
		
		TheaterDTO dto1=theaterRepository.findByTheaterName("Gopalan");
		System.out.println(dto1);
		
		TheaterDTO dto2=theaterRepository.findByLocation("Hebbal");
		System.out.println(dto2);
		
		TheaterDTO[] dto3=theaterRepository.readAll();
		for(int index=0;index<dto3.length;index++)
			{
			if(dto3[index]!=null)
				{
				  System.out.println(dto3[index]);
				}
			}
	
	}

}
