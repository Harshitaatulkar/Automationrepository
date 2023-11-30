package pageobjectmodelpackage;

import java.io.IOException;

public class Create_Customer_Project_TestCase extends BaseTest implements IautoConstant{
       public static void main(String[] args) throws IOException, InterruptedException {
    	 //to open browser and close browser
		 BaseTest bt = new BaseTest();
		 bt.setUp();
		 //to access the methods of flib
	     Flib flib = new Flib();
		 LoginPage lp = new LoginPage(driver);
		 lp.validLogin(flib.readDataFromPropeerty(PROP_PATH, "username"), flib.readDataFromPropeerty(PROP_PATH, "password"));
		 Thread.sleep(2000);
		 HomePage hp = new HomePage(driver);
		 hp.click_on_Tasks_Module();
         TasksPage tp = new TasksPage(driver);		
         tp.createcustomer_createproject_method(flib.readExcelData(EXCEL_PATH, SHEET_CUST_PRO_DETAILS, 1, 0), flib.readExcelData(EXCEL_PATH,SHEET_CUST_PRO_DETAILS , 1, 1));
		 Thread.sleep(2000);
         bt.tearDown();
	}
}
