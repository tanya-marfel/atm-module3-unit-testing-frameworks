package com.epam.junit.basictests;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCosTest extends ParentCalculatorTests {

	@Test
	public void testZeroAngle() {
		double result = calculator.cos(0D);
		assertEquals(result, 1D, "Invalid operation result");

	}

	@Test
	public void testAnotherAngle() {
		double result = calculator.cos(Math.toRadians(250));
		assertEquals(result, -0.3420201433256694, "Invalid operation result");

	}

	@Test
	public void testFullRotationAnglePlusOne() {
		double result = calculator.cos(Math.toRadians(361D));
		assertEquals(result, 0.9998476951563913, "Invalid operation result");

	}

	@Test
	public void testNegativeAngle() {
		double result = calculator.cos(Math.toRadians(-3D));
		assertEquals(result, 0.9986295347545738, "Invalid operation result");

	}

}
