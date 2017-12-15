package com.epam.testng.basictests;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.epam.testng.parameterizedtests.ParentCalculatorTests;

public class BasicNegativeNumbersTest extends ParentCalculatorTests {

	@Test(groups = { "smoke", "negatives" })
	public void checkValueNegative() {
		assertTrue(calculator.isNegative(-2L));

	}

	@Test(groups = { "smoke", "negatives" })
	public void checkValuePositive() {
		assertFalse(calculator.isNegative(2L));

	}

	@Test(groups = { "smoke", "negatives" })
	public void checkZero() {
		assertFalse(calculator.isNegative(0));

	}

}
