package excelDataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriterByColNum 
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\My\\Desktop\\testData01.xlsx");
		FileOutputStream fos = null;
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Login");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(4);
		cell.setCellValue("Passed");
		fos = new FileOutputStream("C:\\Users\\My\\Desktop\\testData01.xlsx");
		wb.write(fos);
		wb.close();
		fos.close();
		
	}

}
