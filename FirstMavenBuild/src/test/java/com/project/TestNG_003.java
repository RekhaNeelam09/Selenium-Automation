package com.project;
import com.aventstack.extentreports.Status;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class TestNG_003 extends BaseTest
{
 
  @BeforeMethod(groups = {"regression"})
  @Parameters("browser")
  public void beforeMethod(String btype) throws Exception 
  {
	    init(); 
		//Here 'test' is reference variable from 'BaseTest'
		test = report.createTest("TestNG_003");
		test.log(Status.INFO,"Initializing the Properties files...." );
		
		launch(btype);
		test.log(Status.PASS,"Opened the Browser:-  " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.INFO,"Navigating to the Url:- "+childProp.getProperty("amazonurl"));
  }

  @Test(groups = {"regression"})
  public void f() 
  {
	  	selectListOption("amazondropdown_id","Books");
		test.log(Status.PASS,"Selected the Books option using the locator:- " + locatorProp.getProperty("amazondropdown_id"));

		type("amazonsearchtextBox_name","Harry Potter");
		test.log(Status.PASS,"Entering the text Harry Potter using the locator:- " + locatorProp.getProperty("amazonsearchtextBox_name"));

		clickElement("amazonsearchbutton_xpath");		
		test.log(Status.PASS,"Clicked on the Element by using:- " + locatorProp.getProperty("amazonsearchbutton_xpath"));
  
  }
  @AfterMethod(groups = {"regression"})
  public void afterMethod() 
  {
	  driver.quit();
	  report.flush();
  }

}
