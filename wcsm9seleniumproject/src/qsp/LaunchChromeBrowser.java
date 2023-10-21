package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	public static void main(String[] args) throws InterruptedException {
		// to launch a chrome browser we need to create obj of chromedriver();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	System.out.println("chrome is open!!!");
	//to stop the execution for 2 sec
	Thread.sleep(2000);
	driver.close();
	System.out.println("chrome is closed!!!");
	
	}
	
	
	
}
