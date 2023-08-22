package com.xworkz.curtain.app.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

public class HospitalDTO implements Serializable{
	
	private String hospitalName;
	private String location;
	private int noOfDoctors;
	private int noOfBeds;
	

}
