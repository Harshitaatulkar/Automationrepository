package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//launch web app
		driver.get("http://omayo.blogspot.com/");
		// stop execution
		Thread.sleep(2000);
		Set<String> Parenthandle = driver.getWindowHandles();
		System.out.println("Address of parent browsser"+Parenthandle);
		driver.findElement(By.partialLinkText("Open a popup window")).click();
         Set<String> allHandles = driver.getWindowHandles();
		
		

	}

}
