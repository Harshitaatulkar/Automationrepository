package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPagrSourceMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		String LoginPageSourceCode = driver.getPageSource();
		System.out.println(LoginPageSourceCode);
		Thread.sleep(2000);
		driver.quit();

	}

}