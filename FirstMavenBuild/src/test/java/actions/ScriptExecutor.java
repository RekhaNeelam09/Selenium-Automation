package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScriptExecutor 
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value='rekhaneelam'");
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
		// For scrollBar movement in the browser window
//		js.executeScript("window.scrollBy(0,200)");
		// For scroll movement moving to the down
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		// For visibility of some element in the browser window
//		js.executeScript("document.getElementById('u_0_2').scrollIntoView()");
		// For going back to the previous window
//		js.executeScript("window.history.back()");
//		Thread.sleep(3000);
		// For going forward to next window
//		js.executeScript("window.history.forward()");
//		Thread.sleep(3000);
//		js.executeScript("window.history.go(0)");
	}

}
