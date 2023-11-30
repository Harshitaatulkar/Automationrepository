package popupHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HiddenDivisionPopup {
	public static void main(String[] args) {
	      	WebDriver driver = new EdgeDriver();
	      	driver.manage().window().maximize();
	      	driver.get("https://www.flipkart.com/");
	     WebElement hiddenDivisionpopup = driver.findElement(By.xpath("//span[text()='✕']"));
	     hiddenDivisionpopup.click();
	     
	      	
	}

}
