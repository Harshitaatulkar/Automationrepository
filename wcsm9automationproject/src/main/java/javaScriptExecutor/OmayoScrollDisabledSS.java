package javaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class OmayoScrollDisabledSS {
	public static void main(String[] args) throws InterruptedException, IOException {
		 WebDriver driver =new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      driver.get("http://omayo.blogspot.com/");
	     JavascriptExecutor jse = (JavascriptExecutor)driver;
	     jse.executeScript("window.scrollBy(0,1000)");
	     jse.executeScript("document.getElementById('tb2').value='automation testing'");
	     Thread.sleep(2000);
	              
	      
	               WebElement img = driver.findElement(By.id("tb2"));
	               File src = img.getScreenshotAs(OutputType.FILE);
	              
	                File dest = new File("./ScreenShots/disabletextbox.png");
	                Files.copy(src, dest);
	                                     
	     
	}

}
