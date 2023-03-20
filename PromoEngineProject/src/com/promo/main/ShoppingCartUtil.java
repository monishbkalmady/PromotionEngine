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
		double totalPrice = itemA.getItemPrice() + itemB.getItemPrice() + itemC.getItemPrice() + itemD.getItemPrice();
		return totalPrice;
	}

}
