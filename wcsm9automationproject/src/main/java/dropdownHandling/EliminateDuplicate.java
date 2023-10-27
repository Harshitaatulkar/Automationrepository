package dropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicate {
	        public static void main(String[] args) {
	        	WebDriver	driver	= new ChromeDriver();
			    driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			    driver.get("file:///C:/Users/Hp/Desktop/html/singleselectdropdown.html");
			     WebElement menuDropdown = driver.findElement(By.id("iddd"));
			           Select sel = new Select(menuDropdown);
			           List<WebElement> allops = sel.getOptions();
			            
				
			}

}
