package com.xworkz.curtain.app.repository;

import com.xworkz.curtain.app.dto.HospitalDTO;

public class HospitalRepositoryImpl implements HospitalRepository {
	
	private HospitalDTO[] dtos=new HospitalDTO[TOTAL_ITEMS];
	private int temp=0;

	@Override
	public void save(HospitalDTO hospitalDTO) {
		
		if(temp<TOTAL_ITEMS)
		{
			System.out.println("Invoking save method in HospitalRepositoryImpl");
			this.dtos[temp]=hospitalDTO;
			System.out.println("The element at index :" +temp);
			temp++;
		}
		else
		{
			System.err.println("Array is full,can't save..");
		}
	}

}
