package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsUnabledMethod {
            public static void main(String[] args) {
            	WebDriver  driver  = new ChromeDriver();
	            driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			    driver.get("http://demoapps.qspiders.com/");
			    //click on checkbox
			    driver.findElement(By.xpath("//section[text()='Check Box']")).click();
			    //click on email checkbox
			    driver.findElement(By.xpath("//input[@name='Domain']")).click();
			     // click on continue
			     WebElement cnb = driver.findElement(By.xpath("//input[@type='submit']"));
			     boolean continuebutton = cnb.isEnabled();
			     System.out.println(continuebutton);
			      

			}
}
