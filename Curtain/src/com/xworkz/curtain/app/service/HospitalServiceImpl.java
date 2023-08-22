package com.xworkz.curtain.app.service;

import com.xworkz.curtain.app.dto.HospitalDTO;

import com.xworkz.curtain.app.repository.HospitalRepository;
import com.xworkz.curtain.app.repository.HospitalRepositoryImpl;
import com.xworkz.curtain.app.util.ValidationUtil;

public class HospitalServiceImpl implements HospitalService {

	@Override
	public boolean validateAndSave(HospitalDTO hospitalDTO) {
		
		if(hospitalDTO!=null)
		{
			System.out.println("Valid data,can save..");
			System.out.println("Args passed :" +hospitalDTO);
			String name=hospitalDTO.getHospitalName();
			String location=hospitalDTO.getLocation();
			int doctors=hospitalDTO.getNoOfDoctors();
			int beds=hospitalDTO.getNoOfBeds();
			
			if(ValidationUtil.validateString(name))
			{
				System.out.println("Name is Valid...");
			}
			else
			{
				System.err.println("Name is Invalid...");
				return false;
			}
			
			if(ValidationUtil.validateString(location))
			{
				System.out.println("location is Valid...");
			}
			else
			{
				System.err.println("location is Invalid...");
				return false;
			}
			
			if(ValidationUtil.validateInt(doctors))
			{
				System.out.println("Doctors is Valid...");
			}
			else
			{
				System.err.println("Doctors is Invalid...");
				return false;
			}
			
			if(ValidationUtil.validateInt(beds))
			{
				System.out.println("Beds is Valid...");
			}
			else
			{
				System.err.println("Beds is Invalid...");
				return false;
			}
			System.out.println("All the data of the Hospital is Valid...");
			HospitalRepository hospitalRepository=new HospitalRepositoryImpl();
			hospitalRepository.save(hospitalDTO);
			return true;
			
		}
		else
		{
			System.err.println("Invalid data,can't save..");
		}
		return false;
	}

}
