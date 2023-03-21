package com.promo.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.promo.main.ShoppingCartUtil;
import com.promo.model.Item;

class PromotionJUnit {
	
	/**
	 * @author monish
	 * Junit test to verify total value of items without any promotions
	 */
	@Test
	void sampleTest() {
		ShoppingCartUtil cart = new ShoppingCartUtil(new Item("A", 2), new Item("B", 1), new Item("C", 1), new Item("D", 2));
		assertEquals(175.0, cart.getTotalPrice());
	}
	
	@Test
	void testScenario1() {
		ShoppingCartUtil cart = new ShoppingCartUtil(new Item("A", 1), new Item("B", 1), new Item("C", 1), null);
		assertEquals(100.0, cart.getTotalPrice());
	}
	
	@Test
	void testScenario2() {
		ShoppingCartUtil cart = new ShoppingCartUtil(new Item("A", 5), new Item("B", 5), new Item("C", 1), null);
		assertEquals(370.0, cart.getTotalPrice());
	}
	
	@Test
	void testScenario3() {
		ShoppingCartUtil cart = new ShoppingCartUtil(new Item("A", 3), new Item("B", 5), new Item("C", 1), new Item("D", 1));
		assertEquals(280.0, cart.getTotalPrice());
	}

}
