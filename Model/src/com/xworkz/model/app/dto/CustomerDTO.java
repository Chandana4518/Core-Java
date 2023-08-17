package com.xworkz.model.app.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable{
	
	private String name;
	private int age;
	private long contactNumber;
	private String location;
	private float height;
	public CustomerDTO() {
		System.out.println("Running no-args const in CustomarDTO");
	}
	public CustomerDTO(String name, int age, long contactNumber, String location, float height) {
		super();
		this.name = name;
		this.age = age;
		this.contactNumber = contactNumber;
		this.location = location;
		this.height = height;
	}
	@Override
	public String toString() {
		return "CustomarDTO [name=" + name + ", age=" + age + ", contactNumber=" + contactNumber + ", location="
				+ location + ", height=" + height + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
	

}
