package com.epam.testng.basictests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.epam.testng.parameterizedtests.ParentCalculatorTests;

public class BasicSinTest extends ParentCalculatorTests {
	@Test(groups = { "smoke", "sin" })
	public void testZeroAngle() {
		double result = calculator.sin(0D);
		assertEquals(result, 0D, "Invalid operation result");

	}

	@Test(groups = { "smoke", "sin" })
	public void testAnotherAngle() {
		double result = calculator.sin(Math.toRadians(250D));
		assertEquals(result, -0.9396926207859082, "Invalid operation result");

	}

	@Test(groups = { "criticalPath", "cos" })
	public void testFullRotationAngle() {
		double result = calculator.sin(Math.toRadians(361D));
		assertEquals(result, 0.01745240643728307, "Invalid operation result");

	}

	@Test(groups = { "extended", "cos" })
	public void testNegativeAngle() {
		double result = calculator.sin(Math.toRadians(-3D));
		assertEquals(result, -0.05233595624294383, "Invalid operation result");

	}
}
