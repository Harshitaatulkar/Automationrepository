package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeValidLogin extends BaseTest implements IautoConstant {
	public static void main(String[] args) throws IOException, InterruptedException {
		//launch the browser
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		
		//to read data from property file
     	Flib1 flib = new Flib1();
		Thread.sleep(2000);
		 driver.findElement(By.name("username")).sendKeys(flib.readDataFromPropeerty(PROP_PATH,"username"));
		 Thread.sleep(2000);
		 driver.findElement(By.name("pwd")).sendKeys(flib.readDataFromPropeerty(PROP_PATH, "password"));
		 Thread.sleep(2000);
		 driver.findElement(By.id("loginButton")).click();
		 
		 bt.closeBrowser();
	}

}
