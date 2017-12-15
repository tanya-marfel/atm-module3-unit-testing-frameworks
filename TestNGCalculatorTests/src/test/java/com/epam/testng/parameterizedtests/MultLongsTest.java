package com.epam.testng.parameterizedtests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class MultLongsTest extends ParentCalculatorTests {
	private long a;
	private long b;
	private long expected;

	@Factory(dataProvider = "valuesforLongsMult")
	public MultLongsTest(long a, long b, long expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Test(groups = { "extended", "multiplication", "longs" })
	public void testLongMult() {
		long result = calculator.mult(a, b);
		Assert.assertEquals(result, expected);
	}

	@DataProvider(name = "valuesforLongsMult")
	public static Object[][] valuesforLongsMult() {
		return new Object[][] { { 3453L, 3453L, 11923209 }, { -1, -3, 3 }, { 2, -3, -6 } };
	}

}
