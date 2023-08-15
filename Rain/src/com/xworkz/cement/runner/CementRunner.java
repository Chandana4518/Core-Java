package com.xworkz.cement.runner;

import com.xworkz.cement.app.Cement;

public class CementRunner {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Cement cement=new Cement();
		cement.setKgs(25);
		cement.setBrand("ACC");
		cement.setOwner("Ajay kapur");
		cement.setPrice(400);
		System.out.println(cement.toString());
		
		Cement cement1=(Cement)cement.clone();
		cement1.setKgs(20);
		cement1.setBrand("Ambuja");
		cement1.setOwner("Adithya");
		cement1.setPrice(300);
		System.out.println(cement1.toString());
		
		Cement cement2=(Cement)cement.clone();
		cement2.setKgs(50);
		cement2.setBrand("UltraTech");
		cement2.setOwner("Shankar");
		cement2.setPrice(600);
		System.out.println(cement2.toString());
		
		Cement cement3=(Cement)cement.clone();
		cement3.setKgs(30);
		cement3.setBrand("JK");
		cement3.setOwner("Akhay");
		cement3.setPrice(450);
		System.out.println(cement3.toString());
		
		Cement cement4=(Cement)cement.clone();
		cement4.setKgs(25);
		cement4.setBrand("Shree");
		cement4.setOwner("Jaya");
		cement4.setPrice(250);
		System.out.println(cement4.toString());
		
		Cement cement5=(Cement)cement.clone();
		cement5.setKgs(35);
		cement5.setBrand("Ramco");
		cement5.setOwner("Klin");
		cement5.setPrice(500);
		System.out.println(cement5.toString());
		
		Cement cement6=(Cement)cement.clone();
		cement6.setKgs(30);
		cement6.setBrand("Birla");
		cement6.setOwner("Kumar");
		cement6.setPrice(450);
		System.out.println(cement6.toString());
		
		Cement cement7=(Cement)cement.clone();
		cement7.setKgs(45);
		cement7.setBrand("Binani");
		cement7.setOwner("Neeraj");
		cement7.setPrice(550);
		System.out.println(cement7.toString());
		
		Cement cement8=(Cement)cement.clone();
		cement8.setKgs(25);
		cement8.setBrand("India");
		cement8.setOwner("Srinivasan");
		cement8.setPrice(450);
		System.out.println(cement8.toString());
		
		Cement cement9=(Cement)cement.clone();
		cement9.setKgs(30);
		cement9.setBrand("Nagarjuna");
		cement9.setOwner("Kumar");
		cement9.setPrice(550);
		System.out.println(cement9.toString());
		
		
		
		

	}

}
