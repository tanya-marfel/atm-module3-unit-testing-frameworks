package com.epam.testng.basictests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.epam.testng.parameterizedtests.ParentCalculatorTests;

public class BasicSubDoublesTest extends ParentCalculatorTests {
	@Test(groups = { "smoke", "subtraction", "doubles" })
	public void subNegativeLongs() {
		double result = calculator.sub(-1D, -1D);
		assertEquals(result, 0D, "Invalid operation result");
	}

	@Test(groups = { "smoke", "subtraction", "doubles" })
	public void subPositiveLongs() {
		double result = calculator.sub(1D, 1D);
		assertEquals(result, 0D, "Invalid operation result");
	}

	@Test(groups = { "smoke", "subtraction", "doubles" })
	public void subPositiveAndNegativeLongs() {
		double result = calculator.sub(-1D, 9D);
		assertEquals(result, -10D, "Invalid operation result");
	}

}
