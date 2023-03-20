package com.promo.model;

public class Item {
	private String name;
	private int quantity;
	
	//Defining constants i.e, the price of each product
	private double priceA = 50;
	private double priceB = 30;
	private double priceC = 20;
	private double priceD = 15;
	
	public Item(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getItemPrice() {
		String name = this.name;
		int quantity = this.quantity;
		double totalPrice = 0.0;
		switch(name) {
		case "A":
			totalPrice = quantity * priceA;
			break;
		case "B":
			totalPrice = quantity * priceB;
			break;
		case "C":
			totalPrice = quantity * priceC;
			break;
		case "D":
			totalPrice = quantity * priceD;
			break;
		}
		return totalPrice;
	}

}
