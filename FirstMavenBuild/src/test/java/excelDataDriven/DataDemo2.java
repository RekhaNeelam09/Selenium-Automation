//package excelDataDriven;
//
//public class DataDemo2 
//{
//
//	public static void main(String[] args) throws Exception
//	{
//		ExcelAPI excel = new ExcelAPI("C:\\Users\\My\\Desktop\\testData01.xlsx");
//		System.out.println(excel.getRowCount("People"));
//		System.out.println(excel.getColumnCount("People"));
//		
////		int cellNum = 0;
////		for(int i=0;i<row.getLastCellNum();i++)
////		{			
////			if(row.getCell(i).getStringCellValue().trim().equals("Age"))
////				cellNum  = i;
////		}
////		row = People.getRow(i);
////		cell = row.getCell(cellNum);
////		cell.setCellValue("Failed");
//		for(int i = 0; i<excel.getRowCount("People");i++)
//		{
//			if((excel.getCellData("People", "Age", i)) < 18)
//			{
//				excel.setCellData("People", "Status", i, "Minor");
//			}
//			else 
//			{
//				excel.setCellData("People", "Status", i, "Major");
//			}
//		}
//
//	}
//
//}
