package com.xworkz.model.app.repository;

import com.xworkz.model.app.dto.CustomerDTO;

public class CustomerRepositoryImpl implements CustomerRepository{
	
	private CustomerDTO[] customer=new CustomerDTO[TOTAL_CUSTOMERS];
	private int temp=0;

	@Override
	public void save(CustomerDTO customerDTO) {
		System.out.println("Invoking CustomerDTO in CustomerDTOImpl");
		
		if(this.temp<TOTAL_CUSTOMERS)
		{
			this.customer[temp]=customerDTO;
			System.out.println("Saving data about the Customer...");
			temp++;
		}
		else
		{
			System.out.println("Array is full,can't save");
		}
		
		
	}

	@Override
	public CustomerDTO findByCustomerName(String name) 
	{
		for(int index=0;index<temp;index++)
		{
			if(customer[index].getName()==name)
			{
				System.out.println("Customer Name is Found");
				return customer[index];
			}
			System.out.println("Name is not matched,moving to next index");
		}
		System.out.println("Customer Age is not found in array...");
		return null;
	}

	@Override
	public CustomerDTO findByCustomerAge(int age) 
	{
		for(int index=0;index<temp;index++)
		{
			if(customer[index].getAge()==age)
			{
				System.out.println("Customer Age is Found");
				return customer[index];
			}
			System.out.println("Age is not matched,moving to next index");
		}
		System.out.println("Customer Age is not found in array...");
		return null;
	}

	@Override
	public CustomerDTO findByCustomerLocation(String location) 
	{
		for(int index=0;index<temp;index++)
		{
			if(customer[index].getLocation()==location)
			{
				System.out.println("Customer Location is Found");
				return customer[index];
			}
			System.out.println("Location is not matched,moving next index");
		}
		System.out.println("Customer Location is not found in array...");
		return null;
	}

	@Override
	public CustomerDTO[] readAll() {
		System.out.println("Invoking readAll method in CustomerRepositoryImpl");
		return customer;
	}

}
