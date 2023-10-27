package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirVisatara {
	 public static void main(String[] args) throws InterruptedException {
	        	 ChromeOptions Co = new ChromeOptions();
	        	 Co.addArguments("--disable-notification");
	        	 WebDriver driver =  new ChromeDriver(Co);
	        	 driver.manage().window().maximize();
	        	 driver.get("https://www.airvistara.com/in/en");
	        	 driver.findElement(By.id("cookieModalCloseBtn")).click();
	        	 Thread.sleep(2000);
	        	 driver.findElement(By.name("flightSearchFrom")).sendKeys("PNQ");
	        	 Thread.sleep(2000);
	        	 driver.findElement(By.name("flightSearchTo")).sendKeys("BOM");
	        	 Thread.sleep(2000);
	        	 driver.findElement(By.id("departCalendar")).click();
	        	 Thread.sleep(2000);
	        	 driver.findElement(By.cssSelector("a[data-date='28']")).click();
	        	 Thread.sleep(2000);
	        	 driver.findElement(By.cssSelector("a[data-date='29']")).click();
	        	 Thread.sleep(2000);
	        	 //driver.findElement(By.cssSelector("button[value='economy']")).click();
	        	 driver.findElement(By.cssSelector("input[name='passengers']")).click();
	        	 
	        	 Thread.sleep(2000);
	        	 driver.findElement(By.cssSelector("button[value='business']")).click();
	        	 driver.findElement(By.cssSelector("button[class='col-xs-12 done_btn aubergine-button-dark passengerModalBtn']")).click();
	        	 Thread.sleep(2000);
	        	 driver.findElement(By.cssSelector("button[id='book-flight-widget']")).click();
	        	 
	        	
	        	 
			
			}

}
