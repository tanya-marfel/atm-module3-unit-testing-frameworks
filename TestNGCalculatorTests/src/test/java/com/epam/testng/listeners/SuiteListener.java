package com.epam.testng.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.xml.XmlSuite;

public class SuiteListener implements ISuiteListener {
	public void onStart(ISuite suite) {
		suite.getXmlSuite().setParallel(XmlSuite.ParallelMode.CLASSES);
		suite.getXmlSuite().setThreadCount(12);
		
	}

	public void onFinish(ISuite suite) {

	}
}
