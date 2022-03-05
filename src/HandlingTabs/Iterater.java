package HandlingTabs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iterater {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> alltabwh = driver.getWindowHandles();
		Iterator<String> itr = alltabwh.iterator();
		String pwh=itr.next();
		String cwh=itr.next();
		driver.switchTo().window(cwh);
		driver.close();
		driver.switchTo().window(pwh);
		driver.close();
	}

}
