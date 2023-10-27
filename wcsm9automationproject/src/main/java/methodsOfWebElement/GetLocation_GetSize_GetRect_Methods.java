package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_GetSize_GetRect_Methods {
	                     public static void main(String[] args) {
				          WebDriver driver  = new ChromeDriver();
						  driver.manage().window().maximize();
						  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
						  driver.get("http://demoapps.qspiders.com/");
						  //get the location of email textbox
						  WebElement emailTextbox = driver.findElement(By.cssSelector("input[name='name']"));
						  Point loc = emailTextbox.getLocation();
						     int xaxis = loc.getX();
						     int yaxis = loc.getY();
						  System.out.println("location of email textbox :"+xaxis+"  :  "+yaxis);
						  //get the location od get size
						   Dimension size = emailTextbox.getSize();
						      int height = size.getHeight();
						      int width = size.getWidth();
						   System.out.println("size of email textbox :"+height+"  :"+width);
						 // get the rect of usersname textbox
						                   
						             
							        
						}

}
