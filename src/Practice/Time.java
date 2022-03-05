package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Time {
	static{
		System.setProperty("webdriver.chromedriver","/.driver.chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("user name")).sendKeys("admins");
		driver.findElement(By.xpath("//div['login']")).click();
		driver.findElement(By.id("logoutLink")).click();
	}

}
