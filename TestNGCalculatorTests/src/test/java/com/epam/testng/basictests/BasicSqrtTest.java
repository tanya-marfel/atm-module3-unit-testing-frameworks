package com.epam.testng.basictests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.epam.testng.parameterizedtests.ParentCalculatorTests;

public class BasicSqrtTest extends ParentCalculatorTests {
	@Test(groups = { "smoke", "squareRoot" })
	public void testPositiveNumbers() {
		double result = calculator.sqrt(4D);
		assertEquals(result, 2D, "Invalid operation result");
	}

	@Test(groups = { "extended", "squareRoot" })
	public void testNegativeNumbers() {
		double result = calculator.sqrt(-4D);
		assertTrue(result == Double.NaN, "Invalid operation result");
	}

	@Test(groups = { "criticalPath", "squareRoot" })
	public void testZero() {
		double result = calculator.sqrt(0D);
		assertEquals(result, 0D, "Invalid operation result");
	}
}
