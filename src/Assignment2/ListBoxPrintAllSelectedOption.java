package Assignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxPrintAllSelectedOption {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/drish/Desktop/MultiListBox.html");
		 WebElement checkpostlistbox=driver.findElement(By.id("cp"));
		 Select s=new Select(checkpostlistbox);
		 
		
		 List<WebElement>sAllOptions=s.getAllSelectedOptions();
		 int count=sAllOptions.size();
		 System.out.println(count);
		  for(int i=0;i<count;i++)
		  {
			  String text=sAllOptions.get(i).getText();
			  System.out.println(text);
		  }
		 driver.close();
		 

	}

}
