package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");	
	}
	public static void main(String[]args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement Measurement = driver.findElement(By.id("username"));
		int height=Measurement.getSize().getHeight();
		int width=Measurement.getSize().getWidth();
		System.out.println(height);
		System.out.println(width);	
		
		WebElement Measurement2=driver.findElement(By.name("pwd"));
		int height2=Measurement2.getSize().getHeight();
		int width2=Measurement2.getSize().getWidth();
		System.out.println(height2);
		System.out.println(width2);	
		
		
		if(height==height2 || width==width2 )
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("no");
		}

		driver.close();
	}

}
