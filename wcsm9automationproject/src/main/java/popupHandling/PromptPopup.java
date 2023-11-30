package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup {
                   public static void main(String[] args) throws InterruptedException {
              	     WebDriver  driver	= new ChromeDriver();
                     driver.manage().window().maximize();
                     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
                     driver.get("https://demoapps.qspiders.com/");
                     //click on popup
                     driver.findElement(By.xpath("//section[text()='Popups']")).click();
                     Thread.sleep(2000);
                     //click on java script
                     driver.findElement(By.xpath("//section[text()='Javascript']")).click();
                     Thread.sleep(2000);
                     driver.findElement(By.xpath("//a[text()='Prompt']")).click();
                     Thread.sleep(2000);
                     driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
                     Thread.sleep(2000);
                         Alert prompt = driver.switchTo().alert();
                         
                         Thread.sleep(2000);
                         prompt.sendKeys("yes"); 
                         prompt.accept();
                       //type no and dismiss it
                        // prompt.sendKeys("no");
                        // prompt.dismiss();
                         
                     
                	   
                	   
                	   
                	   
                	   
                	   
                	   
                	   
                	   
                	   
                	   
                	   
                	   
                	 
				}
}
