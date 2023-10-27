package methodsOfActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WithoutMouseActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver	= new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    //launch the bluestone
	    driver.get("https://www.bluestone.com/");
	    //handle the popup
	    driver.findElement(By.id("denyBtn")).click();
	    //click on coins
	    WebElement coinsTarget = driver.findElement(By.xpath("//a[@title='Coins']"));
	    Thread.sleep(2000);
	         Actions act = new Actions(driver);
	         act.moveToElement(coinsTarget).build().perform();
	         Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
	    if(driver.findElement(By.xpath("//h1[@class='page-title title-14']")).isDisplayed())
	    {
	    	System.out.println("text is displayed");
	    }
	    else
	    	
	    	System.out.println("text is not displayed");

	}

}
