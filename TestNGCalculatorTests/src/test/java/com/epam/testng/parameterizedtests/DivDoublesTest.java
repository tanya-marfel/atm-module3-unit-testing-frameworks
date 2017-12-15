package com.epam.testng.parameterizedtests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class DivDoublesTest extends ParentCalculatorTests {
	private double a;
	private double b;
	private double expected;

	@Factory(dataProvider = "valuesforDoublesDiv")
	public DivDoublesTest(double a, double b, double expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Test(groups = { "extended", "division", "doubles" })
	public void testLongDiv() {
		double result = calculator.div(a, b);
		Assert.assertEquals(result, expected, "Invalid operation result. Please, try again");
	}

	@DataProvider(name = "valuesforDoublesDiv")
	public static Object[][] evaluateDoublesDiv() {
		return new Object[][] { { 5, 3, 1.6666666666666667 }, { 16, 160, 0.1 }, { 0, 9, 0.0 } };
	}
}
