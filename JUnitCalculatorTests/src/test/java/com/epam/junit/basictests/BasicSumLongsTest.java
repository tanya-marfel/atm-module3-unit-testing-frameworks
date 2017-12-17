package com.epam.junit.basictests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class BasicSumLongsTest extends ParentCalculatorTests {
	@Test
	public void sumNegativeLongs() {
		long result = calculator.sum(-1L, -1L);
		assertEquals(result, -2L, "Invalid operation result");
	}

	@Test
	public void sumPositiveLongs() {
		long result = calculator.sum(1L, 1L);
		assertEquals(result, 2L, "Invalid operation result");
	}

	@Test
	public void sumPositiveAndNegativeLongs() {
		long result = calculator.sum(-1L, 9L);
		assertEquals(result, 8L, "Invalid operation result");
	}
}
