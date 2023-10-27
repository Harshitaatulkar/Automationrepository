package dropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetoptionsMethod {
	                 public static void main(String[] args) throws InterruptedException {
	                	 WebDriver	driver	= new ChromeDriver();
							driver.manage().window().maximize();
							driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
							driver.get("https://demoapps.qspiders.com/");
							driver.findElement(By.xpath("//section[text()='Dropdown']"));
							//single select dropdown
						    WebElement phnoDropdown = driver.findElement(By.xpath("//label[text()='Phone Number']/following-sibling::section/select"));
	                        //get all the option present inside ph no dropdown
						      Select sel1 = new Select(phnoDropdown);
						      List<WebElement> allOps = sel1.getOptions();
						      //we read list by using for loop
						      for(int i=0;i<allOps.size();i++)
						      {
						    	     String opt = allOps.get(i).getText();
						    	     Thread.sleep(2000);
						    	     System.out.println(opt);
						      }
						      //we read list by using for each loop
						      
					}

}
