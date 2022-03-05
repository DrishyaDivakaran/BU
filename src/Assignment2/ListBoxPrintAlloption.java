package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxPrintAlloption {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/drish/Desktop/MultiListBox.html");
		 WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		 Select s=new Select(mtrlistbox);
		 WebElement options = s.getWrappedElement();
		 String text=options.getText();
		 System.out.println(text);
		 driver.close();
		 
		 
		

	}

}
