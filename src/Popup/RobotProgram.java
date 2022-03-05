package Popup;

import java.io.IOException;
import org.openqa.selenium.interactions.Actions;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;



public class RobotProgram {

	

	public static void main(String[] args) throws AWTException,InterruptedException, IOException {
	Runtime.getRuntime().exec("notepad");
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_Q);
	r.keyRelease(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_S);
	r.keyPress(KeyEvent.VK_P);
	
	r.keyPress(KeyEvent.VK_SPACE);
	
	r.keyPress(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_L);
	r.keyRelease(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_I);
	r.keyPress(KeyEvent.VK_C);
	
	
	
	
	}

}
