package com.epam.junit.basictests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class BasicMultDoublesTest extends ParentCalculatorTests {

	@Test
	public void multPositiveDoubles() {
		double result = calculator.mult(1D, 1D);
		assertEquals(result, 1D, "Invalid operation result");
	}

	@Test
	public void multNegativeLongs() {
		double result = calculator.mult(-9223372036854775807D, -9223372036854775807D);
		assertEquals(result, 8.507059173023462E37, "Invalid operation result");
	}

	@Test
	public void multNegativeaAndPositiveLongs() {
		double result = calculator.mult(-1D, 9D);
		assertEquals(result, -9D, "Invalid operation result");
	}
}
