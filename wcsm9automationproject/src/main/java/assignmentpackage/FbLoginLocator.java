package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLoginLocator {

	public static void main(String[] args) throws InterruptedException {
		           WebDriver driver = new ChromeDriver();
		           driver.manage().window().maximize();
		           Thread.sleep(2000);
		           driver.get("https://www.facebook.com/login/"); 
		           driver.findElement(By.id("email")).sendKeys("hari22atulkar@gmail.com");
		           Thread.sleep(2000);
		           driver.findElement(By.id("pass")).sendKeys("Harshita@123");
		           
	}

}
