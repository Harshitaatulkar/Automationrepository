package pageobjectmodelpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
       //identify all module of module present in homepage
	     @FindBy(xpath ="//div[text()='Time-Track']/following-sibling::div/img")private WebElement TimeTrack_Module;
	     @FindBy(xpath ="//div[text()='Tasks']/following-sibling::img") private WebElement Task_Module ;
	     @FindBy(xpath ="//div[text()='Reports']/following-sibling::img") private WebElement Reports_Module ;
	     @FindBy(xpath ="//div[text()='Users']/following-sibling::img") private WebElement Users_Module;
	     @FindBy(xpath ="//div[text()='Work Schedule']/following-sibling::img") private WebElement Work_Schedule_Module;
	     @FindBy(xpath="//div[text()='Settings']/following-sibling::img") private WebElement Settings_Module;
	     @FindBy(partialLinkText = "Logout") private WebElement Logout_Link;
	     //initialization
	     public HomePage(WebDriver driver)
	     {
	    	 PageFactory.initElements(driver, this);
	     }
	     //utilization
		public WebElement getTimeTrack_Module() {
			return TimeTrack_Module;
		}
		public WebElement getTask_Module() {
			return Task_Module;
		}
		public WebElement getReports_Module() {
			return Reports_Module;
		}
		public WebElement getUsers_Module() {
			return Users_Module;
		}
		public WebElement getWork_Schedule_Module() {
			return Work_Schedule_Module;
		}
		public WebElement getSettings_Module() {
			return Settings_Module;
		}
		public WebElement getLogout_Link() {
			return Logout_Link;
		}
	     //opertional methods
		
		public void click_on_Time_Track_Module()
		{
			TimeTrack_Module.click();
		}
		public void click_on_Tasks_Module()
		{
			Task_Module.click();
		}
		public void click_on_Reports_Module()
		{
			Reports_Module.click();
		}
		public void click_on_Users_Module()
		{
			Work_Schedule_Module.click();
		}
		public void click_on_Setting_Module()
		{
			Settings_Module.click();
		}
		public void click_on_Logout_Module()
		{
			Logout_Link.click();
		}
	}
