package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Present1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		String url=driver.findElement(By.linkText("actiTIME Inc")).getTagName();
		if(url.equals("a")) 
		{
			System.out.println("present");
		}
		else {
			System.out.println("not");
		}
		
		driver.close();
	    }
        }
