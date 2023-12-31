package takeScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class BluestoneScreenshotOfWebElement {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.bluestone.com/");
	    //handle popup
	    driver.findElement(By.id("denyBtn")).click();
	    //identify the coins text and perform mousehover
	    WebElement coinsTarget = driver.findElement(By.xpath("//a[text()='Coins ']"));
	         Actions act = new Actions(driver);
	         act.moveToElement(coinsTarget).perform();
	         driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
	    WebElement img = driver.findElement(By.xpath("//img[@alt='50 gram 24 KT Lakshmi Gold Coin']"));
	              File src = img.getScreenshotAs(OutputType.FILE);
	              File dest = new File("./Screenshots/coinsimg.png");
	              Files.copy(src, dest);
	      
	         
	          
	         
	}

}
