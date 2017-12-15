package com.epam.testng.parameterizedtests;

import org.testng.annotations.*;

import com.epam.tat.module4.Calculator;

public class ParentCalculatorTests {
	protected Calculator calculator;

	@BeforeClass(alwaysRun = true)
	public void setUp() {
		calculator = new Calculator();
	}


	@AfterClass(alwaysRun = true)
	public void printOnFinish() {
		System.out.println(this.getClass().getName() + " testing is completed.");
	}
}
