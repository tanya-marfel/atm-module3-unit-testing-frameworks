package com.epam.testng.parameterizedtests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class CosTest extends ParentCalculatorTests {
	private double a;
	private double expected;

	@Factory(dataProvider = "valuesforCos")
	public CosTest(double a, double expected) {
		this.a = a;
		this.expected = expected;
	}

	@Test(groups = { "cos", "extended" })
	public void testAngles() {
		double result = calculator.cos(Math.toRadians(a));
		assertEquals(result, expected, "Invalid operation result");

	}

	@DataProvider(name = "valuesforCos")
	public static Object[][] checkCos() {
		return new Object[][] { { 876, -0.9135454576426004 }, { -100, -0.1736481776669303 },
				{ 0.1, 0.9999984769132877 } };
	}
}
