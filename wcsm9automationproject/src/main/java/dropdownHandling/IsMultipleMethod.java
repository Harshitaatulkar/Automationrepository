package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {
	                         public static void main(String[] args) {
						WebDriver	driver	= new ChromeDriver();
						driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
						driver.get("https://demoapps.qspiders.com/");
						driver.findElement(By.xpath("//section[text()='Dropdown']"));
						//single select dropdown
					    WebElement dropdown1 = driver.findElement(By.xpath("//label[text()='Phone Number']/following-sibling::section/select"));
                                 
					    Select sel = new Select(dropdown1);
                        boolean status = sel.isMultiple();
                        System.out.println(status);
					    // multiselect dropdown
                        
                        
                        
                        
	                         }

}
