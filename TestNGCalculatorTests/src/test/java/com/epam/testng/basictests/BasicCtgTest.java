package com.epam.testng.basictests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.epam.testng.parameterizedtests.ParentCalculatorTests;

public class BasicCtgTest extends ParentCalculatorTests {
	@Test(groups = { "smoke", "ctg" })
	public void testZeroAngle() {
		double result = calculator.ctg(0D);
		assertEquals(result, "Infinity", "Invalid operation result");

	}

	@Test(groups = { "smoke", "ctg" })
	public void testAnotherAngle() {
		double result = calculator.ctg(Math.toRadians(250));
		assertEquals(result, 0.363970234266202, "Invalid operation result");

	}

	@Test(groups = { "criticalPath", "ctg" })
	public void testFullRotationAnglePlusOne() {
		double result = calculator.ctg(Math.toRadians(361D));
		assertEquals(result, 57.289961630760885, "Invalid operation result");

	}

	@Test(groups = { "extended", "ctg" })
	public void testNegativeAngle() {
		double result = calculator.ctg(Math.toRadians(-3D));
		assertEquals(result, -19.081136687728215, "Invalid operation result");

	}
}
