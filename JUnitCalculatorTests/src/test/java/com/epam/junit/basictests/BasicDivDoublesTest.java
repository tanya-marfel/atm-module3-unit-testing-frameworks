package com.epam.junit.basictests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.Test;

public class BasicDivDoublesTest extends ParentCalculatorTests {
	@Test
	public void dividePositiveValues() {
		double result = calculator.div(8D, 4D);
		assertTrue(result == 2.00D, "Invalid result of operation");
	}

	@Test
	public void divideNegativeValues() {
		double result = calculator.div(-100.01D, -100D);
		assertTrue(result == 1.0001D, "Invalid result of operation");
	}

	@Test
	public void divideNegativeAndPositiveValues() {
		double result = calculator.div(1.7976931348623157E308D, -1.7976931348623157E308D);
		assertTrue(result == -1D, "Invalid result of operation");
	}

	@Test
	public void divideByZero() {
		double result = calculator.div(3D, 0);
		assertTrue(result == Double.NaN);
	}
}
