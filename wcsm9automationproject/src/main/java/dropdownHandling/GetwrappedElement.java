package dropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetwrappedElement {

	  public static void main(String[] args) throws InterruptedException {
		    WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("file:///C:/Users/Hp/Desktop/html/singleselectdropdown.html");
			WebElement menuDropdown = driver.findElement(By.id("iddd"));
			Select sel = new Select(menuDropdown);
		    WebElement allops = sel.getWrappedElement();
		    System.out.println(allops.getText());

		   //get all the options from dropDown By using getOptions
			 List<WebElement> options = sel.getOptions();
		   // select the option without using selection method
			 for(WebElement opt:options)
				{
					Thread.sleep(2000);
				   if(opt.getText().equals("vadapav"))
				   {
					   opt.click();
					   break;
				   }
			
	            }
	  }
	  }
