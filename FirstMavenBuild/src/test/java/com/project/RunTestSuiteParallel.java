package com.project;

import org.testng.TestNG;
import java.util.Arrays;

public class RunTestSuiteParallel 
{

	public static void main(String[] args)
	{
		TestNG obj = new TestNG();
		obj.setTestSuites(Arrays.asList(new String[] {System.getProperty("user.dir")+"//megasuite.xml"}));
		obj.setSuiteThreadPoolSize(2);
		obj.run();
		

	}

}
