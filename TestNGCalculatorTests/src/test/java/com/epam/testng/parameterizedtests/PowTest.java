package com.epam.testng.parameterizedtests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class PowTest extends ParentCalculatorTests {
	private double a;
	private double b;
	private double expected;

	@Factory(dataProvider = "valuesforPow")
	public PowTest(double a, double b, double expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Test(groups = { "extended", "power" })
	public void testPower() {
		double result = calculator.pow(a, b);
		Assert.assertEquals(result, expected, "Invalid operation result. Please, try again.");
	}

	@DataProvider(name = "valuesforPow")
	public static Object[][] checkPow() {
		return new Object[][] { { 232D, 1D, 232D }, { -2D, -3D, -0.125D }, { 10, -2, 0.01 }, { 5, 0, 1 },
				{ 232.34D, 2.3D, 276748.42984267586 } };
	}
}
