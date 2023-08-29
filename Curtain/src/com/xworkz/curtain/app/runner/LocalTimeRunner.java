package com.xworkz.curtain.app.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeRunner {

	public static void main(String[] args) {
		
		
		LocalDate localDate=LocalDate.now();
		System.out.println(localDate);
		
		LocalDate past=LocalDate.of(2000, 11, 12);
		System.out.println(past);
		
		LocalDate future=LocalDate.of(2024, 11, 12);
		System.out.println(future);
		
		boolean check=localDate.isAfter(past);
		System.out.println(check);
		
		boolean check1=localDate.isBefore(future);
		System.out.println(check1);
		
		LocalDateTime localDateTime=LocalDateTime.now();
		System.out.println(localDateTime);
		
		LocalDateTime past1=LocalDateTime.of(2000,11, 12, 1, 12, 32, 23);
		System.out.println(past1);
		
		LocalDateTime future1=LocalDateTime.of(2025,12, 11, 2, 12, 32, 23);
		System.out.println(future1);
		
		boolean checks=localDateTime.isAfter(past1);
		System.out.println(checks);
		
		boolean checks1=localDateTime.isBefore(future1);
		System.out.println(checks1);
		
		boolean checks2=localDateTime.isEqual(past1);
		System.out.println(checks2);
		
		boolean checks3=localDateTime.isEqual(future1);
		System.out.println(checks3);
		

	}

}
