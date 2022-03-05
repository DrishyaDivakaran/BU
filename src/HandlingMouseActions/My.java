package HandlingMouseActions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

		public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.linkText("actiTIME Inc.")).click();
		
			Set<String> allwindowd = driver.getWindowHandles();
			int count = allwindowd.size();
			System.out.println("total tabs opened = "+count);
			for (String text:allwindowd)
			{
				String title = driver.switchTo().window(text).getTitle();
				Thread.sleep(2000);
				System.out.println(title);
				
				//closing tab one by one
				driver.close();
			}
		}
	}


	