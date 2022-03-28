package runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class Runner 
{
	
	public static void main(String[] args) throws Exception
	{
		TestNG testng = new TestNG();
		XmlSuite mysuite =  new XmlSuite();
		mysuite.setName("MySuite");
		
		List<XmlSuite> allsuites = new ArrayList<XmlSuite>();
		allsuites.add(mysuite);
		testng.setXmlSuites(allsuites);
		
		XmlTest test = new XmlTest(mysuite);
		test.setName("Login Test");
		
		List<XmlClass> classes = new ArrayList<XmlClass>();
		classes.add(new XmlClass("com.testCases.Login"));
		//classes.add(new XmlClass("com.testCases.Login1"));
		test.setXmlClasses(classes);
		testng.run();
		
	}

}
