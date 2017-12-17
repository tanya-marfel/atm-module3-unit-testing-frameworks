package com.epam.junit.basictests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class BasicSubDoublesTest extends ParentCalculatorTests {
	@Test
	public void subNegativeLongs() {
		double result = calculator.sub(-1D, -1D);
		assertEquals(result, 0D, "Invalid operation result");
	}

	@Test
	public void subPositiveLongs() {
		double result = calculator.sub(1D, 1D);
		assertEquals(result, 0D, "Invalid operation result");
	}

	@Test
	public void subPositiveAndNegativeLongs() {
		double result = calculator.sub(-1D, 9D);
		assertEquals(result, -10D, "Invalid operation result");
	}
}
