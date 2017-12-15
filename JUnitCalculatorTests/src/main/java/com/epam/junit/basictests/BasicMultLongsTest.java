package com.epam.junit.basictests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class BasicMultLongsTest extends ParentCalculatorTests {

	@Test
	public void multPositiveLongs() {
		long result = calculator.mult(1L, 1L);
		assertEquals(result, 1L, "Invalid operation result");
	}

	@Test
	public void multNegativeLongs() {
		long result = calculator.mult(-9223372036854775807L, -9223372036854775807L);
		assertEquals(result, 8.507059173023462e37, "Invalid operation result");
	}

	@Test
	public void multNegativeaAndPositiveLongs() {
		long result = calculator.mult(-1L, 9L);
		assertEquals(result, -9, "Invalid operation result");

	}
}
