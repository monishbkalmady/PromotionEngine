package com.promo.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.promo.main.ShoppingCartUtil;

class PromotionJUnit {

	@Test
	void sampleTest() {
		ShoppingCartUtil cart = new ShoppingCartUtil();
		assertEquals(0.0, cart.getTotalPrice());
	}

}
