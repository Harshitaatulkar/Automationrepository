package assignmentpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAssignment {
	    public static void main(String[] args) throws InterruptedException {
	     WebDriver  driver =new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.get("https://jqueryui.com/droppable/");
	     // draggable and droppable are designed under frame
	     // handle a frame by switch control 
	     //driver.switchTo().frame(0); //by using index
	     WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	     driver.switchTo().frame(frameElement);
	     Thread.sleep(2000);
	     WebElement src = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
	     Thread.sleep(2000);
	     WebElement trgt = driver.findElement(By.xpath("//p[text()='Drop here']"));
	     Actions act = new Actions(driver);
	     act.dragAndDrop(src, trgt).perform();
	     
		
	}

}
