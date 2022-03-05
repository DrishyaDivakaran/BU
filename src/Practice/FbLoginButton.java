package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLoginButton {
	static {
		System.setProperty("webdriver.chrome.driver","./driver./chromedriver.exe");
		
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		boolean logo=driver.findElement(By.xpath("//button[@value='1']")).isEnabled();
		if(logo==true) {
			System.out.println("Button is enabled");
		}
		else
		{
			System.out.println("Button not enabled");
		}
		driver.close();
	}

}
