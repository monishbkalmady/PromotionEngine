package com.promo.model;

public class Item {
	private String name;
	private int quantity;
	
	private int priceA = 50;
	
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
		// TODO Auto-generated method stub
		return 0.0;
	}

}
