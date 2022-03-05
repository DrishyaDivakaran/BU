package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssiAutomationTesting {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		driver.switchTo().alert().dismiss();
		//driver.findElement(By.id("Cancel").click();
		//Alert a=driver.switchTo().alert();
		
		
		
		/*String text=a.getText();
		a.accept();
		System.out.println(text);
		
		
		
		driver.close();*/
		
		
		

	}

}
