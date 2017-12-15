package com.epam.testng.basictests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.epam.testng.parameterizedtests.ParentCalculatorTests;

public class BasicSumLongsTest extends ParentCalculatorTests {
	@Test(groups = { "smoke", "addition", "longs" })
	public void sumNegativeLongs() {
		long result = calculator.sum(-1L, -1L);
		assertEquals(result, -2L, "Invalid operation result");
	}

	@Test(groups = { "smoke", "addition", "longs" })
	public void sumPositiveLongs() {
		long result = calculator.sum(1L, 1L);
		assertEquals(result, 2L, "Invalid operation result");
	}

	@Test(groups = { "smoke", "addition", "longs" })
	public void sumPositiveAndNegativeLongs() {
		long result = calculator.sum(-1L, 9L);
		assertEquals(result, 8L, "Invalid operation result");
	}

}
