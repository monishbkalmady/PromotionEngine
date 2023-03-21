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

	public Double getTotalPrice() {
		double totalPrice = 0.0;
		// Adding null checks for every item object
		if(itemA != null) {
			totalPrice += itemA.getItemPrice();
		}
		if(itemB != null) {
			totalPrice += itemB.getItemPrice();
		}
		// check if both items are present to avail benefits
		if(itemC != null && itemD != null) {
			totalPrice += itemC.getPromotionCD(itemD);
		} else {
			if(itemC != null) {
				totalPrice += itemC.getItemPrice();
			}
			if(itemD != null) {
				totalPrice += itemD.getItemPrice();
			}
		}
		if(itemD != null) {
			totalPrice += itemD.getItemPrice();
		}

		return totalPrice;
	}

}
