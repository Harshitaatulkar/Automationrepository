package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {
	       public static void main(String[] args) throws InterruptedException {
			         WebDriver driver    = new ChromeDriver();
			         driver.manage().window().maximize();
			         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			         Thread.sleep(2000);
			         WebElement usnTB = driver.findElement(By.name("username"));
			         usnTB.sendKeys("admin");
			         WebElement pwdTB = driver.findElement(By.name("password"));
			         pwdTB.sendKeys("admin123");
			         driver.findElement(By.xpath("//button[@type='submit']")).click();
			         
		}

}
