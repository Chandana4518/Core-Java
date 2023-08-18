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

	@Override
	public MetroStaffDTO findByMetroName(String name) 
	{
		for(int index=0;index<temp;index++)
		{
			if(metro[index].getMetroName()==name)
			{
				System.out.println("Metro Name is Found");
				return metro[index];
			}
			System.out.println("Name is not matched,moving to next index");
		}
		System.out.println("MetroName is not Found");
		return null;
	}

	@Override
	public MetroStaffDTO findByStaffMemberSalary(int salary) {
		for(int index=0;index<temp;index++)
		{
			if(metro[index].getSalary()==salary)
			{
				System.out.println("Staff Memeber Salary is Found");
				return metro[index];
			}
			System.out.println("Salary is not matched,moving to next index");
		}
		System.out.println("Staff Member Salary is not Found");
		return null;
	}

	@Override
	public MetroStaffDTO findByStaffMemberAge(int age) {
		for(int index=0;index<temp;index++)
		{
			if(metro[index].getAge()==age)
			{
				System.out.println("Staff Member Age is Found");
				return metro[index];
			}
			System.out.println("Age is not matched,moving to next index");
		}
		System.out.println("Staff Member Age is not Found");
		return null;
	}

	@Override
	public MetroStaffDTO[] readAll() {
		System.out.println("Invoking readAll method in MetroStaffRepositoryImpl");
		return metro;
	}

}
