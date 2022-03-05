package Assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckWhetherCurrentURLpresent {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String url=driver.getCurrentUrl();
		
		if(url.contains("gogle.com"));
		{
			System.out.println("yes");
		}
	}
	
		
		{
			System.out.println("no");
		
			
		}
			

	}


