package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
	public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.selenium.dev");
        //perform scroll 
        Thread.sleep(2000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //for scroll down
        jse.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        //for scroll up
        jse.executeScript("window.scrollBy(0,-500)");
        //for scroll right
        Thread.sleep(2000);
        // jse.executeScript("window.scrollBy(1000,0)");
        
        
	}

}
