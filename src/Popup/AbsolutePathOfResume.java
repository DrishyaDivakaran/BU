package Popup;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsolutePathOfResume {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/drish/Desktop/naukri.html");
		File f=new File("./Data/resume/Drishya Divakaran-Resume.pdf");
		String absolutepath=f.getAbsolutePath();
				Thread.sleep(4000);
		
		driver.findElement(By.id("cv")).sendKeys(absolutepath);
		

	}

}
