package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/drish/Desktop/naukri.html");
		Thread.sleep(4000);
		driver.findElement(By.id("cv")).sendKeys("C:\\Users\\drish\\Downloads\\Drishya Divakaran-Resume.pdf");
		
		

	}

}
