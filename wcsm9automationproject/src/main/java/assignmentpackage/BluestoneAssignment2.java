package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneAssignment2 {
 public static void main(String[] args) {
	     WebDriver  driver  = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.bluestone.com/");
	     //handle the popup
	     driver.findElement(By.id("denyBtn")).click();
	     
	     
	     // switch control to the frame	  driver.switchTo().frame(chatbox);
	     WebElement chatbox = driver.findElement(By.id("chat-icon"));
	     driver.switchTo().frame(chatbox);
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
}
}
