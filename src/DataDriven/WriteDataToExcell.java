package DataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcell {
	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream  fis=new FileInputStream("./Data/FirstExcell.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet("create customer").getRow(1).getCell(1).setCellValue("delete");
		FileOutputStream  fos=new FileOutputStream("./Data/FirstExcell.xlsx");
		wb.write(fos);
		wb.close();
		

	}

}
