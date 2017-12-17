package com.epam.junit.basictests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class BasicSqrtTest extends ParentCalculatorTests {
	@Test
	public void testPositiveNumbers() {
		double result = calculator.sqrt(4D);
		assertEquals(result, 2D, "Invalid operation result");
	}

	@Test
	public void testNegativeNumbers() {
		double result = calculator.sqrt(-4D);
		assertTrue(result == Double.NaN, "Invalid operation result");
	}

	@Test
	public void testZero() {
		double result = calculator.sqrt(0D);
		assertEquals(result, 0D, "Invalid operation result");
	}
}
