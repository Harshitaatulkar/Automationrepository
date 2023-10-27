package dropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedoptions {
	                      public static void main(String[] args) throws InterruptedException {
	                    	    WebDriver	driver	= new ChromeDriver();
								driver.manage().window().maximize();
								driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
								driver.get("file:///C:/Users/Hp/Desktop/html/multiselectdropdown.html");
								//mutliselect dropdown
								      WebElement menuDropdown = driver.findElement(By.id("idd"));
								      Select sel = new Select(menuDropdown);
								      //select multiple option from menu dropdown
								      for(int i=0;i<4;i++)
								      {
								    	  Thread.sleep(2000);
								    	  sel.selectByIndex(i);
								      }
								      //read only the selected options from menu dropdown
								       List<WebElement> allopts = sel.getAllSelectedOptions();
								       for(int i= 0;i<allopts.size();i++)
								       {
								    	      String op = allopts.get(i).getText();
								    	       System.out.println(op);
								       }
								    	   
								      
								
								
								
								
								
						}

}
