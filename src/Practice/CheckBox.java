package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		
		boolean logo=driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		if(logo==true) {
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo not prresent");
		}
		driver.close();
		}	
}


	
	