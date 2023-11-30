package pageobjectmodelpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {
	
  //store all the webElements of Task Page
	@FindBy(partialLinkText="Projects & Customers") WebElement Project_Customer_Module;
	@FindBy(xpath = "//input[@value='Create New Customer']") WebElement Create_New_Customer_Button ;
	@FindBy(xpath ="//input[@value='Create New Project']") WebElement Create_New_Project ;
	@FindBy(xpath="//input[@name='name']") WebElement CustomerName_TextBox;
	@FindBy(xpath="//input[@name='createCustomerSubmit']") WebElement Create_Customer_Submit_button ;
	@FindBy(xpath="//input[@name='name']") WebElement ProjectName_Textbox;
	@FindBy(xpath="//input[@name='createProjectSubmit']") WebElement Create_Project_Submit_Button_;
   // initialization
	public TasksPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//utilization
	public WebElement getProject_Customer_Module() {
		return Project_Customer_Module;
	}
	public WebElement getCreate_New_Customer_Button() {
		return Create_New_Customer_Button;
	}
	public WebElement getCreate_New_Project() {
		return Create_New_Project;
	}
	public WebElement getCustomerName_TextBox() {
		return CustomerName_TextBox;
	}
	public WebElement getCreate_Customer_Submit_button() {
		return Create_Customer_Submit_button;
	}
	public WebElement getProjectName_Textbox() {
		return ProjectName_Textbox;
	}
	public WebElement getCreate_Project_Submit_Button_() {
		return Create_Project_Submit_Button_;
	}
	//operational method
	public void createcustomer_createproject_method(String cust_name,String pro_name) throws InterruptedException 
	{
		Project_Customer_Module.click();
		Thread.sleep(2000);
		Create_New_Customer_Button.click();
		Thread.sleep(2000);
		CustomerName_TextBox.sendKeys(cust_name);
		Thread.sleep(2000);
		Create_Customer_Submit_button.click();
		Thread.sleep(2000);
		Create_New_Project.click();
		Thread.sleep(2000);
		ProjectName_Textbox.sendKeys(pro_name);
		Thread.sleep(2000);
		Create_Project_Submit_Button_.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
