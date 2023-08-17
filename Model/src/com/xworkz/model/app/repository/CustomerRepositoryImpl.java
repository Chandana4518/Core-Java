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

}
