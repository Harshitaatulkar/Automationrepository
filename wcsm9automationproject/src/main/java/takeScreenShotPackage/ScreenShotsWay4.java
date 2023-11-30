package takeScreenShotPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenShotsWay4 {
	public static void main(String[] args) throws IOException {
		    WebDriver driver= new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.flipkart.com/");
		    EventFiringWebDriver ewf = new EventFiringWebDriver(driver);
		    TakesScreenshot ts = (TakesScreenshot)driver;
		    //call a method
		    File src = ts.getScreenshotAs(OutputType.FILE);
		    //define way for storing ss
		    File dest = new File("./ScreenShots/flipkart.png");
		    //store the screenshot into destination
		    Files.copy(src, dest);
		    
		 
	}

}
