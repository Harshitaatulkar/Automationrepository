package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
       public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	//maximize
	driver.manage().window().maximize();
	//launch web app
	driver.get("https://www.flipkart.com/");
	// stop execution
	Thread.sleep(2000);
	//close
	driver.close();
	}
}
