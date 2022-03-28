package excelDataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAPI 
{
	public static FileInputStream fis1 = null;
	public FileOutputStream fos = null;
	public XSSFWorkbook wb = null;
	public XSSFSheet sheet = null;
	public XSSFRow row = null;
	public XSSFCell cell = null;
	String xfilePath;
	
	// Here we are starting constructor , initializing A FileInputStream and Workbook.
	//When this constructor is called whenever we create object for'ExcelAPI' in the testcases then below 
	//constructor will be called to initialize the FileInputStream and Workbook.
	//Once we initialized the FileInputStream and WorkBook then we can interact the sheet in gettig the rows ,
	//getting the columns and getting the values
	public ExcelAPI(String xfilePath) throws Exception
	{
		System.out.println("Excel is Initialized...");
		this.xfilePath = xfilePath;
		fis1 = new FileInputStream(xfilePath);
		wb = new XSSFWorkbook(fis1);
	}
	
	
	public int getRowCount ( String sheetName )
	{
		sheet = wb.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum()+1;
		return rowCount;
	}
	public int getColumnCount(String sheetName)
	{
		sheet = wb.getSheet(sheetName);
		row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		return colCount;
	}
	
	//Reading Cell data from Excel by using Column Number
	public String getCellData(String sheetName,int rowNum,int colNum)
	{
		try 
		{
			sheet = wb.getSheet(sheetName);
			 row = sheet.getRow(rowNum);
			 cell = row.getCell(colNum);
			 
			 if(cell.getCellTypeEnum()==CellType.STRING)
			 	return cell.getStringCellValue();
			 else if(cell.getCellTypeEnum() == CellType.NUMERIC || cell.getCellTypeEnum() == CellType.STRING)
			 {
				 String cellValue = String.valueOf(cell.getNumericCellValue());
				 if(HSSFDateUtil.isCellDateFormatted(cell))
				 {
					 DateFormat dt = new SimpleDateFormat("dd/mm/yyyy");
					 Date date = cell.getDateCellValue();
					 cellValue = dt.format(date);
				 }
				 return cellValue;
			 }
			 else if(cell.getCellTypeEnum()== CellType.BLANK)
				 return "";
			 else 
				 return String.valueOf(cell.getBooleanCellValue());				
		}
		catch(Exception e) {
			e.printStackTrace();
			return "No matching value";
		}
		
	}
	
	//Reading Cell data from Excel by using Column Number
	public String getCellData ( String sheetName , String colName , int rowNum )	
	{
	try 
	{ 
		int colNum = -1;
		sheet = wb.getSheet(sheetName);
		row = sheet.getRow(0);
		for(int i = 0;i<row.getLastCellNum();i++)
		{
			if(row.getCell(i).getStringCellValue().trim().equals(colName)) 
			{
				colNum = i;
			}
		}
		row = sheet.getRow(rowNum);
		cell = row.getCell(colNum);
		
		if(cell.getCellTypeEnum() == CellType.STRING)
		{
			return cell.getStringCellValue();
		}
		else if(cell.getCellTypeEnum() == CellType.NUMERIC || cell.getCellTypeEnum() == CellType.STRING)
		{
			String cellValue = String.valueOf(cell.getNumericCellValue());
			 if(HSSFDateUtil.isCellDateFormatted(cell))
			 {
				 DateFormat dt = new SimpleDateFormat("dd/mm/yyyy");
				 Date date = cell.getDateCellValue();
				 cellValue = dt.format(date);
			 }
			 return cellValue;
		}
		else if(cell.getCellTypeEnum()== CellType.BLANK)
			return "";
		else 
			return String.valueOf(cell.getBooleanCellValue());				
	}

	catch(Exception e)
	{
		e.printStackTrace();
		return "No matching value";
	}
}
	//Writing cell data to Excel by using Column Number
	public boolean setCellData(String sheetName,int string,int rowNum,String value)
	{
		try 
		{
			sheet = wb.getSheet(sheetName);
			row = sheet.getRow(rowNum);
			cell = row.getCell(string);
			
			cell.setCellValue(value);
			fos = new FileOutputStream(xfilePath);
			wb.write(fos);
			fos.close();	
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	//Writing Cell data to Excel by using Column Name
			public String getCellData ( String sheetName , String colName , int rowNum ,String value)	
			{
			try 
			{ 
				int colNum = -1;
				sheet = wb.getSheet(sheetName);
				
				row = sheet.getRow(rowNum);
				for(int i = 0;i<row.getLastCellNum();i++)
				{
					if(row.getCell(i).getStringCellValue().trim().equals(colName)) 
					{
						colNum = i;
					}
				}
				row = sheet.getRow(rowNum+1);
				cell = row.getCell(colNum);
				
				if(cell.getCellTypeEnum() == CellType.STRING)
				{
					return cell.getStringCellValue();
				}
				else if(cell.getCellTypeEnum()==CellType.NUMERIC || cell.getCellTypeEnum()==CellType.FORMULA)
				{
					String cellValue = String.valueOf(cell.getNumericCellValue());
					 if(HSSFDateUtil.isCellDateFormatted(cell))
					 {
						 DateFormat dt = new SimpleDateFormat("dd/mm/yyyy");
						 Date date = cell.getDateCellValue();
						 cellValue = dt.format(date);
					 }
					 return cellValue;
				}
				else if(cell.getCellTypeEnum()== CellType.BLANK)
					return "";
				else 
					return String.valueOf(cell.getBooleanCellValue());				
			}
		
			catch(Exception e)
			{
				e.printStackTrace();
				return "No matching value";
			}
		}


	public static void main(String[] args) 
	{
		
		
	
	}

}
