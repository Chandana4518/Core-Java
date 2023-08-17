package com.xworkz.model.app.dto;

import java.io.Serializable;

public class PilotDTO implements Serializable{
	
	private String name;
	private String location;
	private boolean fitness;
	private long salary;
	private int age;
	public PilotDTO() {
		System.out.println("Running no-args const in PilotDTO");
	}
	public PilotDTO(String name, String location, boolean fitness, long salary, int age) {
		super();
		this.name = name;
		this.location = location;
		this.fitness = fitness;
		this.salary = salary;
		this.age = age;
	}
	@Override
	public String toString() {
		return "PilotDTO [name=" + name + ", location=" + location + ", fitness=" + fitness + ", salary=" + salary
				+ ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public boolean isFitness() {
		return fitness;
	}
	public void setFitness(boolean fitness) {
		this.fitness = fitness;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
