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
         public static void main(String[] args) throws AWTException, InterruptedException {
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
     	 driver.findElement(By.xpath("//a[text()='Band']")).click();
     	 WebElement filterby = driver.findElement(By.xpath("//span[text()='FILTERED BY']"));
     	 for(int i=0;i<=2;i++)
     	 {
     		 act.doubleClick(filterby).perform();
     		 Thread.sleep(2000);
     		 act.clickAndHold(filterby).perform();
         }
     	 Robot robot = new Robot();
     	 robot.keyPress(KeyEvent.VK_CONTROL);
     	 robot.keyPress(KeyEvent.VK_C);
     	 robot.keyRelease(KeyEvent.VK_CONTROL);
     	 robot.keyPress(KeyEvent.VK_C);
     	 
     	 driver.findElement(By.id("search_query_top_elastic_search")).click();
     	  //paste it on search 
     	Thread.sleep(2000);
     	 robot.keyPress(KeyEvent.VK_CONTROL);
     	 robot.keyPress(KeyEvent.VK_V);
     	Thread.sleep(2000);
     	 robot.keyRelease(KeyEvent.VK_CONTROL);
     	 robot.keyRelease(KeyEvent.VK_V);
     	Thread.sleep(2000);
     	  
     	 //click on search button
     	 driver.findElement(By.xpath("//input[@type='submit']")).submit();
     	 
     	
     	    
     	    
		}
}
