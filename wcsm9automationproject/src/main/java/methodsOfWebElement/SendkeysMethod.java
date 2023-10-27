package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysMethod {
                     public static void main(String[] args) throws InterruptedException {
				WebDriver	driver	= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/login/");
				Thread.sleep(2000);
			WebElement usnTB = driver.findElement(By.id("email"));
			usnTB.sendKeys("admin");
			 WebElement pwdTB = driver.findElement(By.id("pass"));
			 pwdTB.sendKeys("admin123");
			 driver.findElement(By.id("loginbutton")).click();
			
				
					}
}
