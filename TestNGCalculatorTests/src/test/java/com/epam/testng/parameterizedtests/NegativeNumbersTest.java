package com.epam.testng.parameterizedtests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class NegativeNumbersTest extends ParentCalculatorTests {
	private long value;
	private boolean shouldBeNegative;

	@Factory(dataProvider = "positiveTest")
	public NegativeNumbersTest(long value, boolean shouldBeNegative) {
		this.value = value;
		this.shouldBeNegative = shouldBeNegative;
	}

	@Test(groups = { "criticalPath", "negatives" })
	public void checkValuePositive() {		
		assertTrue(calculator.isNegative(value) == shouldBeNegative);
		
	}

	@DataProvider(name = "positiveTest")
	public static Object[][] valuesForCheck() {
		return new Object[][] { { 1, false }, { -1, true }, { -1000, true }, { 0, false }, 
			{ -(-6), false }
			};
	}
}

