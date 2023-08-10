package com.xworkz.politician.runner;

import com.xworkz.politician.app.repository.ApartmentRepository;
import com.xworkz.politician.app.repository.ApartmentRepositoryImpl;

public class ApartmentRunner {

	public static void main(String[] args) {
		
		ApartmentRepository ref=new ApartmentRepositoryImpl();
		ref.save("Joyous Apartment");
		ref.save("Innovative Apartment");
		ref.save("Realistic Apartment");
		ref.save("Loyal Apartment");
		ref.save("Polite Apartment");
		ref.display();
	}

}
