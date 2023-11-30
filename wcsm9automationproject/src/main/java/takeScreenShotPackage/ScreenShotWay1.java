package takeScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;



public class ScreenShotWay1 {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
	     TakesScreenshot ts = (TakesScreenshot)driver;
	     File src = ts.getScreenshotAs(OutputType.FILE);
	      File dest = new File("./ScreenShots/bluestone.png");
	      Files.copy(src, dest);
	      
	      
	}

}
