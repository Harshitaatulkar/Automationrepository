package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLoginLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		            WebDriver driver = new ChromeDriver();
		            driver.manage().window().maximize();
		            driver.get("https://www.netflix.com/in/Login");
		            driver.findElement(By.id("id_userLoginId")).sendKeys("hari22atulkar@gmail.com");
		            Thread.sleep(2000);	
		            driver.findElement(By.id("id_password")).sendKeys("hari2212345");
		            

	}

}
