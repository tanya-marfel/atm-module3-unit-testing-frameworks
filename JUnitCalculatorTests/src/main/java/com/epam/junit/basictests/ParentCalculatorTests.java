package com.epam.junit.basictests;

import org.junit.After;
import org.junit.Before;

import org.junit.Rule;
import org.junit.rules.TestName;

import com.epam.tat.module4.Calculator;

public class ParentCalculatorTests {
	protected Calculator calculator;
	@Rule
	public TestName name = new TestName();

	@Before
	public void setUp() {
		calculator = new Calculator();
	}

	@After
	public void printOnFinish() {
		System.out.println(name.getMethodName() + " test finished.");
	}
}
