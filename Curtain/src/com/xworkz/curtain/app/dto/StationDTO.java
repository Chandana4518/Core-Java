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

public class StationDTO implements Serializable{
	
	private String stationType;
	private String location;
	private int platformNo;
	private int ticketPrice;

}
