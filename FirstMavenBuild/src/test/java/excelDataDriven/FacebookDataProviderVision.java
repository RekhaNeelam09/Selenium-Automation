package excelDataDriven;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;


public class FacebookDataProviderVision 
{
	WebDriver driver;
	ExcelAPI excel;
	
  @BeforeMethod
  public void StartProcess() throws Exception 
  {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com");  
  }
	
  @Test(dataProvider = "getData")
  public void f(Hashtable<String , String > obj) 
  {
	  // When we want to get only the 'Y' rows from the given testcase
	  if(obj.get("RunMode").equals("N"))
	  {
		  throw new SkipException("Test is Skipped due to No...");
	  }
	  else
	  {
		driver.findElement(By.id("email")).sendKeys(obj.get("UserName"));	
		driver.findElement(By.id("pass")).sendKeys(obj.get("UserPwd"));
	  }
  }
  
  @DataProvider
  public Object[][] getData() throws Exception 
  {
	  	ExcelAPI excel = new ExcelAPI("C:\\Users\\My\\Desktop\\testData01.xlsx");
		String sheetName = "data";
		String testcaseName = "LoginTest";
	  return DataUtils.getTestData(excel, sheetName, testcaseName);
   
  }
  
  @AfterMethod
  public void endProcess()
	  {
		  driver.quit();
		  
	  }
  }

