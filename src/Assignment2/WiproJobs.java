package Assignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproJobs {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("wipro jobs");
		 List<WebElement>url=driver.findElements(By.xpath("//a"));
		 int count=url.size();
		 System.out.println(count);
		 for(int i=0;i<count;i++)
		 {
			 String text=url.get(i).getAttribute("href");
			 
			 System.out.println(text);
		 }
		 
		driver.close();
	}

}
