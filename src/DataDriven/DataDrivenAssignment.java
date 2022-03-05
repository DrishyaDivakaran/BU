package DataDriven;

import java.io.FileInputStream;

public class DataDrivenAssignment {

	public static void main(String[] args) {
		FileInputStream  fis=new FileInputStream();
		Workbook wb=WorkbookFactory.create(fis);
		int rowCount=wb.getSheet("Invalid Login").getRow(0).getLastRowlNo();
		int cellCount=wb.getSheet("Invalid Login").getRow(0).getLastCellNo();
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=0;j<=cellCount;j++)
			{
				String data=wb.getSheet("Invalid Login").getRow(1).getCell(i).getStringCellValue();
				System.out.println(data);
			}
		}

	}

}
