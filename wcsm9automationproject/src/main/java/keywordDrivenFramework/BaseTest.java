package keywordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib1 {
	static WebDriver driver ;
	
	public void openBrowser() throws IOException
	{
		Flib1 flib = new Flib1(); //to read the data from property file
	    String browserValue = flib.readDataFromPropeerty("./src/main/resources/confi.properties","browser");
	    String url = flib.readDataFromPropeerty("./src/main/resources/confi.properties", "url");
	    if(browserValue.equalsIgnoreCase("chrome"))
	    {
	    	driver  = new ChromeDriver();
	    }
	    else if(browserValue.equalsIgnoreCase("firefox"))
	    {
	    	driver  = new FirefoxDriver();
	    }
	    else if(browserValue.equalsIgnoreCase("Edge"))
	    {
	    	driver = new EdgeDriver();
	    }
	    else
	    {
	    	System.out.println("browserValue is Inavlid!!!");
	    }
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get(url);
	 }
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
