package com.xworkz.model.runner;

import com.xworkz.model.app.dto.MarketDTO;
import com.xworkz.model.app.repository.MarketRepository;
import com.xworkz.model.app.repository.MarketRepositoryImpl;

public class MarketRunner {

	public static void main(String[] args) {
		
		MarketDTO marketDTO=new MarketDTO("Jolley Stores","Fancy",100,1000,"Smitha");
		MarketRepository marketRepository=new MarketRepositoryImpl();
		System.out.println(marketDTO);
		marketRepository.save(marketDTO);
		
		MarketDTO marketDTO1=new MarketDTO("Food Market","Food",200,100,"Krish");
		System.out.println(marketDTO1);
		marketRepository.save(marketDTO1);
		
		MarketDTO marketDTO2=new MarketDTO("King Soopers","Vegetables",500,10,"Lila");
		System.out.println(marketDTO2);
		marketRepository.save(marketDTO2);
		
		MarketDTO marketDTO3=new MarketDTO("Quality Food ","Corn",200,5,"Manish");
		System.out.println(marketDTO3);
		marketRepository.save(marketDTO3);
		
		MarketDTO marketDTO4=new MarketDTO("Jerry's Shop ","Form",2000,10,"Kranthi");
		System.out.println(marketDTO4);
		marketRepository.save(marketDTO4);
		
		System.out.println("==============================");
		MarketDTO dto=marketRepository.findByOwnerName("Lila");
		System.out.println(dto);
		
		MarketDTO dto1=marketRepository.findByNoOfItems(5);
		System.out.println(dto1);
		
		MarketDTO dto2=marketRepository.findByCapacity(2000);
		System.out.println(dto2);
		
		MarketDTO[] dto3=marketRepository.readAll();
		for(int index=0;index<dto3.length;index++)
		{
			if(dto3[index]!=null) 
			{
				System.out.println(dto3[index]);
			}
		}
		

	}

}
