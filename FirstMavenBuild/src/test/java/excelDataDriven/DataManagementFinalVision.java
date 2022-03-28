package excelDataDriven;

import org.testng.annotations.Test;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;

public class DataManagementFinalVision 
{
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String>obj) 
  {
	System.out.println("User MailID : "+obj.get("UserName"));  
	System.out.println("User Password : "+obj.get("UserPwd"));
  }

  @DataProvider
  public Object[][] getData() throws Exception 
  {
	  	ExcelAPI excel = new ExcelAPI("C:\\Users\\My\\Desktop\\testData01.xlsx");
		String sheetName = "data";
		String testcaseName = "TestA";
		
		return DataUtils.getTestData(excel, sheetName, testcaseName);
    };
  }

