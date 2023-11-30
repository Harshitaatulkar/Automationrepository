package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrameOfBluestone {
         public static void main(String[] args) throws InterruptedException {
        	 WebDriver  driver  = new ChromeDriver();
    	     driver.manage().window().maximize();
    	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	     driver.get("https://www.bluestone.com/");
    	     Thread.sleep(2000);
    	     //handle the popup
    	      driver.findElement(By.id("denyBtn")).click();
    	      //switch the control to frame
    	      //   driver.switchTo().frame(6); for int index
    	      //   driver.switchTo().frame("fc_widget");
    	      WebElement frameElement = driver.findElement(By.id("fc_widget"));
    	      driver.switchTo().frame(frameElement);
    	      Thread.sleep(2000);
    	      //click on chatbox
    	      driver.findElement(By.id("chat-icon")).click();
    	      //all the chat box are designed under main webpage so switch back the control to main page
    	      driver.switchTo().defaultContent();
    	      //handle all the textbox present inside chatbox
    	      driver.findElement(By.id("chat-fc-name")).sendKeys("harshita");
    	      driver.findElement(By.id("chat-fc-email")).sendKeys("hari22atulkar@gmail.com");
    	      driver.findElement(By.id("chat-fc-phone")).sendKeys("9878987900");
    	      driver.findElement(By.xpath("//a[@class='fc-button']")).click();
    	      
    	      
    	      
    	     
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
