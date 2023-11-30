package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class disabledWebElementonDemoQspiders {
	public static void main(String[] args) {
	      WebDriver driver =new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      driver.get("https://demoapps.qspiders.com/");
	      //click on disable mode
	      driver.findElement(By.xpath("//p[text()='Disabled Mode']")).click();
	      JavascriptExecutor jse = (JavascriptExecutor)driver;
	      jse.executeScript("document.getElementById('name').value='harshita'");
	      jse.executeScript("document.getElementById('email').value='hari22@gmail.com'");
	      jse.executeScript("document.getElementById('password').value='password@123'");
	      //jse.executeScript("arguments[0].click(),Register");
	      driver.findElement(By.xpath("//span[text()='Login']"));
	      jse.executeScript("arguments[0].click(),Login");
	      
	    WebElement disableRegisterButton = driver.findElement(By.xpath("//button[text()='Register']"));
	    if(disableRegisterButton.isDisplayed())
	    {
	    	jse.executeScript("arguments[0].click()",disableRegisterButton);
	    	System.out.println("Click");
	    }
	    else
	    {
	    	System.out.println("Not Click");
	    }
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	}

}
