package fr.efrei.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fr.efrei.main.Rpn;

public class RpnTest {
	@Test
	void one_element_return_element() {
		
		Rpn rpn = new Rpn();
		
		assertEquals(1, rpn.same(1));
	}
}
