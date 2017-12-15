package com.epam.testng.parameterizedtests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SinTest extends ParentCalculatorTests {
	private double a;
	private double expected;

	@Factory(dataProvider = "valuesforSin")
	public SinTest(double a, double expected) {
		this.a = a;
		this.expected = expected;
	}

	@Test(groups = { "sin", "extended" })
	public void testAngles() {
		double result = calculator.sin(Math.toRadians(a));
		assertEquals(result, expected, "Invalid operation result");

	}

	@DataProvider(name = "valuesforSin")
	public static Object[][] checkSin() {
		return new Object[][] { { 876, 0.4067366430758013 }, { -100, -0.984807753012208 },
				{ 0.1, 0.0017453283658983088 } };
	}
}
