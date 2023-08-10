package com.xworkz.politician.runner;

import com.xworkz.politician.app.repository.HospitalRepository;
import com.xworkz.politician.app.repository.HospitalRepositoryImpl;

public class HospitalRunner {

	public static void main(String[] args) {
		
		HospitalRepository ref=new HospitalRepositoryImpl();
		ref.save("St.Johns");
		ref.save("Apollo");
		ref.save("Jayadeva");
		ref.save("Triveni");
		ref.save("Rainbow");
		ref.display();

	}

}
