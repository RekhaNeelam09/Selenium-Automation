package actions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class MouseOperations 
{
  WebDriver driver;
  Actions a;
  
  @SuppressWarnings("deprecation")
@BeforeMethod
  public void beforeMethod() 
  {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  
  }
  
  @Test(priority=0,enabled = false)
  public void MoveToElement() throws InterruptedException 
  {
	  
	  driver.get("https://www.snapdeal.com");
	  a = new Actions(driver);
	  //moveToElement(WebElement target)
	  a.moveToElement(driver.findElement(By.xpath("//*[@id=['sdHeader']/div[4]/div[2]/div/div[3]/div[3]/div/span[1]"))).perform();
	  driver.findElement(By.xpath("//*[@id=['sdHeader']/div[4]/div[2]/div/div[3]/div[3]/div/span[1]")).click();
	  Thread.sleep(4000);
  }
  
  @Test(priority=1,enabled = false)
  public void dragAnddrop() throws InterruptedException
  
  {
	
	  driver.get("http://jqueryui.com/droppable/");
	  driver.switchTo().frame(0);
	  WebElement drag = driver.findElement(By.id("draggable"));
	  WebElement drop = driver.findElement(By.id("droppable"));
	  a = new Actions(driver);
	   
	  //dragAndDrop(WebElement source,WebElement Target)
	  //// a.dragAndDrop(drag, drop).perform();
	  a.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
	  Thread.sleep(4000);
  }
  
  @Test(priority=3,enabled = false)
  public void resizeMethod() throws InterruptedException 
  {
	  driver.get("http://jqueryui.com/resizable/");
	  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	  WebElement drag = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
	  a = new Actions(driver);
	  a.clickAndHold(drag).moveByOffset(200, 100).release(drag).build().perform();
	  Thread.sleep(4000);
  }
  
  
  @Test(priority = 4,enabled = false)
  public void rightClickMethod() throws InterruptedException 
  {
	  driver.get("http://jqueryui.com/");
	  driver.switchTo();
	  WebElement drag = driver.findElement(By.xpath(".//*[@id='sidebar']/aside[1]/ul/li[4]/a"));
	  a = new Actions(driver);
	  
	  a.contextClick(drag).perform();
	  Thread.sleep(8000);
  }
  
  @Test(priority = 5,enabled = false)
  public void slider() throws InterruptedException 
  {
	  driver.get("http://jqueryui.com/slider/");
	  driver.switchTo().frame(0);
	  WebElement drag = driver.findElement(By.xpath("//span[@class= 'ui-slider-handle ui-corner-all ui-state-default'"));
	  a = new Actions(driver);
	  a.clickAndHold(drag).moveByOffset(100, 0).release(drag).build().perform();
	  Thread.sleep(4000);
  }
  
  @Test(priority = 6,enabled = false)
  public void Browserslider() throws InterruptedException 
  {
	  //Browser Scroll Method
	  driver.get("http://www.selenium.org/download/");
	  for(int i=0;i<10;i++)
	  {
		  ((RemoteWebDriver)driver).executeScript("window.scrollBy(0,200)");
		  Thread.sleep(2000);
	  } 
  }
   
  @Test(priority = 7,enabled = false)
  public void autoSuggestion() throws InterruptedException 
  {
	  //Browser Scroll Method
	  driver.get("http://www.google.co.in/");
	  driver.findElement(By.name("q")).sendKeys("hadoop tutorial");
	  //driver.findElement(By.name("btnK")).click();
	  String val = driver.findElement(By.name("q")).getAttribute("value");
	  Thread.sleep(3000);
	  List<WebElement> list = driver.findElements((By.xpath("//div[@class='OBMEnb'][1]/ul/li/div/div[2]/div[1]/span")));
	  for(int i=0;i<list.size();i++)
	  {
		  if(list.get(i).getText().equals(val)) 
		  {
			  list.get(i).click();
			  return;
		  }
		  list = driver.findElements((By.xpath("//div[@class='OBMEnb'][1]/ul/li/div/div[2]/div[1]/span")));
		  
		  Thread.sleep(2000);
	  } 
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.quit();
  }

}
