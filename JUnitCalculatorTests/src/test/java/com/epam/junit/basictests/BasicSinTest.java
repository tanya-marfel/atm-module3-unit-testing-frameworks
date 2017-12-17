package com.epam.junit.basictests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class BasicSinTest extends ParentCalculatorTests {

	@Test
	public void testZeroAngle() {
		double result = calculator.sin(0D);
		assertEquals(result, 0D, "Invalid operation result");

	}

	@Test
	public void testAnotherAngle() {
		double result = calculator.sin(Math.toRadians(250D));
		assertEquals(result, -0.9396926207859082, "Invalid operation result");

	}

	@Test
	public void testFullRotationAngle() {
		double result = calculator.sin(Math.toRadians(361D));
		assertEquals(result, 0.01745240643728307, "Invalid operation result");

	}

	@Test
	public void testNegativeAngle() {
		double result = calculator.sin(Math.toRadians(-3D));
		assertEquals(result, -0.05233595624294383, "Invalid operation result");

	}
}
