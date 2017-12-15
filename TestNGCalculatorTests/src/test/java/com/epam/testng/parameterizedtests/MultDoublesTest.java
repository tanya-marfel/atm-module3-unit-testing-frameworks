package com.epam.testng.parameterizedtests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class MultDoublesTest extends ParentCalculatorTests {
	private double a;
	private double b;
	private double expected;

	@Factory(dataProvider = "valuesForDoublesMult")
	public MultDoublesTest(double a, double b, double expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Test(groups = { "extended", "multiplication", "doubles" })
	public void testDoublesMult() {
		double result = calculator.mult(a, b);
		Assert.assertEquals(result, expected, "Invalid operation result. Please, try again");
	}

	@DataProvider(name = "valuesForDoublesMult")
	public static Object[][] evaluateDoublesMult() {
		return new Object[][] { { 0.2, 0.2, 0.04 }, { -1.01, -3.00, 3.03 }, { 2, -3.45, -6.9 } };
	}
}
