package com.epam.testng.parameterizedtests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class CtgTest extends ParentCalculatorTests {
	private double a;
	private double expected;

	@Factory(dataProvider = "valuesforCtg")
	public CtgTest(double a, double expected) {
		this.a = a;
		this.expected = expected;
	}

	@Test(groups = { "ctg", "extended" })
	public void testAngles() {
		double result = calculator.ctg(Math.toRadians(a));
		assertEquals(result, expected, "Invalid operation result");

	}

	@DataProvider(name = "valuesforCtg")
	public static Object[][] checkCtg() {
		return new Object[][] { { 876, -2.246036773904209 }, { -100, 0.17632698070846492 },
				{ 0.1, 572.9572133542877 } };
	}
}
