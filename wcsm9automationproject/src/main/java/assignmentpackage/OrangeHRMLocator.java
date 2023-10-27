package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLocator {

	public static void main(String[] args) throws InterruptedException {
		           WebDriver driver = new ChromeDriver();
		           driver.manage().window().maximize();
		           driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		           Thread.sleep(2000);
		           driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("Admin");
		           driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("admin123");
		           driver.findElement(By.cssSelector("button[class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
		           driver.findElement(By.cssSelector("a[class=\"oxd-main-menu-item\"]"));
		           
	}
}
