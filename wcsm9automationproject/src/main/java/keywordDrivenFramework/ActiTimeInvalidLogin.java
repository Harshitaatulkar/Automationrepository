package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeInvalidLogin extends BaseTest implements IautoConstant {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		// to launch the browser and browser
		BaseTest bt = new BaseTest();
	    bt.openBrowser();
		//to read the data from excel file
	    Flib1 flib1 = new Flib1();
	    int rc = flib1.rowCount("./src/main/resources/ActiTimeTestData.xlsx","invalidcreds");
	   for(int i=1;i<=rc;i++) 
	   {
	   String invalidUsn = flib1.readDatafromExcel(EXCEL_PATH, SHEET_NAME_INVALID, i, 0);
	   String invalidPass = flib1.readDatafromExcel(EXCEL_PATH, SHEET_NAME_INVALID, i, 1);
	
	    WebElement usnTB = driver.findElement(By.name("username"));
	    usnTB.sendKeys(invalidUsn);
	    WebElement passTB = driver.findElement(By.name("pwd"));
	    passTB.sendKeys(invalidPass);
	    driver.findElement(By.id("loginButton")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("username")).clear();
	   }
	   bt.closeBrowser();
	}

}
