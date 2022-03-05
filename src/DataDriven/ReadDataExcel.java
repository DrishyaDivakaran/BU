package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		FileInputStream  fis=new FileInputStream("./Data/FirstExcell.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data=wb.getSheet("create customer").getRow(5).getCell(1).getStringCellValue();
		System.out.println(data);
		wb.close();
		

	}

	
	}


