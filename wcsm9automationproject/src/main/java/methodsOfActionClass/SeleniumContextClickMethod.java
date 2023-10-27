package methodsOfActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumContextClickMethod {
	public static void main(String[] args) {
		WebDriver	driver	= new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    //launch the selenium
	    driver.get("https://www.selenium.dev/");
	            WebElement download = driver.findElement(By.xpath("//span[text()='Downloads']"));
	                    Actions act = new Actions(driver);
	                    act.contextClick(download).perform();
	                    
	}

}
