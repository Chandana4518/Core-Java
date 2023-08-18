package com.xworkz.model.runner;

import com.xworkz.model.app.dto.CustomerDTO;
import com.xworkz.model.app.repository.CustomerRepository;
import com.xworkz.model.app.repository.CustomerRepositoryImpl;

public class CustomerRunner {

	public static void main(String[] args) {
		
		CustomerDTO customerDTO=new CustomerDTO("Jack",23,9834092586L,"Bangalore",5.0f);
		CustomerRepository CustomerRepository=new CustomerRepositoryImpl();
		System.out.println(customerDTO);
		CustomerRepository.save(customerDTO);
		
		CustomerDTO customerDTO1=new CustomerDTO("Klen",33,8734092586L,"Anantapur",5.8f);
		System.out.println(customerDTO1);
		CustomerRepository.save(customerDTO1);
		
		CustomerDTO customerDTO2=new CustomerDTO("Mahesh",20,7734092586L,"Chittor",4.8f);
		System.out.println(customerDTO2);
		CustomerRepository.save(customerDTO2);
		
		CustomerDTO customerDTO3=new CustomerDTO("Adithya",13,6734092586L,"Mysore",6.0f);
		System.out.println(customerDTO3);
		CustomerRepository.save(customerDTO3);
		
		CustomerDTO customerDTO4=new CustomerDTO("Harish",28,8739092586L,"Hyderabad",4.6f);
		System.out.println(customerDTO4);
		CustomerRepository.save(customerDTO4);
		
		System.out.println("===============================");
		CustomerDTO dto=CustomerRepository.findByCustomerName("Harish");
		System.out.println(dto);
		
		CustomerDTO dto1=CustomerRepository.findByCustomerAge(20);
		System.out.println(dto1);
		
		CustomerDTO dto2=CustomerRepository.findByCustomerLocation("Anantapur");
		System.out.println(dto2);
		
		CustomerDTO[] dto3=CustomerRepository.readAll();
		for(int index=0;index<dto3.length;index++)
		{
			if(dto3[index]!=null)
			{
				System.out.println(dto3[index]);
			}
		}


	}

}
