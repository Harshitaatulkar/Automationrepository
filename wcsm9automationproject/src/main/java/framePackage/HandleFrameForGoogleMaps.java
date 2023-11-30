package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrameForGoogleMaps {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver  driver  = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.get("https://www.google.com");
	     Thread.sleep(2000);
	     //clcik on google apps
	     driver.findElement(By.xpath("//a[@aria-lable='Google apps']")).click();
	     Thread.sleep(2000);
	     //before clicking on maps switch controls
	     // driver.switchTo().frame(2);
	     // driver.switchTo().frame("app");
	     driver.switchTo().defaultContent();
	     WebElement application = driver.findElement(By.name("app"));
	     driver.switchTo().frame(application);
	     // click on maps 
	      Thread.sleep(2000);
	     driver.findElement(By.xpath("//span[text()='Maps']")).click();
	     
	}

}

