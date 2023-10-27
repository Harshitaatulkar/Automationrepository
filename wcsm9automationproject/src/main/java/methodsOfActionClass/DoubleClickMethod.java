package methodsOfActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver	= new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    //launch the demoapp
	    driver.get("https://demoapps.qspiders.com/");
	    driver.findElement(By.xpath("//section[text()='Button']")).click();
	    driver.findElement(By.partialLinkText("Double Click")).click();
	           WebElement doubleclick = driver.findElement(By.xpath("(//button[text()='Yes'])[1]"));
	           Actions act = new Actions(driver);
	           Thread.sleep(2000);
	           act.doubleClick(doubleclick).perform();
	           WebElement doubleclick2 = driver.findElement(By.xpath("(//button[text()='Yes'])[2]"));
	           Thread.sleep(2000);
	           act.doubleClick(doubleclick2).perform();
	          if(driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']")).isDisplayed());
	          {
	        	  System.out.println("text is displayed");
	          }
	       
	          }

}
