package com.epam.testng.parameterizedtests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubDoublesTest extends ParentCalculatorTests {
	@Test(dataProvider = "subNegativeDoubles", groups = { "subtraction", "smoke", "doubles" })
	public void suNegativeLongs(double a, double b, double expected) {
		double result = calculator.sub(a, b);
		assertEquals(result, expected, "Invalid operation result");
	}

	@Test(dataProvider = "subPositiveDoubles", groups = { "subtraction", "criticalPath", "doubles" })
	public void subPositiveLongs(double a, double b, double expected) {
		double result = calculator.sub(a, b);
		assertEquals(result, expected, "Invalid operation result");
	}

	@Test(dataProvider = "subPositiveAndNegativeDoubles", groups = { "subtraction", "extended", "doubles" })
	public void subPositiveAndNegativeLongs(double a, double b, double expected) {
		double result = calculator.sub(a, b);
		assertEquals(result, expected, "Invalid operation result");
	}

	@DataProvider(name = "subPositiveDoubles")
	public Object[][] valuesForPositiveLongs() {
		return new Object[][] { { 1.19, 2.56, -1.37 }, { 2147483647, 1.00, 2147483646.00 }, { 50.1, 0, 50.1 } };
	}

	@DataProvider(name = "subNegativeDoubles")
	public Object[][] valuesForNegativeLongs() {
		return new Object[][] { { -1.00, -2.56, 1.56 }, { -1.7976931348623157, -1, -0.7976931348623157 },
				{ -50, 0, -50.00 } };
	}

	@DataProvider(name = "subPositiveAndNegativeDoubles")
	public Object[][] valuesForPositiveAndNegativeLongs() {
		return new Object[][] { { 20.09, -15.45, 35.54 }, { 2147483646.66, -1.55, 2147483648.21 }, { 1, -50, 51.00 } };
	}

}
