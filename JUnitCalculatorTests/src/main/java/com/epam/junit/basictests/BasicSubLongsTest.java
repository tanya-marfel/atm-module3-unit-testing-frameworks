package com.epam.junit.basictests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class BasicSubLongsTest extends ParentCalculatorTests {
	@Test
	public void subNegativeLongs() {
		long result = calculator.sub(-1L, -1L);
		assertEquals(result, 0L, "Invalid operation result");
	}

	@Test
	public void subPositiveLongs() {
		long result = calculator.sub(1L, 1L);
		assertEquals(result, 0L, "Invalid operation result");
	}

	@Test
	public void subPositiveAndNegativeLongs() {
		long result = calculator.sub(-1L, 9L);
		assertEquals(result, -10L, "Invalid operation result");
	}
}
