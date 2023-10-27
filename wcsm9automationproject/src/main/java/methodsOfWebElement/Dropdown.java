package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
	                    public static void main(String[] args) {
						WebDriver driver = new ChromeDriver();
						driver.manage().window().maximize();
						driver.get("http://demoapps.qspiders.com/");
					    driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
					    
						}

}
