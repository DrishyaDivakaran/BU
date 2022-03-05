package Listbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement monthListBox = driver.findElement(By.id("Month"));
		//WebElement monthListBox = driver.findElement(By.id("year"));
		Select s=new Select(monthListBox);
		s.selectByValue("1");
		//s.selectByValue("2021");
		//s.selectByVisibleText("Oct");
		
		
		
        
		


	}

}
