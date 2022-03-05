package AaaTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstPgm {
	@Test
	
	public void openApplication() {
		Reporter.log("hello",true);
	}
	@Test
	public void login() {
		
		Reporter.log("my page",false);
	}
	@Test
    public void selectItem() {
		
		Reporter.log("my item in bag");
	}
	

}
