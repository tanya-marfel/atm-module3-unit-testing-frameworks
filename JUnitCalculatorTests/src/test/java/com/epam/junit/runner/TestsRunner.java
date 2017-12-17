package com.epam.junit.runner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.epam.junit.basictests.*;

public class TestsRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(BasicCosTest.class, BasicCtgTest.class, BasicDivDoublesTest.class,
				BasicDivLongsTest.class, BasicMultDoublesTest.class, BasicMultLongsTest.class,
				BasicNegativeNumbersTest.class, BasicPositiveNumbersTest.class, BasicPowTest.class, BasicSinTest.class,
				BasicSqrtTest.class, BasicSubDoublesTest.class, BasicSubLongsTest.class, BasicSumDoublesTest.class,
				BasicSumLongsTest.class, BasicTgTest.class, ParentCalculatorTests.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString() + "\n");
		}
		System.out.println("In total there were " + result.getFailureCount() + " failures.");
	}
}
