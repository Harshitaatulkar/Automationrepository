package javaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScrollAndScreenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		 WebDriver driver= new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        driver.get("https://www.selenium.dev");
	        //perform scroll 
	        Thread.sleep(2000);
	        JavascriptExecutor jse = (JavascriptExecutor)driver;
	       //for scroll down
	       //jse.executeScript("window.scrollBy(0,5000)");
	       //   Thread.sleep(2000);
	         WebElement twtimg = driver.findElement(By.xpath("//i[@class='fab fa-twitter']"));
	                   File src = twtimg.getScreenshotAs(OutputType.FILE);
	                   File dest = new File("./ScreenShots/twitterimg.png");
	                   Files.copy(src, dest);
	       //use location also  
	        jse.executeScript("arguments[0].srollIntoview(true)",twtimg);
	        
	        
	        
	        
	        
	        
	}

}
