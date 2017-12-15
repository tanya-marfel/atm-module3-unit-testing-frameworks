package com.epam.testng.parameterizedtests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumLongsTest extends ParentCalculatorTests {
	@Test(dataProvider = "sumNegativeLongs", groups = { "addition", "smoke", "longs" })
	public void sumNegativeLongs(long a, long b, long expected) {

		long result = calculator.sum(a, b);
		assertEquals(result, expected, "Invalid operation result");
	}

	@Test(dataProvider = "sumPositiveLongs", groups = { "addition", "criticalPath", "longs" })
	public void sumPositiveLongs(long a, long b, long expected) {
		long result = calculator.sum(a, b);
		assertEquals(result, expected, "Invalid operation result");
	}

	@Test(dataProvider = "sumPositiveAndNegativeLongs", groups = { "addition", "extended", "longs" })
	public void sumPositiveAndNegativeLongs(long a, long b, long expected) {
		long result = calculator.sum(a, b);
		assertEquals(result, expected, "Invalid operation result");
	}

	@DataProvider(name = "sumPositiveLongs")
	public Object[][] valuesForPositiveLongs() {
		return new Object[][] { { 99L, 99L, 198L },
				{ 9223372036854775807L, 9223372036854775807L,(long) 18446744000000000000D }, { 50, 0, 50 } };
	}

	@DataProvider(name = "sumNegativeLongs")
	public Object[][] valuesForNegativeLongs() {
		return new Object[][] { { -20, -15, -35 }, { -2147483646, -1, -2147483647 }, { -50, 0, -50 } };
	}

	@DataProvider(name = "sumPositiveAndNegativeLongs")
	public Object[][] valuesForPositiveAndNegativeLongs() {
		return new Object[][] { { 20, -15, 5 }, { 2147483646, -1, 2147483645 }, { 1, -50, -49 } };
	}
}
