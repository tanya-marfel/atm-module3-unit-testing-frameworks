package com.epam.testng.basictests;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.epam.testng.parameterizedtests.ParentCalculatorTests;

public class BasicDivLongsTest extends ParentCalculatorTests {
	@Test(groups = { "smoke", "division", "longs" })
	public void dividePositiveValues() {
		long result = calculator.div(8L, 3L);
		Assert.assertEquals(result, 2.666666666666667, "Invalid result of operation");
	}

	@Test(groups = { "criticalPath", "division", "longs" })
	public void divideNegativeValues() {
		long result = calculator.div(-100L, -50L);
		Assert.assertEquals(result, 2L, "Invalid result of operation");
	}

	@Test(groups = { "extended", "division", "longs" })
	public void divideNegativeAndPositiveValues() {
		long result = calculator.div(9223372036854775807L, -9223372036854775807L);
		Assert.assertEquals(result, -1L, "Invalid result of operation");
	}

	@Test(expectedExceptions = NumberFormatException.class, expectedExceptionsMessageRegExp = ".*Attempt.*", groups = {
			"smoke", "division", "longs" })
	public void checkDivisionByZeroThrowsException() {
		long result = calculator.div(3L, 0L);
		assertTrue(result == Double.NaN);
	}
}
