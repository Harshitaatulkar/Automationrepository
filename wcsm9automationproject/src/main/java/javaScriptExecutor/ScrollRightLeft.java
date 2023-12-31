package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollRightLeft {
	public static void main(String[] args) {
		  WebDriver  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get("https://dashboards.handmadeinteractive.com/jasonlove");
		          JavascriptExecutor jse = (JavascriptExecutor)driver;
		         // to perform scroll right
		          jse.executeScript("window.scrollBy(5000,0)");
		          //to perform scroll left
		          jse.executeScript("window.scrollBy(-5000,0)");
		          
	}

}
