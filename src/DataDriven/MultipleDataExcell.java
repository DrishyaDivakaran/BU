package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleDataExcell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream  fis=new FileInputStream("./Data.FirstExcell.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int rowCount=wb.getSheet("create customer").getLastRowNum();
		for(int i=1;i<=rowCount;i++)
		{
			String un=wb.getSheet("create customer").getRow(i).getCell(0).getStringCellValue();
			String pw=wb.getSheet("create customer").getRow(i).getCell(1).getStringCellValue();
			System.out.println(un+" "+pw);
			
		}
		

	}

}
