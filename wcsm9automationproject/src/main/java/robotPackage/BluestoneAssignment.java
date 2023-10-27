package robotPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneAssignment {
         public static void main(String[] args) throws AWTException {
          WebDriver    driver	= new ChromeDriver();
        	 driver.manage().window().maximize();
     	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     	    //launch the bluestone
     	    driver.get("https://www.bluestone.com/");
     	    //handle the popup
     	    driver.findElement(By.id("denyBtn")).click();
     	    //mouse over watch jewellery
     	  WebElement jewellery = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
     	 Actions act = new Actions(driver);
     	 act.moveToElement(jewellery).perform();
     	 //click on band
     	 driver.findElement(By.xpath("//a[text()='Band']"));
     	 driver.findElement(By.xpath("//span[text()='FILTERED BY']"));
     	
     	Robot robot = new Robot();
     	robot.keyPress(KeyEvent.VK_CONTROL);
     	robot.keyPress(KeyEvent.VK_COPY);
     	
     	    
     	    
		}
}
