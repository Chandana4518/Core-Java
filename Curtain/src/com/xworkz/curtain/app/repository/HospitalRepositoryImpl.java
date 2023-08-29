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

	@Override
	public HospitalDTO findByHospitalName(String name) {
		for(int index=0;index<temp;index++)
		{
			if(dtos[index].getHospitalName().equalsIgnoreCase(name))
				{
					System.out.println("Found name");
					return dtos[index];
				}
			System.out.println("Name is not matched,moving next index");
		}
		System.err.println("Name not Found");
		return null;
	}

	@Override
	public HospitalDTO findByNameAndDoctors(String name, int doctors) {
		for(int index=0;index<temp;index++)
		{
			if(dtos[index].getHospitalName().equalsIgnoreCase(name) && dtos[index].getNoOfDoctors()==(doctors))
			{
				System.out.println("Found name and Doctors");
				return dtos[index];
			}
			System.out.println("Name and Doctors is not matched,moving next index");
		}
		System.err.println("Name and doctors is not found");
		return null;
	}

}
