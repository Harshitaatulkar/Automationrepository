package popupHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MakeMyTripNotificationPopup {
	public static void main(String[] args) {
		   WebDriver driver   = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("https://www.makemytrip.com/");
		   driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		    WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
		           Select sel = new Select(from);
		           sel.selectByIndex(3);
		           
	}

}
