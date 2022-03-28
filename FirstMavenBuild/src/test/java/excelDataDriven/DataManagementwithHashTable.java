package excelDataDriven;

import org.testng.annotations.Test;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;

public class DataManagementwithHashTable 
{
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String>obj)
  {
  
  }

  @SuppressWarnings("null")
@DataProvider
  public Object[][] getData() throws Exception
  {
	  	ExcelAPI excel = new ExcelAPI("C:\\Users\\My\\Desktop\\testData01.xlsx");
		String sheetName = "data";
		String testcaseName = "TestA";
		
		int testStartRowNum = 0;
		while(excel.getCellData(sheetName, 0,testStartRowNum).equals(testcaseName))
		{
			testStartRowNum++ ;
		}
		System.out.println("Test start from "+testcaseName+" : "+testStartRowNum);
		
		int colStartRowNum = testStartRowNum+1;
		int dataStartRowNum = testStartRowNum+2;
		 
		//Calculate rows of data
		int rows = 0;
		while(!excel.getCellData(sheetName, 0, dataStartRowNum+rows).equals(""))
		{
			rows++;
		}
		System.out.println("Total rows are : " +rows);
		
		//Calculate cols of data
		int cols = 0;
		while(!excel.getCellData(sheetName , cols , colStartRowNum).equals(""))
		{
			cols++;
		}
		System.out.println("Total Columns are : "+cols);
		
		//Read the Test Data
		int dataRow = 0;
		Object[][] data = new Object[rows][cols]; 
		Hashtable<String,String> table = null;
		for(int rNum=dataStartRowNum;rNum<dataStartRowNum+rows;rNum++)
		{
			for(int colNum=colStartRowNum;colNum<cols;colNum++) {
				//System.out.println(excel.getCellData(sheetName, colNum , rNum));
				//data[dataRow][colNum] = excel.getCellData(sheetName, colNum, rNum);
				String keys = excel.getCellData(sheetName, colNum, colStartRowNum);
				String values = excel.getCellData(sheetName, colNum, rNum);
				table.put(keys, values);
			}
			data[dataRow][0] = table;
			dataRow++;
		}
		return data;

  }
}
