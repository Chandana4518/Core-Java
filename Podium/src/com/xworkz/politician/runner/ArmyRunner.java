package com.xworkz.politician.runner;

import com.xworkz.politician.app.repository.ArmyRepository;
import com.xworkz.politician.app.repository.ArmyRepositoryImpl;

public class ArmyRunner {

	public static void main(String[] args) {
		
		ArmyRepository ref=new ArmyRepositoryImpl();
		ref.save("Battalion");
		ref.save("The clan");
		ref.save("Armed");
		ref.save("Top Gunners");
		ref.save("Machines of war");
		ref.display();

	}

}
