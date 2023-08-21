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

public class MinisterDTO implements Serializable{
	
	private String ministerName;
	private int exp;
	private String designation;
	private String partyName;
	
	

}
