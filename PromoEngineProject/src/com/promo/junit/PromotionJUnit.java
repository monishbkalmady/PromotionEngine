package com.promo.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.promo.main.ShoppingCartUtil;
import com.promo.model.Item;

class PromotionJUnit {

	@Test
	void sampleTest() {
		ShoppingCartUtil cart = new ShoppingCartUtil(new Item("A", 2), new Item("B", 3), new Item("C", 1), new Item("D", 2));
		assertEquals(240.0, cart.getTotalPrice());
	}

}
