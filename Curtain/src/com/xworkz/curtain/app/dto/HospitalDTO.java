package com.xworkz.curtain.app.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString (callSuper=true)
@EqualsAndHashCode

public class HospitalDTO extends AbstractDTO implements Serializable{
	
	private String hospitalName;
	private String location;
	private int noOfDoctors;
	private int noOfBeds;
	

}
