package pageObjectModel;

import org.testng.annotations.Test;

import com.project.BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class POM_001 extends BaseTest
{
	WebDriver driver;
  @BeforeMethod
  public void beforeMethod() 
  {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com");
	  
  }
  
  @Test
  public void f()
  {
	  LoginPage page = new LoginPage(driver);
	  page.customerLogin();
  }
  @AfterMethod
  public void afterMethod() 
  {
	  
  }

}
