package com.xworkz.model.app.repository;

import com.xworkz.model.app.dto.MetroStaffDTO;

public interface MetroStaffRepository {
	
	int TOTAL_WORKERS=5;
	
	void save(MetroStaffDTO metroStaffDTO);
	
	public MetroStaffDTO findByMetroName(String name);
	
	public MetroStaffDTO findByStaffMemberSalary(int salary);
	
	public MetroStaffDTO findByStaffMemberAge(int age);
	
	public MetroStaffDTO[] readAll();
	
	

}
