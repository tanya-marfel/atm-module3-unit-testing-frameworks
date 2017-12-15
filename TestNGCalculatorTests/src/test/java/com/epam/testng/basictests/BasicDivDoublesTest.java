package com.epam.testng.basictests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.epam.testng.parameterizedtests.ParentCalculatorTests;

public class BasicDivDoublesTest extends ParentCalculatorTests {
	@Test(groups = { "smoke", "division", "doubles" })
	public void dividePositiveValues() {
		double result = calculator.div(8D, 4D);
		assertTrue(result == 2.00D, "Invalid result of operation");
	}

	@Test(groups = { "criticalPath", "division", "doubles" })
	public void divideNegativeValues() {
		double result = calculator.div(-100.01D, -100D);
		assertTrue(result == 1.0001D, "Invalid result of operation");
	}

	@Test(groups = { "extended", "division", "doubles" })
	public void divideNegativeAndPositiveValues() {
		double result = calculator.div(1.7976931348623157E308D, -1.7976931348623157E308D);
		assertTrue(result == -1D, "Invalid result of operation");
	}

	@Test(groups = { "smoke", "division", "doubles" })
	public void divideByZero() {
		double result = calculator.div(3D, 0);
		assertTrue(result == Double.NaN);
	}
}
