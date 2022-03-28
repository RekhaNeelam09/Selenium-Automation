package com.project;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import org.testng.annotations.Parameters;

import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class CheckBox1 extends BaseTest
{
 
  @BeforeMethod(groups = {"regression" ,"smoke"})
  @Parameters("browser")
  public void beforeMethod(String btype) throws Exception 
  {
	    init(); 
		//Here 'test' is reference variable from 'BaseTest'
		test = report.createTest("CheckBox1");
		test.log(Status.INFO,"----------- Started CheckBox1 ----------------" );
		test.log(Status.INFO,"Initializing the dependency files...." );
		
		launch(btype);
		test.log(Status.PASS,"Opened the browser:-  " +  p.getProperty("chromebrowser"));
		
		navigateUrl("googleurl");
		test.log(Status.INFO,"Navigating to :- "+childProp.getProperty("googleurl"));
  }
  
  @Test(groups = {"regression" ,"smoke"})
  public void checkboxTest() 
  {
	  List<WebElement> check = driver.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox']"));
	  for(int i = 0 ; i < check.size() ; i++)
	  {
		  System.out.println(check.get(i).getAttribute("value")+ "--" +check.get(i).getAttribute("checked"));
	  }
  }

  @AfterMethod(groups = {"regression" ,"smoke"})
  public void afterMethod() 
  {
	  report.flush();
	  driver.quit();
  }

}
