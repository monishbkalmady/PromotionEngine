package com.promo.main;

import com.promo.model.Item;

public class ShoppingCartUtil {
	private Item itemA, itemB, itemC, itemD;
	
	public ShoppingCartUtil(Item item1, Item item2, Item item3, Item item4) {
		this.itemA = item1;
		this.itemB = item2;
		this.itemC = item3;
		this.itemD = item4;
	}
	
	/*
	 * Returns total price after applying promotions to all the selected items
	 */
	public Double getTotalPrice() {
		double totalPrice = 0.0;
		// Restructuring the code 

		totalPrice += itemA != null ? itemA.getItemPrice() : 0.0;
		totalPrice += itemB != null ? itemB.getItemPrice() : 0.0;
		
		// check if both items are present to avail benefits
		if(itemC != null && itemD != null) {
			totalPrice += itemC.getPromotionCD(itemD);
		} else {
			totalPrice += itemC != null ? itemC.getItemPrice() : 0.0;
			totalPrice += itemD != null ? itemD.getItemPrice() : 0.0;
		}

		return totalPrice;
	}

}
