package com.epam.testng.listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class TestListener implements IInvokedMethodListener {

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("Test of " + method.getTestMethod().getMethodName() + " started");

	}

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		if (testResult.getStatus() == ITestResult.SUCCESS) {
			System.out.println("Success");
		} else {
			System.out.println("Failure");
		}

	}

}
