package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoXpathLocator {
	       public static void main(String[] args) throws InterruptedException {
			     WebDriver  driver = new ChromeDriver();
			     driver.manage().window().maximize();
			     driver.get("http://omayo.blogspot.com/");
			     Thread.sleep(2000);
			     driver.findElement(By.xpath("//select[@id='multiselect1']")).click();
			     Thread.sleep(2000);
			     
			     driver.findElement(By.xpath("//textarea[@id='ta1']")).sendKeys("selenium");
			     Thread.sleep(2000);
			     driver.findElement(By.xpath("//input[@class='gsc-input']")).sendKeys("hello");
			     Thread.sleep(2000);
			     driver.findElement(By.xpath("//input[@class='gsc-search-button']")).click();
			     Thread.sleep(2000);
			     driver.findElement(By.xpath("//input[@id='radio1']")).click();
			     Thread.sleep(2000);
			     driver.findElement(By.xpath("//input[@id='alert1']")).click();
			     
			     
			     
		}

}
