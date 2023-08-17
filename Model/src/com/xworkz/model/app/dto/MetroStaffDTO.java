package com.xworkz.model.app.dto;

import java.io.Serializable;

public class MetroStaffDTO implements Serializable{
	
	private String workerName;
	private String metroName;
	private int age;
	private String location;
	private int salary;
	public MetroStaffDTO() {
		System.out.println("Running no-args const in MetroStaffDTO");
	}
	public MetroStaffDTO(String workerName, String metroName, int age, String location, int salary) {
		super();
		this.workerName = workerName;
		this.metroName = metroName;
		this.age = age;
		this.location = location;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "MetroStaffDTO [workerName=" + workerName + ", metroName=" + metroName + ", age=" + age + ", location="
				+ location + ", salary=" + salary + "]";
	}
	public String getWorkerName() {
		return workerName;
	}
	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}
	public String getMetroName() {
		return metroName;
	}
	public void setMetroName(String metroName) {
		this.metroName = metroName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
