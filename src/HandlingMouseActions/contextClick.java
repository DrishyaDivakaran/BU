package HandlingMouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class contextClick {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement link = driver.findElement(By.linkText("https://demo.actitime.com/login.do"));
		Actions a=new Actions(driver);
		a.contextClick(link).perform();
	
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_W);
		driver.quit();
		
		
		

	}

}
