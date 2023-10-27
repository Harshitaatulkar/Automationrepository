package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		          WebDriver driver = new ChromeDriver();
		          driver.manage().window().maximize();
		          driver.get("https://www.instagram.com/accounts/login/?next=https%3A%2F%2Fwww.instagram.com%2Faccounts%2Fonetap%2F%3Fnext%3D%252F%26__coig_login%3D1");
		          driver.findElement(By.name("username")).sendKeys("harshumona@gmail.com");
		          Thread.sleep(2000);
		          driver.findElement(By.name("password")).sendKeys("qwerty");
		          
	}

}
