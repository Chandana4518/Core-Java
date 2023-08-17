package com.xworkz.model.app.repository;

import com.xworkz.model.app.dto.MetroStaffDTO;

public class MetroStaffRepositoryImpl implements MetroStaffRepository{
	
	private MetroStaffDTO[] metro=new MetroStaffDTO[TOTAL_WORKERS];
	private int temp=0;

	@Override
	public void save(MetroStaffDTO metroStaffDTO) {
		System.out.println("Invoking MetroStaffDTO in MetroStaffDTOImpl");
		
		if(this.temp<TOTAL_WORKERS)
		{
			this.metro[temp]=metroStaffDTO;
			System.out.println("Saving data about the MetroStaff...");
			temp++;
		}
		else
		{
			System.out.println("Array is full,can't save");
		}
		
	}

}
