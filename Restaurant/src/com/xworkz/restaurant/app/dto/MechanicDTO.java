package com.xworkz.restaurant.app.dto;

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

public class MechanicDTO implements Serializable{
	
	private String garageName;
	private String gstNo;
	private String specialization;
	private int bikeServiceCost;
	

}
