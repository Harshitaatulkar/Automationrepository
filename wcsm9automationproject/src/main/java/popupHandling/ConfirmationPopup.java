package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {
               
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
	                     //click on confirm on right hand navigation
	                     driver.findElement(By.xpath("//a[text()='Confirm']")).click();
	                     Thread.sleep(2000);
	                     //click on confirmbox
	                     driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	                     //switch control 
	                     Alert confirm = driver.switchTo().alert();
	                     Thread.sleep(2000);
	                    // confirm.accept();
	                    // print the text
	                     String textofconfirmationmsg = confirm.getText();
	                     System.out.println(textofconfirmationmsg);
	                 
	                     confirm.dismiss();
	                     
	                     
	                   
				}
}
