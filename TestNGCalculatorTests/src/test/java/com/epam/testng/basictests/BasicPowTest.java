package com.epam.testng.basictests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.epam.testng.parameterizedtests.ParentCalculatorTests;

public class BasicPowTest extends ParentCalculatorTests {

	@Test(groups = { "smoke", "power" })

	public void testPowOne() {
		double result = calculator.pow(1D, 1D);
		Assert.assertEquals(result, 1D);
	}

	@Test(groups = { "smoke", "power" })
	public void testPowTwo() {
		double result = calculator.pow(2D, 2D);
		Assert.assertEquals(result, 4D);
	}

	@Test(groups = { "criticalPath", "power" })
	public void testPowNegativeTwo() {
		double result = calculator.pow(2D, -2D);
		Assert.assertEquals(result, 0.25);
	}

	@Test(groups = { "extended", "power" })
	public void testPowTwoOfRation() {
		double result = calculator.pow(2.35D, 2D);
		Assert.assertEquals(result, 5.5225);
	}

}
