package Naukri;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrowser {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		System.out.println("enter the title to be closed");
		Scanner s=new Scanner(System.in);
		String sc=s.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		 Set<String> allwh = driver.getWindowHandles();
		 for(String wh:allwh)
		 {
			 driver.switchTo().window(wh);
			 String title=driver.getTitle();
			if(title.equals(expectedTitle));
			 {
				 driver.close();
			 }
		 }

	}

}
