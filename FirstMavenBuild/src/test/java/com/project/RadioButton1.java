package com.project;

import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class RadioButton1 extends BaseTest
{
  
  @BeforeMethod(groups = {"regression" ,"smoke"})
  @Parameters("browser")
  public void beforeMethod(String btype) throws Exception
  {
	    init(); 
		//Here 'test' is reference variable from 'BaseTest'
		test = report.createTest("RadioButton1");
		test.log(Status.INFO,"---------------- Started RadioButton1 ----------------" );
		test.log(Status.INFO,"Initializing the dependency files...." );
		
		launch(btype);
		test.log(Status.PASS,"Opened the browser:-  " +  p.getProperty("chromebrowser"));
		
		navigateUrl("radiourl");
		test.log(Status.INFO,"Navigating to :- "+childProp.getProperty("radiourl"));
  }

  @Test(groups = {"regression" ,"smoke"})
  public void RadioButtonTest() 
  {
	  WebElement radio = driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
	  List<WebElement> radio1 = driver.findElements(By.name("group1"));
	  for(int i = 0 ; i < radio1.size() ; i++) 
	  {
		  System.out.println(radio1.get(i).getAttribute("value")+"--"+radio1.get(i).getAttribute("radio"));
	  }
  }
  
  @AfterMethod(groups = {"regression" ,"smoke"})
  public void afterMethod()
  {
	  report.flush();
	  driver.quit();
	  
	  
  }

}
