package com.epam.testng.runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

public class TestsRunner {
	public static void main(String[] args) {
		TestNG tng = new TestNG();

		XmlSuite suite = new XmlSuite();
		suite.setName("End-to-end test");

		ArrayList<String> files = new ArrayList<String>();
		files.addAll(new ArrayList<String>() {
			{
				add("./src/test/resources/testng1.xml");
				add("./src/test/resources/testng2.xml");
				add("./src/test/resources/testng3.xml");
			}
		});
		suite.setSuiteFiles(files);
		// suite.setParallel(XmlSuite.ParallelMode.METHODS);
		// suite.setThreadCount(4);

		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		tng.setXmlSuites(suites);

		tng.run();
	}
}
