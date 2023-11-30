package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectionMethod {
              public static void main(String[] args) {
		    WebDriver driver =new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    driver.get("http://demoapps.qspiders.com/");
		    //click on dropdown
		    driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		  //identify phone dropdown
		    WebElement dropdown1 = driver.findElement(By.xpath("//select[contains(@class,'transition-all duration-150 w-5/1')]"));
		     Select sel = new Select(dropdown1);
		     sel.selectByIndex(2);
		     sel.deselectByIndex(2);
		     //we can only deselect options from multiselect only
		     driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		   WebElement dropdown2 = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		   Select sel2 = new Select(dropdown2);
		   for(int i=0;i<=3;i++)
		   {
			   sel2.selectByIndex(i);
			   
		   }
			  // sel2.deselectByIndex(i);
			   
			   
			   
			}
}
