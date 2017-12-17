package com.epam.junit.basictests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.Test;

public class BasicDivLongsTest extends ParentCalculatorTests {
	@Test
	public void dividePositiveValues() {
		long result = calculator.div(8L, 3L);
		assertEquals(result, 2.666666666666667, "Invalid result of operation");
	}

	@Test
	public void divideNegativeValues() {
		long result = calculator.div(-100L, -50L);
		assertEquals(result, 2L, "Invalid result of operation");
	}

	@Test
	public void divideNegativeAndPositiveValues() {
		long result = calculator.div(9223372036854775807L, -9223372036854775807L);
		assertEquals(result, -1L, "Invalid result of operation");
	}

	@Test(expected = NumberFormatException.class)
	public void checkDivisionByZeroThrowsException() {
		long result = calculator.div(3L, 0L);
		assertTrue(result == Double.NaN);
	}
}
