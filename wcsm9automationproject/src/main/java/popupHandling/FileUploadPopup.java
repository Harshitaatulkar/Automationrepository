package popupHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         driver.get("http://127.0.0.1/login.do;jsessionid=71q16j6jm88tv");
        // driver.findElement(By.id("username")).sendKeys("admin");
        // driver.findElement(By.id("password")).sendKeys("manager");
         
  //       )
         
	}

}
