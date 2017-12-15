package com.epam.junit.basictests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.Test;

public class BasicNegativeNumbersTest extends ParentCalculatorTests {

	@Test
	public void checkValueNegative() {
		assertTrue(calculator.isNegative(-2L));

	}

	@Test
	public void checkValuePositive() {
		assertFalse(calculator.isNegative(2L));

	}

	@Test
	public void checkZero() {
		assertFalse(calculator.isNegative(0));

	}
}
