package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	// Each page one pure java class we need to create and what are the elements we have need to organize like 
	// below  
	@FindBy(id="email") public WebElement custEmail;
	@FindBy(id="pass") public WebElement custPassword;
	@FindBy(name= "login") public WebElement LoginIn;

	// All the elements/Locators should be initialized through the constructor
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	 
	// In that page,we need to define methods as per the operations we need to do implementations like below
	public void customerLogin()
	{
		custEmail.sendKeys("rekha.neelam@gmail.com");
		custPassword.sendKeys("Sairam@05");
		LoginIn.click();
	}

}
