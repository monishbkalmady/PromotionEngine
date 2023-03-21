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
	
	/**
	 * @author monish
	 * Method to check and calculate promo benefits for an item
	 * @return Item price after promotional benefits
	 */
	public Double getItemPrice() {
		String name = this.name;
		int quantity = this.quantity;
		double totalPrice = 0.0;
		switch(name) {
		case "A":
			if(quantity >= promoQtyA) {
				totalPrice = (int)(quantity/promoQtyA)*promoPriceA + (quantity%promoQtyA)*priceA;
			} else {
				totalPrice = quantity * priceA;
			}
			break;
		case "B":
			if(quantity >= promoQtyB) {
				totalPrice = (int)(quantity/promoQtyB)*promoPriceB + (quantity%promoQtyB)*priceB;
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
	
	// defining new method to provide promotional discount if items C and D are present
	public double getPromotionCD(Item itemD) {
		double quantC = this.quantity;
		double quantD = itemD.quantity;
		double totalVal = 0.0;
		if(quantC == quantD) {
			totalVal = quantC * promoPriceCD;
		} else if(quantC > quantD) {
			totalVal = (quantD * promoPriceCD) + (quantC-quantD) * priceC;
		} else {
			totalVal = (quantC * promoPriceCD) + (quantD-quantC) * priceD;
		}
		return totalVal;
	}

}
