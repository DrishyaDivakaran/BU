package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateChrome {
static{
	System.setProperty("webdriver.chrome.driver","./driver./chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("");
		Thread.sleep(1000);
		List<WebElement> allSugg=driver.findElement(By.xpath(""));
		int count=allSugg.size();
	    System.out.println(count);
	    for(int i=0;i<count;i++)
	    {
	    	String text=allSugg.size();
	    	System.out.println(text);
	    }
		allSugg.get(0).click();
		
				

	}

}
