package com.promo.main;

import com.promo.model.Item;

public class ShoppingCartUtil {
	private Item item;
	public ShoppingCartUtil(Item item) {
		this.item = item;
	}

	public Double getTotalPrice() {
		
		return item.getItemPrice();
	}

}
