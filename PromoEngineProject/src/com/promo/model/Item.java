package com.promo.model;

public class Item {
	private String name;
	private int quantity;
	
	//Defining constants i.e, the price of each product
	private double priceA = 50;
	private double priceB = 30;
	private double priceC = 20;
	private double priceD = 15;
	
	// Defining constants for minimum number of quantities applicable for promotion
	private int promoQtyA = 3;
	private int promoQtyB = 2;
	
	// Defining constants for promotional prices corresponding to quantities
	private int promoPriceA = 130;
	private int promoPriceB = 45;
	private int promoPriceCD = 30;
	
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
			if(quantity >= promoQtyA) {
				totalPrice = getPromotions();
			} else {
				totalPrice = quantity * priceA;
			}
			break;
		case "B":
			if(quantity >= promoQtyB) {
				totalPrice = getPromotions();
			} else {
				totalPrice = quantity * priceB;
			}
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
	
	private double getPromotions() {
		double promoValue = 0.0;
		switch(this.name) {
		case "A":
			promoValue = (int)(this.quantity/promoQtyA)*promoPriceA + (this.quantity%promoQtyA)*priceA;
			break;
		case "B":
			promoValue = (int)(this.quantity/promoQtyB)*promoPriceB + (this.quantity%promoQtyB)*priceB;
			break;
		}
		return promoValue;
	}

}
