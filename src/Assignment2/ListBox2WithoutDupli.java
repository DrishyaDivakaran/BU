package Assignment2;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2WithoutDupli {
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
		HashSet<String>hs=new HashSet();
		for(int i=0;i<count;i++)
		{
			String txt=allOption.get(i).getText();
			System.out.println(txt);
			
		}
		for(String text:hs)
		{
			System.out.println(text);
		}
		driver.close();
	}

}
