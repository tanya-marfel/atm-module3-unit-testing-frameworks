package com.epam.testng.parameterizedtests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class PositiveNumbersTest extends ParentCalculatorTests {
	private long value;
	private boolean shouldBePositive;

	@Factory(dataProvider = "positiveNumbersTest")
	public PositiveNumbersTest(long value, boolean shouldBePositive) {
		this.value = value;
		this.shouldBePositive = shouldBePositive;
	}

	@Test(groups = { "criticalPath", "positives" })
	public void checkValuePositive() {
		assertTrue(calculator.isPositive(value) == shouldBePositive);

	}

	@DataProvider(name = "positiveNumbersTest")
	public static Object[][] testValues() {
		return new Object[][] { { 1, true }, { -1, false }, { -1000, false }, { 0, false }, { -(-6), true } };
	}
}
