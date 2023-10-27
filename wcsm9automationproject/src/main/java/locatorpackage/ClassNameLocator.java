package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
	            public static void main(String[] args) {
					ChromeDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://www.google.com/");
					driver.switchTo().activeElement().sendKeys("Joey Tribbiani",Keys.ENTER);
					driver.findElement(By.className("srp EIlDfe")).click();
					
				}

}
