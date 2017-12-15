package com.epam.testng.basictests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.epam.testng.parameterizedtests.ParentCalculatorTests;

public class BasicSumDoublesTest extends ParentCalculatorTests {
	@Test(groups = { "smoke", "addition", "doubles" })
	public void sumNegativeLongs() {
		double result = calculator.sum(-1D, -1D);
		assertEquals(result, -2D, "Invalid operation result");
	}

	@Test(groups = { "smoke", "addition", "doubles" })
	public void sumPositiveLongs() {
		double result = calculator.sum(1D, 1D);
		assertEquals(result, 2D, "Invalid operation result");
	}

	@Test(groups = { "smoke", "addition", "doubles" })
	public void sumPositiveAndNegativeLongs() {
		double result = calculator.sum(-1D, 9D);
		assertEquals(result, 8D, "Invalid operation result");
	}

}
