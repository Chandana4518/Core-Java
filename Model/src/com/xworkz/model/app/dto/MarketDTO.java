package com.xworkz.model.app.dto;

import java.io.Serializable;

public class MarketDTO implements Serializable{
	
	private String marketName;
	private String type;
	private int capacity;
	private int noOfItems;
	private String ownerName;
	
	public MarketDTO()
	{
		System.out.println("Running no-args const in Market");
	}
	public MarketDTO(String marketName, String type, int capacity, int noOfItems, String ownerName)
	{
		this.marketName = marketName;
		this.type = type;
		this.capacity = capacity;
		this.noOfItems = noOfItems;
		this.ownerName = ownerName;
	}
	
	@Override
	public String toString() {
		return "Market [marketName=" + marketName + ", type=" + type + ", capacity=" + capacity + ", noOfItems="
				+ noOfItems + ", ownerName=" + ownerName + "]";
	}
	public String getMarketName() {
		return marketName;
	}
	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getNoOfItems() {
		return noOfItems;
	}
	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	

}
