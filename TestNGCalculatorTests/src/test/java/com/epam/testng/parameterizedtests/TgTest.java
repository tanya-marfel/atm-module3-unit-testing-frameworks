package com.epam.testng.parameterizedtests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TgTest extends ParentCalculatorTests {
	private double a;
	private double expected;

	@Factory(dataProvider = "valuesforTg")
	public TgTest(double a, double expected) {
		this.a = a;
		this.expected = expected;
	}

	@Test(groups = { "tg", "extended" })
	public void testAngles() {
		double result = calculator.cos(Math.toRadians(a));
		assertEquals(result, expected, "Invalid operation result");

	}

	@DataProvider(name = "valuesforTg")
	public static Object[][] checkTg() {
		return new Object[][] { { 876, -0.4452286853085376 }, { -100, 5.671281819617711 },
				{ 0.1, 0.0017453310241888004 } };
	}
}
