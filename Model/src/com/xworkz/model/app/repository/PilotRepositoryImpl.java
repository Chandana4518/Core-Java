package com.xworkz.model.app.repository;

import com.xworkz.model.app.dto.PilotDTO;

public class PilotRepositoryImpl implements PilotRepository{
	
	private int temp=0;
	private PilotDTO[] pilot=new PilotDTO[TOTAL];

	@Override
	public void save(PilotDTO pilotDTO) 
	{
		System.out.println("Invoking PilotDTO in PilotRepositoryImpl");
		if(this.temp<TOTAL)
		{
			this.pilot[temp]=pilotDTO;
			System.out.println("Saving data about the Pilot...");
			temp++;
		}
		else
		{
			System.out.println("Array is full,can't save");
		}
		
		
	}

	@Override
	public PilotDTO findByPilotFitness(boolean fitness) {
		for(int index=0;index<temp;index++)
		{
			if(pilot[index].isFitness()==fitness)
			{
				System.out.println("Pilot Fitness  is Found");
				return pilot[index];
			}
			System.out.println("Fitness is not matched,moving to next index");
		}
		System.out.println("Pilot Fitness  is not Found");
		return null;
	}

	@Override
	public PilotDTO findByPilotAge(int age) {
		for(int index=0;index<temp;index++)
		{
			if(pilot[index].getAge()==age)
			{
				System.out.println("Pilot Age  is Found");
				return pilot[index];
			}
			System.out.println("Age is not matched,moving to next index");
		}
		System.out.println("Pilot Age  is not Found");
		return null;
	}

	@Override
	public PilotDTO findByPilotSalary(long salary) {
		for(int index=0;index<temp;index++)
		{
			if(pilot[index].getSalary()==salary)
			{
				System.out.println("Pilot Salary  is Found");
				return pilot[index];
			}
			System.out.println("Salary is not matched,moving to next index");
		}
		System.out.println("Pilot Salary  is not Found");
		return null;
	}

	@Override
	public PilotDTO[] readAll() {
		System.out.println("Invoking readAll method in PilotRepositoryImpl");
		return pilot;
	}

}
