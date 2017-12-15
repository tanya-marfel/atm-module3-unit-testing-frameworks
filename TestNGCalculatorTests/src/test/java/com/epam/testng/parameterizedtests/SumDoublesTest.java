package com.epam.testng.parameterizedtests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDoublesTest extends ParentCalculatorTests {
	@Test(dataProvider = "sumNegativeDoubles", groups = { "addition", "smoke", "doubles" })
	public void sumNegativeLongs(double a, double b, double expected) {
		double result = calculator.sum(a, b);
		assertEquals(result, expected, "Invalid operation result");
	}

	@Test(dataProvider = "sumPositiveDoubles", groups = { "addition", "criticalPath", "doubles" })
	public void sumPositiveLongs(double a, double b, double expected) {
		double result = calculator.sum(a, b);
		assertEquals(result, expected, "Invalid operation result");
	}

	@Test(dataProvider = "sumPositiveAndNegativeDoubles", groups = { "addition", "extended", "doubles" })
	public void sumPositiveAndNegativeLongs(double a, double b, double expected) {
		double result = calculator.sum(a, b);
		assertEquals(result, expected, "Invalid operation result");
	}

	@DataProvider(name = "sumPositiveDoubles")
	public Object[][] valuesForPositiveLongs() {
		return new Object[][] { { 1.19, 2.56, 3.75 }, { 2147483647, 1.00, 2147483648.00 }, { 50.1, 0, 50.1 } };
	}

	@DataProvider(name = "sumNegativeDoubles")
	public Object[][] valuesForNegativeLongs() {
		return new Object[][] { { -1.00, -2.56, -3.56 }, { -1.7976931348623157E308, -1, -1.7976931348623158E308 },
				{ -50, 0, -50.00 } };
	}

	@DataProvider(name = "sumPositiveAndNegativeDoubles")
	public Object[][] valuesForPositiveAndNegativeLongs() {
		return new Object[][] { { 20.01, -15.45, 4.56 }, { 2147483646.66, -1.55, 2147483645.11 }, { 1, -50, -49.00 } };
	}

}
