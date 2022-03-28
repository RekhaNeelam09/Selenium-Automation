package excelDataDriven;

public class DataDemo 
{

	public static void main(String[] args) throws Exception 
	{
		ExcelAPI excel = new ExcelAPI("C:\\Users\\My\\Desktop\\testData01.xlsx");
		System.out.println(excel.getRowCount("Login"));
		System.out.println(excel.getColumnCount("Login"));
		System.out.println(excel.getCellData("Login", 1, 1));
		System.out.println(excel.getCellData("Login", "UserName", 2));
		System.out.println(excel.setCellData("Login", 4, 2, "Aborted"));


	}

}
