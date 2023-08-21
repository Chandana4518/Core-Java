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


public class ThiefDTO implements Serializable{
	
	private String specialization;
	private int exp;
	private int age;
	private String gangName;
	private int totalCases;

}
