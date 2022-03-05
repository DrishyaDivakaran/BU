package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FcebookAlignment {
	static {
		System.setProperty("webdriver.chrome.driver","./driver./chromedriver.exe");	
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		   int female =driver.findElement(By.xpath("//label[contains(text(),'Female']")).getLocation().getY();
		 int male =driver.findElement(By.xpath("//label[contains(text(),'Male']")).getLocation().getY();
		 int custom=driver.findElement(By.xpath("//label[contains(text(),'Custom']")).getLocation().getY();
		 System.out.println("checking the alignment radio button");
		 System.out.println(female);
		 System.out.println(male);
		 System.out.println(custom);
		 driver.close();
		 if(female==male && male==custom)
		 {
			System.out.println("alligned");
		 }
		 else
		 {
			 System.out.println("not ");
		 }
		//driver.close();
	}
}
      
