package testngListeners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.project.BaseTest;

public class Listener extends BaseTest implements ITestListener 
{

	public void onStart(ITestResult result)
	 {
		// If any msg that we want to produce in testNG HTML Reports Ex:Test start Running : Amazon Test,
		//we use the method log() which is a static method that we call from 'Reporter' class.
		
		Reporter.log("Test Start Running : "+result.getMethod().getMethodName());
	}
	public void OnTestSuccess(ITestResult result) 
	{
		if(result.isSuccess())
		{
			try
			{
				 File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				 FileHandler.copy(srcFile, new File(projectPath+"//success//"+filePath+".png"));
				 
				 Reporter.log("<a href='" + projectPath+"//success//"+filePath+".png"+"'> <img src ='"+projectPath+"//success//"+filePath+".png"+"'height='100' width = '100'/></a>");
				 Reporter.log("Test has Success: "+result.getMethod().getMethodName());
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public void onTestFailure(ITestResult result)
	{
		if(!result.isSuccess())
		{
			try
			{
				 File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				 FileHandler.copy(srcFile, new File(projectPath+"//failure//"+filePath+".png"));
				 
				 Reporter.log("<a href='" + projectPath+"//failure//"+filePath+".png"+"'> <img src ='"+projectPath+"//failure//"+filePath+".png"+"'height='100' width = '100'/></a>");
				 Reporter.log("Test has Failed : "+result.getMethod().getMethodName());
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("Test has Skipped : "+result.getMethod().getMethodName());
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	
	public void onStart(ITestContext context)
	{
		
	}
	
	public void onFinish(ITestContext context)
	{
	
	}
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
}
