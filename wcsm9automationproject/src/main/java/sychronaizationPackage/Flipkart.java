package sychronaizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	         public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.flipkart.com/");
			// handle the popup
			driver.findElement(By.xpath("//span[text()='✕']")).click();
			//click on cart
			driver.findElement(By.xpath("//a[text()='Cart']")).click();
			//apply a wait
			//Thread.sleep(2000);
			//click on login button
			driver.findElement(By.xpath("//span[text()='Login']")).click();
			//driver.quit();
			}

}
