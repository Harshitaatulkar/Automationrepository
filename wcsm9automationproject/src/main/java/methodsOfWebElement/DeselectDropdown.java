package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectDropdown {
                   public static void main(String[] args) throws InterruptedException {
					   WebDriver  driver = new ChromeDriver();
					   driver.manage().window().maximize();
					   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					   //single select dropdown
					   driver.get("file:///C:/Users/Hp/Desktop/html/singleselectdropdown.html");
					    WebElement dropdown1 = driver.findElement(By.id("iddd"));
					    Select sel = new Select(dropdown1);
					    sel.selectByIndex(3);
					   // sel.deselectByIndex(3); 
					    // select multiple option from single select dropdown
					    Thread.sleep(2000);
					 //  for(int i=0;i<8;i++)	
					 //  {
					 //	   sel.selectByIndex(i);
					 //  }
					   //it will not work for single select it gives unsupportedoperationexception from java package
					   // select multiple option from multiselect dropdown
					  driver.navigate().to("file:///C:/Users/Hp/Desktop/html/multiselectdropdown.html");
					  WebElement dropdown2 = driver.findElement(By.id("idd"));
					  Select sel2 = new Select(dropdown2);
					  Thread.sleep(2000);
					  for(int i=0;i<6;i++)
					  {
						 sel2.selectByIndex(i);
					  }
					  //deselect all multiple option from multiselect dropdown
					  for(int i=0;i<6;i++)
					  {
						  sel2.deselectByIndex(i);
					  }
				}
}
