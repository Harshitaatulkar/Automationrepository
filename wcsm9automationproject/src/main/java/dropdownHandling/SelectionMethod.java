package dropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/");
		//click on dropdown
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		//identify phone dropdown
	    WebElement dropdown1 = driver.findElement(By.xpath("//select[contains(@class,'transition-all duration-150 w-5/1')]"));
	     Select sel = new Select(dropdown1);
	     sel.selectByIndex(2);
	   //identify country dropdown
			WebElement dropDown2 = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		    Select sel2 = new Select(dropDown2);
		    Thread.sleep(2000);
		    sel2.selectByValue("India");
		    
		    //identify state dropdown
		    WebElement dropDown3 = driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"));
		    
		     Select sel3 = new Select(dropDown3);
		     Thread.sleep(2000);
		     sel3.selectByVisibleText("Maharashtra");
		     
		

		
		
	}

}
