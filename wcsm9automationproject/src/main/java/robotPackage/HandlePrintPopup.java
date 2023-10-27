package robotPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePrintPopup {
             public static void main(String[] args) throws AWTException, InterruptedException {
				     WebDriver     driver = new ChromeDriver();
				     driver.manage().window().maximize();
				     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				     driver.get("https://www.selenium.dev/");
				     //generate printpopup ctrl+p
				     Robot robot = new Robot();
				     //press ctrl + p
				     Thread.sleep(2000);
				     robot.keyPress(KeyEvent.VK_CONTROL);
				     robot.keyPress(KeyEvent.VK_P);
				     //release ctrl + p
				     Thread.sleep(2000);
				     robot.keyRelease(KeyEvent.VK_CONTROL);
				     robot.keyRelease(KeyEvent.VK_P);
				     //handle printpopup
				     Thread.sleep(2000);
				     robot.keyPress(KeyEvent.VK_TAB);
				     robot.keyRelease(KeyEvent.VK_TAB);
				     //press enter key
				     Thread.sleep(2000);
				     robot.keyPress(KeyEvent.VK_ENTER);
				     robot.keyRelease(KeyEvent.VK_ENTER);
				     driver.quit();
				     
				     
				    
			
			}
}
