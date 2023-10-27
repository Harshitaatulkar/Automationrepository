package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginLocator {
	public static void main(String[] args) throws InterruptedException {
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://www.instagram.com/");
	            driver.findElement(By.name("username")).sendKeys("helloworld@gmail.com");
	            Thread.sleep(2000);
	            driver.findElement(By.name("password")).sendKeys("helloworld");
	            
		        
		        
		        
		        
	}

}
