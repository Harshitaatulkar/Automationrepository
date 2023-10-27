package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTCXpathLocator {
	        public static void main(String[] args) throws InterruptedException {
	        	      ChromeOptions co = new ChromeOptions();
	        	      co.addArguments("--disable-notification");
				      WebDriver driver = new ChromeDriver();
				      driver.manage().window().maximize();
				      Thread.sleep(2000);
				      driver.get("https://www.irctc.co.in/nget/train-search");
				      driver.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("MMCT");
				      Thread.sleep(2000);
				      driver.findElement(By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("NGP");
				      Thread.sleep(2000);
				      driver.findElement(By.xpath("//i[@class='fa fa-calendar']")).click();
				     // Thread.sleep(2000);
				      driver.findElement(By.xpath("//a[@class='ui-state-default ng-tns-c58-10 ui-state-active ng-star-inserted']")).click();
				      Thread.sleep(2000);
				     // driver.findElement(By.xpath("//div[@class='ng-tns-c65-11 ui-dropdown ui-widget ui-state-default ui-corner-all ui-dropdown-open']")).click();
				      Thread.sleep(2000);
				      driver.findElement(By.xpath("//li[@aria-label='AC First Class (1A) ']")).click();
				      driver.findElement(By.xpath("//button[@class='search_btn train_Search']")).click();
				      
				      
				      
				      
			}

}
