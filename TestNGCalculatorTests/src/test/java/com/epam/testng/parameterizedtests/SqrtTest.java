package com.epam.testng.parameterizedtests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SqrtTest extends ParentCalculatorTests {
	private double a;
	private double expected;

	@Factory(dataProvider = "valuesforPow")
	public SqrtTest(double a, double expected) {
		this.a = a;
		this.expected = expected;
	}

	@Test(groups = { "sqrt", "extended" })
	public void testLongMult() {
		double result = calculator.sqrt(a);
		Assert.assertEquals(result, expected, "Invalid operation result. Please, try again.");
	}

	@DataProvider(name = "valuesforPow")
	public static Object[][] checkPow() {
		return new Object[][] { { 7, 2.6457513110645907 }, { 1.44, 1.2 }, { 3.4, 1.8439088914585775 } };
	}
}
