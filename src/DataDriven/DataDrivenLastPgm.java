package DataDriven;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class DataDrivenLastPgm {

	
	public static void main(String[] args) {
		FileInputStream  fis=new FileInputStream("./Data.FirstExcell.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet sheet=wb.getSheet("create customer");
		Row row=sheet.getRow(1);
		Cell cell=row.getCell(0);
		String data=cell.getStringCellValue();
		System.out.println(data);
	}

}
