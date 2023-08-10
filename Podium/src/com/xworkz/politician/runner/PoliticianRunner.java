package com.xworkz.politician.runner;

import com.xworkz.politician.app.repository.PoliticianRepository;
import com.xworkz.politician.app.repository.PoliticianRepositoryImpl;

public class PoliticianRunner {

	public static void main(String[] args) {
		
		PoliticianRepository ref=new PoliticianRepositoryImpl();
		ref.save("Sathya narayana");
		ref.save("Roja ");
		ref.save("Jagan");
		ref.save("Pawan kalyan");
		ref.save("Nara lokesh");
		ref.display();

	}

}
