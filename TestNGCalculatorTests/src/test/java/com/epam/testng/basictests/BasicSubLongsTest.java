package com.epam.testng.basictests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.epam.testng.parameterizedtests.ParentCalculatorTests;

public class BasicSubLongsTest extends ParentCalculatorTests {
	@Test(groups = { "smoke", "subtraction", "longs" })
	public void subNegativeLongs() {
		long result = calculator.sub(-1L, -1L);
		assertEquals(result, 0L, "Invalid operation result");
	}

	@Test(groups = { "smoke", "subtraction", "longs" })
	public void subPositiveLongs() {
		long result = calculator.sub(1L, 1L);
		assertEquals(result, 0L, "Invalid operation result");
	}

	@Test(groups = { "smoke", "subtraction", "longs" })
	public void subPositiveAndNegativeLongs() {
		long result = calculator.sub(-1L, 9L);
		assertEquals(result, -10L, "Invalid operation result");
	}

}
