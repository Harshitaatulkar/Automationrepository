package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		 String ParentHandle = driver.getWindowHandle();
		 System.out.println(ParentHandle);
		 driver.close();
	}

}
