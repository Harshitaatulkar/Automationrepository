package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
                        public static void main(String[] args) {
                        	WebDriver  driver  = new ChromeDriver();
        		            driver.manage().window().maximize();
        				    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        				    driver.get("http://demoapps.qspiders.com/");
        				    //click on checkbox element
        				    driver.findElement(By.xpath("//section[text()='Check Box']")).click();
        				   //  click on email checkbox
        				 WebElement emailcb = driver.findElement(By.xpath("//input[@name='Domain']"));
        				                  boolean Cb = emailcb.isSelected();
        				                  System.out.println(Cb);
        				  //click on the checkbox
        				                  emailcb.click();
        				                  boolean Cb1 = emailcb.isSelected();
        				                  System.out.println(Cb1);
        				                  
        				    
							
						}
}
