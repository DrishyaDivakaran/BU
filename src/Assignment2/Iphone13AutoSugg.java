package Assignment2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone13AutoSugg {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Sparx Shoes");
		Thread.sleep(1000);
		List<WebElement> suggestions = driver.findElements(By.className("Y5N33s"));
		int count=suggestions.size();
		System.out.println(count);
		for(WebElement print:suggestions)
		{
			String title=print.getText();
			System.out.println(title);
		}
		
		driver.close();
	

	}

}
