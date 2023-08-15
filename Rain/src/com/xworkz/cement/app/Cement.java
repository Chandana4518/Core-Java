package com.xworkz.cement.app;

public class Cement implements Cloneable{
	
	private int price;
	private int kgs;
	private String brand;
	private String owner;
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getKgs() {
		return kgs;
	}
	public void setKgs(int kgs) {
		this.kgs = kgs;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Kgs of Cement is :" + kgs + " Brand name of the cement is :" + brand +
				" Owner name of the cement is :" + owner + " Price of the cement is :" + price ;
				}
	
	@Override
	public Object clone() throws CloneNotSupportedException 
	{
		Cement cement=(Cement)super.clone();
		return cement;
	}

}
