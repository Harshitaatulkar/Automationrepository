package dropdownHandling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicate {
	        public static void main(String[] args) throws InterruptedException {
	        	WebDriver	driver	= new ChromeDriver();
			    driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			    driver.get("file:///C:/Users/Hp/Desktop/html/singleselectdropdown.html");
			     WebElement menuDropdown = driver.findElement(By.id("iddd"));
			           Select sel = new Select(menuDropdown);
			           List<WebElement> allops = sel.getOptions();
			           //to eliminate duplicate
			           HashSet<String> hs = new HashSet<String>();
			            //read all the list using loop and eliminate duplicate
			           for(int i=0;i<allops.size();i++)
			           {
			        	 WebElement op = allops.get(i);
						   
						   //get the text of WebElement
						   String dropDownOption = op.getText();
						   
						   System.out.println(dropDownOption);
						   Thread.sleep(2000);
						   hs.add(dropDownOption);
			           }
			          // read the options from HashSet by using for each loop
					  for(String opt:hs)
					  {
						  Thread.sleep(2000); 
						  System.out.println(opt);
					  }
				
			}

}
