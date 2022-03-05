package assignmentPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RenewInsurence {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
				WebDriver driver =new ChromeDriver();
				driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
				driver.findElement(By.xpath("//input[@placeholder='Policy Number']")).sendKeys("12345678");
				driver.findElement(By.xpath("//input[@placeholder='DOB']")).click();
				
				//assigning the month to a variable
				WebElement month = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
				//passing the variable to the NS method by creating an object of Select class
				Select s=new Select(month);
				s.selectByVisibleText("Aug");		
				WebElement year = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
				Select s1=new Select(year);
				s1.selectByValue("1984");
				driver.findElement(By.xpath("(//a[@class='ui-state-default'])[29]")).click();
				
				driver.findElement(By.xpath("//input[@placeholder='Contact Number']")).sendKeys("0987654321");
				
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//button[@name='renew_policy_submit'])[2]")).submit();
				
				//Storing and Printing the Text which is received in response
				String message = driver.findElement(By.xpath("//p[@class='ValidationErrorsBot']")).getText();
				System.out.println(message);
				
				//validating the response text if it contains the work from check String
				String check="lapsed";
				if (message.contains(check))
				{
					System.out.println("Result is pass");
				}
				else
				{
					System.out.println("Result is fail");
				}
				
				driver.close();

				
			}

		}



