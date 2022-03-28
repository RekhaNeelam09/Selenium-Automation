package com.project;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
 
public class LinksTesting1 extends BaseTest 
{
	
  @BeforeMethod(groups = {"regression","sanity"})
  @Parameters("browser")
  // Here 'btype' means browser type
  public void setup(String btype) throws Exception 
  {
	  	init(); 
		//Here 'test' is reference variable from 'BaseTest'
		test = report.createTest("LinksTesting1");
		test.log(Status.INFO,"----------------------------- Started LinksTesting1 ------------------------" );
		test.log(Status.INFO,"Initializing the dependency files...." );
		
		launch(btype);
		test.log(Status.PASS,"Opened the browser:-  " + p.getProperty("chromebrowser"));
		
		navigateUrl("googleurl");
		test.log(Status.INFO,"Navigating to :- "+childProp.getProperty("googleurl"));
  }
  
  @Test(groups = {"regression","sanity"})
  public void linksTesting1() 
  {
	 String expval = "Google Images";
	 
	 driver.findElement(By.linkText("Images")).click();
	 Reporter.log("Clicked on an Image Link");
	 String actual = driver.getTitle();
	 System.out.println(actual);
	 System.out.println(expval);
	 
	 Assert.assertEquals(actual, expval);
	 
  }

  @AfterMethod(groups = {"regression","sanity"})
  public void afterMethod() 
  {
	  report.flush();
	  driver.quit();
  }

}