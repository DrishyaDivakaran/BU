package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Font1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String weight=driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-weight");
		String type=driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
		
		System.out.println(weight);
		System.out.println(type);
		
		driver.close();
		

	}

}
