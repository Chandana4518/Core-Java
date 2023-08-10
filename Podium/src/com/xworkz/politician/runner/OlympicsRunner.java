package com.xworkz.politician.runner;

import com.xworkz.politician.app.repository.OlympicsRepository;
import com.xworkz.politician.app.repository.OlympicsRepositoryImpl;

public class OlympicsRunner {

	public static void main(String[] args) {
		
		OlympicsRepository ref=new OlympicsRepositoryImpl();
		ref.save(2012);
		ref.save(2022);
		ref.save(2020);
		ref.save(1945);
		ref.save(1978);
		ref.display();

	}

}
