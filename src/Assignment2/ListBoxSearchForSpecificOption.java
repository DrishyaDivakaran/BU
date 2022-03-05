package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Scanner;

public class ListBoxSearchForSpecificOption {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter the option");
		String expectedtext=s.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/drish/Desktop/MultiListBox.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s1=new Select(mtrListbox);
		List<WebElement> allOptions =s1.getOptions();
		int count=allOptions.size();
		int counter=0;
		for(int i=0;i<count;i++)
		{
			String actualText=allOptions.get(i).getText();
			if(expectedtext.equals(actualText))
			{
				counter++;
			}
		}
		if(counter==0)
		{
			System.out.println(expectedtext + " is not present");
		}
		else if(counter==1)
		{
			System.out.println(expectedtext + " is present");
		}
		else if(counter>1)
		{
			System.out.println(expectedtext + " is present with duplicate");
		}
		driver.close();
	}

}
