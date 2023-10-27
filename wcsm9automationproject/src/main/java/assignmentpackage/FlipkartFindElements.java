package assignmentpackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartFindElements {
	          public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.flipkart.com/");
			// close the popup
			driver.findElement(By.xpath("//span[@role='button']")).click();
			// search the laptop and click on search
			driver.findElement(By.name("q")).sendKeys("laptop");
			driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
			//click on brand
			driver.findElement(By.xpath("//div[text()='Brand']")).click();
			//click on hp
			driver.findElement(By.xpath("//div[text()='HP']")).click();
			Thread.sleep(2000);
			//click on processor
			driver.findElement(By.xpath("//div[text()='Processor']")).click();
			driver.findElement(By.xpath("//span[text()='13 MORE']")).click();
			//click on i7 processor
			driver.findElement(By.xpath("//div[text()='Core i7']")).click();
			// click on rating 4 and above
			driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
			Thread.sleep(2000);
			   List<WebElement> allLaptops = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
			   
			   for(int i=0;i<allLaptops.size();i++)
			   {   
				   String laptop = allLaptops.get(i).getText();
				   Thread.sleep(2000);
				   System.out.println(laptop);
				   
			   }
			
			
			
			
			
			}

}
