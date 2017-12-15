package com.epam.testng.basictests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.epam.testng.parameterizedtests.ParentCalculatorTests;

public class BasicTgTest extends ParentCalculatorTests {

	@Test(groups = { "smoke", "tg" })
	public void testZeroAngle() {
		double result = calculator.tg(0D);
		assertEquals(result, 0D, "Invalid operation result");

	}

	@Test(groups = { "smoke", "tg" })
	public void testAnotherAngle() {
		double result = calculator.tg(Math.toRadians(250));
		assertEquals(result, 2.7474774194546168, "Invalid operation result");

	}

	@Test(groups = { "criticalPath", "tg" })
	public void testFullRotationAnglePlusOne() {
		double result = calculator.tg(Math.toRadians(361));
		assertEquals(result, 0.017455064928217145, "Invalid operation result");

	}

	@Test(groups = { "extended", "tg" })
	public void testNegativeAngle() {
		double result = calculator.tg(Math.toRadians(-3D));
		assertEquals(result, -0.052407779283041196, "Invalid operation result");

	}
}
