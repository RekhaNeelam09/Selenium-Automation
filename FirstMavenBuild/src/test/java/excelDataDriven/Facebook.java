package excelDataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		ExcelAPI excel = new ExcelAPI("C:\\Users\\My\\Desktop\\testData01.xlsx");
		
		for(int i = 1; i<excel.getRowCount("Login");i++) 
		{
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(excel.getCellData("Login", "UserName", i));
			
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys(excel.getCellData("Login", "Password", i));
			  
			Thread.sleep(4000);
		}
	}

}
