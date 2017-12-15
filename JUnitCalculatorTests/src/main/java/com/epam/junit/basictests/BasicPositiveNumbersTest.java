package com.epam.junit.basictests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.Test;

public class BasicPositiveNumbersTest extends ParentCalculatorTests {

	@Test
	public void checkValueNegative() {
		assertTrue(calculator.isPositive(2L));

	}

	@Test
	public void checkValuePositive() {
		assertFalse(calculator.isPositive(-2L));

	}

	@Test
	public void checkZero() {
		assertFalse(calculator.isPositive(0));

	}
}
