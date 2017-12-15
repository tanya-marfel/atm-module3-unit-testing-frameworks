package com.epam.testng.parameterizedtests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class DivLongsTest extends ParentCalculatorTests {
	private long a;
	private long b;
	private long expected;

	@Factory(dataProvider = "valuesforLongsDiv")
	public DivLongsTest(long a, long b, long expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Test(groups = { "extended", "division", "longs" })
	public void testLongDiv() {
		long result = calculator.div(a, b);
		Assert.assertEquals(result, expected, "Invalid operation result. Please, try again");
	}

	@DataProvider(name = "valuesforLongsDiv")
	public static Object[][] evaluateLongsDiv() {
		return new Object[][] { { 5, 3, 1 }, { 16, 160, 0 }, { 0, 9, 0 } };
	}
}
