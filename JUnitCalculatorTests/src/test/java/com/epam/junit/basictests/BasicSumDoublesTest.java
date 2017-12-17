package com.epam.junit.basictests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class BasicSumDoublesTest extends ParentCalculatorTests {
	@Test
	public void sumNegativeLongs() {
		double result = calculator.sum(-1D, -1D);
		assertEquals(result, -2D, "Invalid operation result");
	}

	@Test
	public void sumPositiveLongs() {
		double result = calculator.sum(1D, 1D);
		assertEquals(result, 2D, "Invalid operation result");
	}

	@Test
	public void sumPositiveAndNegativeLongs() {
		double result = calculator.sum(-1D, 9D);
		assertEquals(result, 8D, "Invalid operation result");
	}
}
