package com.epam.junit.basictests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class BasicPowTest extends ParentCalculatorTests {

	@Test
	public void testPowOne() {
		double result = calculator.pow(1D, 1D);
		assertEquals(result, 1D);
	}

	@Test
	public void testPowTwo() {
		double result = calculator.pow(2D, 2D);
		assertEquals(result, 4D);
	}

	@Test
	public void testPowNegativeTwo() {
		double result = calculator.pow(2D, -2D);
		assertEquals(result, 0.25);
	}

	@Test
	public void testPowTwoOfRation() {
		double result = calculator.pow(2.35D, 2D);
		assertEquals(result, 5.5225);
	}
}
