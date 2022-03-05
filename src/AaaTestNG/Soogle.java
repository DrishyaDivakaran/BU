package AaaTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soogle {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
    @Test
    public void verifyTitle()
    {
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.google.com/");
    	String expectedTitle="soogle";
    	String actualTitle=driver.getTitle();
    	//SoftAssert s=new SoftAssert();
    	//s.assertEquals(actualTitle, expectedTitle);
    	Assert.assertEquals(actualTitle, expectedTitle);
    	driver.close();
       //	s.assertAll();
    }
    

}
