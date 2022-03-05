package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

public class SelectAllCheckBox {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter the url");
		String url = s.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		List<WebElement> chechbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count=chechbox.size();
		for(int i=0;i<count;i++)
		{
			System.out.println(chechbox.get(i));
		}
		driver.close();

	}

}
