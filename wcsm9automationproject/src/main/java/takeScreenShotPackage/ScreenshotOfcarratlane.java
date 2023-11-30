package takeScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotOfcarratlane {
      public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
  	    driver.manage().window().maximize();
  	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  	    driver.get("https://www.caratlane.com/");
  	    //take screenshot of the webpage (typecasting explicitly)
  	    TakesScreenshot ts = (TakesScreenshot)driver;
  	    //call a method
  	    File src = ts.getScreenshotAs(OutputType.FILE);
  	  //define way for storing ss
	    File dest = new File("./ScreenShots/carratlane.png");
	    //store the screenshot into destination
	    Files.copy(src, dest);
	}
}

