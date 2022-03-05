package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iphone13PriceName {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("ipnone 13 pro"+Keys.ENTER);
		Thread.sleep(5000);
		  List<WebElement> suggestname =driver.findElements(By.xpath("//div[@class='_4rR0IT']"));
		  List<WebElement> suggestprice =driver.findElements(By.xpath("//div[@class='_30jeq3_I_WHNI']"));
		int namecount=suggestname.size();
		System.out.println(namecount);
		int pricecount=suggestprice.size();
		System.out.println(pricecount);
		for(int i=0;i<namecount;i++)
		{
			System.out.println(suggestname.get(i).getText()+"-----"+suggestprice.get(i).getText());
		}
		
		driver.quit();

	}

}
