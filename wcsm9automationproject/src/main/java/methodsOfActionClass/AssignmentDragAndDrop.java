package methodsOfActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentDragAndDrop {
	 public static void main(String[] args) throws InterruptedException {
		   WebDriver	driver	= new ChromeDriver();
					driver.manage().window().maximize();
				    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				    //open the demoguru99 app
				    driver.get("https://demo.guru99.com/test/drag_drop.html");
				    //click on drag and drop elements
				   WebElement src1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[1]"));
				   WebElement src2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
				   WebElement src3 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
				   WebElement src4 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
				   //store all the drop elements
				  WebElement target1 = driver.findElement(By.id("loan"));
				  WebElement target2 = driver.findElement(By.id("amt8"));
				  WebElement target3 = driver.findElement(By.id("amt7"));
				  WebElement target4 = driver.findElement(By.id("bank"));
				  Actions act = new Actions(driver);
				  act.dragAndDrop(src1, target1).perform();
				  Thread.sleep(2000);
				  act.dragAndDrop(src2, target2).perform();
				  Thread.sleep(2000);
				  act.dragAndDrop(src3, target3).perform();
				  Thread.sleep(2000);
				  act.dragAndDrop(src4, target4).perform();
				  
				  
	}

}
