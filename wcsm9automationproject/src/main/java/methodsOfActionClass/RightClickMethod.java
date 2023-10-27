package methodsOfActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickMethod {

	public static void main(String[] args) {
		WebDriver	driver	= new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    //launch the demoapp
	    driver.get("https://demoapps.qspiders.com/");
	    driver.findElement(By.xpath("//section[text()='Button']")).click();
	    driver.findElement(By.xpath("//a[text()='Right Click']")).click();
	    WebElement rightClick = driver.findElement(By.xpath("(//button[text()='Right Click'])[1]"));
	     Actions act = new Actions(driver);
	     act.contextClick(rightClick).perform();
	     WebElement rightClick2 = driver.findElement(By.xpath("(//button[text()='Right Click'])[2]"));
	     act.contextClick(rightClick2).perform();
	     WebElement rightClick3 = driver.findElement(By.xpath("(//button[text()='Right Click'])[3]"));
	     act.contextClick(rightClick3).perform();
	                  
	    

	}

}
