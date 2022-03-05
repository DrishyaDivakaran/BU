package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver .get("https://demo.actitime.com");
		String URL=driver.findElement(By.linkText("actiTIME Inc.")).getAttribute("href");
        System.out.println(URL);
        driver.close();
	}

}
