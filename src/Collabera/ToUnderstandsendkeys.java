package Collabera;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandsendkeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();

driver.get("https://www.skillary.com/user/login");
Thread.sleep(2000);
driver.findElement(By.linkText("X")).click();
WebElement usernameTextfield=driver.findElement(By.id("email"));
 
		usernameTextfield.sendKeys("sou","ja","nya",Keys.CONTROL+"a");
		Thread.sleep(2000);
		usernameTextfield.sendKeys(Keys.CONTROL+"c");
		
		WebElement passwordTextfield=driver.findElement(By.name("password"));
		passwordTextfield.clear();
		Thread.sleep(2000);
		passwordTextfield.sendKeys(Keys.CONTROL+"v");
	}
