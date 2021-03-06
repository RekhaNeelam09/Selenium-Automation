package excelDataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriterByColName 
{
	@SuppressWarnings("null")
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\My\\Desktop\\testData01.xlsx");
		FileOutputStream fos = null;
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Login");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = null;
		
		int cellNum = 0;
		for(int i=0;i<row.getLastCellNum();i++)
		{			
			if(row.getCell(i).getStringCellValue().trim().equals("Result"))
				cellNum  = i;
		}
		row = sheet.getRow(4);
		cell = row.getCell(cellNum);
		cell.setCellValue("Failed");
		
		fos = new FileOutputStream("C:\\Users\\My\\Desktop\\testData01.xlsx");
		wb.write(fos);
		wb.close();
		fos.close();
		
	}

}
