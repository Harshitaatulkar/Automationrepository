package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {
	   public static void main(String[] args) {
		            WebDriver  driver  = new ChromeDriver();
		            driver.manage().window().maximize();
				    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				    driver.get("http://demoapps.qspiders.com/");
				    WebElement loginTB = driver.findElement(By.xpath("//a[@class='bg-orange-500 hover:bg-orange-700 text-white py-2 px-4 rounded']"));
				     boolean login = loginTB.isDisplayed();
				     System.out.println(login);
				     
				    
	}

}
