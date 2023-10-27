package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentMethod {

	public static void main(String[] args) throws InterruptedException {
		
  WebDriver  driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("http://omayo.blogspot.com/");
  String Urlofloginpage = driver.getCurrentUrl();
  System.out.println(Urlofloginpage);
  Thread.sleep(2000);
  driver.quit();
  
  
  
  
	}

}
