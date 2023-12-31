package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium {
  @Test
  public void selenium_method() throws InterruptedException {
	  WebDriver driver = new EdgeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   driver.get("https://www.google.com");
	   Thread.sleep(2000);
	   driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
	   Thread.sleep(4000);
	   driver.close();
	
	   
  }
}
