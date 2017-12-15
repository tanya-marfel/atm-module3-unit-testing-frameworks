package com.epam.testng.basictests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.epam.testng.parameterizedtests.ParentCalculatorTests;

public class BasicMultDoublesTest extends ParentCalculatorTests {

	@Test(groups = { "smoke", "multiplication", "doubles" })
	public void multPositiveDoubles() {
		double result = calculator.mult(1D, 1D);
		assertEquals(result, 1D, "Invalid operation result");
	}

	@Test(groups = { "criticalPath", "multiplication", "doubles" })
	public void multNegativeLongs() {
		double result = calculator.mult(-9223372036854775807D, -9223372036854775807D);
		assertEquals(result, 8.507059173023462E37, "Invalid operation result");
	}

	@Test(groups = { "extended", "multiplication", "doubles" })
	public void multNegativeaAndPositiveLongs() {
		double result = calculator.mult(-1D, 9D);
		assertEquals(result, -9D, "Invalid operation result");
	}
}
