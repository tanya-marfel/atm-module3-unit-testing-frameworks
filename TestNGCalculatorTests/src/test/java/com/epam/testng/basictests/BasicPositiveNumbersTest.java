package com.epam.testng.basictests;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.epam.testng.parameterizedtests.ParentCalculatorTests;

public class BasicPositiveNumbersTest extends ParentCalculatorTests {
	@Test(groups = { "smoke", "positives" })
	public void checkValueNegative() {
		assertTrue(calculator.isPositive(2L));

	}

	@Test(groups = { "smoke", "positives" })
	public void checkValuePositive() {
		assertFalse(calculator.isPositive(-2L));

	}

	@Test(groups = { "smoke", "positives" })
	public void checkZero() {
		assertFalse(calculator.isPositive(0));

	}
}
