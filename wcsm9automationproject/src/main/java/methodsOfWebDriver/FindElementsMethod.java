package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
	                   public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			// control the transfer to active element
			driver.switchTo().activeElement().sendKeys("bike");
			Thread.sleep(2000);
			// identify all the suggestion of bike 
		WebElement bikeOption = driver.findElement(By.xpath("//div[@class='wM6W7d']"));
	//	for(WebElement op: bikeOption )
	//	{
	//		 String options = op.getText();
	//		 Thread.sleep(2000);
	//		 System.out.println(options);
	//		
	//	}
		
	//	for(int i=0;i<bikeOption.size();i++)
	//	{
	//		String options = op.
	//		
	//	}

         
			
			
			
			
					}

	                   
}
