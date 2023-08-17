package com.xworkz.model.runner;

import com.xworkz.model.app.dto.MetroStaffDTO;
import com.xworkz.model.app.repository.MetroStaffRepository;
import com.xworkz.model.app.repository.MetroStaffRepositoryImpl;

public class MetroStaffRunner {

	public static void main(String[] args) {
		
		MetroStaffDTO metroStaffDTO=new MetroStaffDTO("Kumar","Hoodi Junction",40,"Bangalore",20000);
		MetroStaffRepository metroStaffRepository=new MetroStaffRepositoryImpl();
		System.out.println(metroStaffDTO);
		metroStaffRepository.save(metroStaffDTO);
		
		MetroStaffDTO metroStaffDTO1=new MetroStaffDTO("John","Nallurhalli Junction",30,"Hyderabad",18000);
		System.out.println(metroStaffDTO1);
		metroStaffRepository.save(metroStaffDTO1);
		
		MetroStaffDTO metroStaffDTO2=new MetroStaffDTO("Jack"," Madavar",33,"Chennai",18050);
		System.out.println(metroStaffDTO2);
		metroStaffRepository.save(metroStaffDTO2);
		
		MetroStaffDTO metroStaffDTO3=new MetroStaffDTO("Merry"," Bommanahalli",30,"Bangalore",18500);
		System.out.println(metroStaffDTO3);
		metroStaffRepository.save(metroStaffDTO3);
		
		MetroStaffDTO metroStaffDTO4=new MetroStaffDTO("Hussan"," Express",28,"Mysore",22000);
		System.out.println(metroStaffDTO4);
		metroStaffRepository.save(metroStaffDTO4);
		

	}

}
