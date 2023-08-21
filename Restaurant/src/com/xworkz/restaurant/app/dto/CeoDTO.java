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

public class CeoDTO implements Serializable {
	
	private String name;
	private String companyName;
	private long salary;
	private int experience;

}
