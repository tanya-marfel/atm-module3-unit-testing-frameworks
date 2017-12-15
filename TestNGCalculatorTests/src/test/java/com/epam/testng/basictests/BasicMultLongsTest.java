package com.epam.testng.basictests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.epam.testng.parameterizedtests.ParentCalculatorTests;

public class BasicMultLongsTest extends ParentCalculatorTests {

	@Test(groups = { "smoke", "multiplication", "longs" })
	public void multPositiveLongs() {
		long result = calculator.mult(1L, 1L);
		assertEquals(result, 1L, "Invalid operation result");
	}

	@Test(groups = { "criticalPath", "multiplication", "longs" })
	public void multNegativeLongs() {
		long result = calculator.mult(-9223372036854775807L, -9223372036854775807L);
		assertEquals(result, 8.507059173023462e37, "Invalid operation result");
	}

	@Test(groups = { "extended", "multiplication", "longs" })
	public void multNegativeaAndPositiveLongs() {
		long result = calculator.mult(-1L, 9L);
		assertEquals(result, -9, "Invalid operation result");
	}
}
