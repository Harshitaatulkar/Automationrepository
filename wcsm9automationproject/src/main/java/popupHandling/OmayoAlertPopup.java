package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoAlertPopup {
                  public static void main(String[] args) throws InterruptedException {
                	  WebDriver driver =new ChromeDriver();
            	      driver.manage().window().maximize();
            	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            	      driver.get("http://omayo.blogspot.com/");
            	      Thread.sleep(2000);
            	      driver.findElement(By.id("alert1")).click();
            	      Thread.sleep(2000);
            	      Alert al = driver.switchTo().alert();
            	      Thread.sleep(2000);
            	     // al.accept();
            	      String text = al.getText();
            	      Thread.sleep(2000);
            	      System.out.println(text);
            	      al.dismiss();
            	      
            	      
				}
}
