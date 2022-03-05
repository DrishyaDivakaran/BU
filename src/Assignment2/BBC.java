package Assignment2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBC {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/news");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//butten[@aria-label='Close']")).click();
		List<WebElement> news = driver.findElements(By.xpath("//ol[@class='gel-layout gel-layout--no-flex']"));
		int count=news.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			System.out.println(news.get(i).getText());
		}
		driver.close();

	}

}
