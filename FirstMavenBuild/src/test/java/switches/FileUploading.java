package switches;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FileUploading 
{
	WebDriver driver = new ChromeDriver();
	
  @BeforeMethod
  public void beforeMethod() 
  {
	  WebDriverManager.chromedriver().setup();
	  
	  driver.manage().window().maximize();
	  driver.get("https://transfer.pcloud.com/");
  }

  @Test
  public void fileUpload() throws InterruptedException, IOException 
  {
	  driver.findElement(By.xpath("//span[contains(text(),'Click here to add files')]")).click();
	  Thread.sleep(3000);
	  
	// Here in 'exec' we should give the path of our needed file which is with .exe extension
	  Runtime.getRuntime().exec("C:\\Users\\My\\Desktop\\fupload.exe"); 
  }
  
  @AfterMethod
  public void afterMethod() 
  {
	  //driver.quit();
  }

}
