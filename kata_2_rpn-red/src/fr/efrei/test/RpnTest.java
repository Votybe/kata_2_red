package fr.efrei.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

import fr.efrei.main.Rpn;

public class RpnTest {
	@Test
	void parse_should_return_array_element() {
		
		Rpn rpn = new Rpn();
		
		assertArrayEquals(new int[]{1}, rpn.parse("1"));
	}
}
