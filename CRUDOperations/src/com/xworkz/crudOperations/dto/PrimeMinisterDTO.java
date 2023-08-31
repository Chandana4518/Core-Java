package com.xworkz.crudOperations.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

public class PrimeMinisterDTO implements Serializable{
	
	private int id;
	private String name;
	private String country;
	private String partyName;

}
