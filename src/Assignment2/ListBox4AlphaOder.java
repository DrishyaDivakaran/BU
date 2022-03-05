package Assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox4AlphaOder {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/drish/Desktop/MultiListBox.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListbox);
		 List<WebElement> allOption = s.getOptions();
		 int count = allOption.size();
		 ArrayList<String> al= new ArrayList();
		 for(WebElement option:allOption)
		 {
			 String txt=option.getText();
			 al.add(txt);
			 
		 }
               Collections.sort(al);
               for(String text:al) {
            	   System.out.println(text);
            	   
               }
               driver.close();
	}

}
