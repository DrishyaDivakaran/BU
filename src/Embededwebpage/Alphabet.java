package Embededwebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alphabet {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/drish/Desktop/page1.html");
		driver.switchTo().frame(1);
		driver.findElement(By.id("t2")).sendKeys("a");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("b");
		WebElement frm = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frm);
		driver.findElement(By.id("t2")).sendKeys("c");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("d");
		

	}

}
