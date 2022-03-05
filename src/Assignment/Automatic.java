package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automatic {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String Current=driver.getCurrentUrl();
		if(Current.contains("url is here"))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not");
		}
		//driver.close();
		// IN THE GIVEN URL  CHECK WHETHER IT CONTAIN GOGLE.COM OR NOT//

	}

}
