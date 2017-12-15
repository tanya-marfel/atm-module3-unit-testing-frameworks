package com.epam.testng.parameterizedtests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.reflect.MethodMatcherException;

public class SubLongsTest extends ParentCalculatorTests {
	@Test(dataProvider = "subNegativeLongs", groups = { "subtraction", "smoke", "longs" })
	public void subNegativeLongs(long a, long b, long expected) {

		long result = calculator.sub(a, b);
		assertEquals(result, expected, "Invalid operation result");
	}

	@Test(dataProvider = "subPositiveLongs", expectedExceptions = MethodMatcherException.class, groups = {
			"subtraction", "criticalPath", "longs" })

	public void subPositiveLongs(long a, long b, long expected) {
		long result = calculator.sub(a, b);
		assertEquals(result, expected, "Invalid operation result");
	}

	@Test(dataProvider = "subPositiveAndNegativeLongs", groups = { "subtraction", "extended", "longs" })
	public void subPositiveAndNegativeLongs(long a, long b, long expected) {
		long result = calculator.sub(a, b);
		assertEquals(result, expected, "Invalid operation result");
	}

	@DataProvider(name = "subPositiveLongs")
	public Object[][] valuesForPositiveLongs() {
		return new Object[][] { { 99, 99, 0 }, { 2147483647, 1, 2147483646 }, { 50, 0, 50 } };
	}

	@DataProvider(name = "subNegativeLongs")
	public Object[][] valuesForNegativeLongs() {
		return new Object[][] { { -20, -15, -5 }, { -2147483646, -1, -2147483645 }, { -50, 0, -50 } };
	}

	@DataProvider(name = "subPositiveAndNegativeLongs")
	public Object[][] valuesForPositiveAndNegativeLongs() {
		return new Object[][] { { 20, -15, 35 }, { 2147483646, -1, 2147483647 }, { 1, -50, 51 } };
	}
}
