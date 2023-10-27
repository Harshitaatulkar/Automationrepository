package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) throws InterruptedException {
		         WebDriver driver =  new ChromeDriver();
		         driver.manage().window().maximize();
		         Thread.sleep(2000);
		         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		         driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys();
		         Thread.sleep(2000);
		         driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys();
		         Thread.sleep(2000);
		         driver.findElement(By.cssSelector("button[type='submit'])")).click();	         
	}
}
