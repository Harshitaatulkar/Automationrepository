package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramUsingContainsXpath {
	          public static void main(String[] args) throws InterruptedException {
	        WebDriver driver =new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.instagram.com/");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("hari22atulkar@gmail.com");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("haripari2122");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();
	        
	        
				
			}

}
