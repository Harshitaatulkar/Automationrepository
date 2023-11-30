package pageobjectmodelpackage;

import java.io.IOException;

public class ActTimeInvalidLogin extends BaseTest implements IautoConstant  {
	public static void main(String[] args) throws IOException {
		//for open browser and close browser
		BaseTest bt = new BaseTest();
		bt.setUp();
		//get the webelemnt from webpage
	    LoginPage lp = new LoginPage(driver);
	    //read the data from excel
	      Flib flib = new Flib();
	    //read rowcount
	       int rc = flib.rowCount(EXCEL_PATH, SHEET_NAME_INVALID);
	    // read multiple data using loop
	       for(int i=1;i<=rc; i++)
	       {
	    	   //get the method to perform invalid login from loginpage pom class
	    	   lp.invalidLogin(flib.readExcelData(EXCEL_PATH, SHEET_NAME_INVALID, i, 0), flib.readExcelData(EXCEL_PATH, SHEET_NAME_INVALID, i, 1));
	       }
	     bt.tearDown();  
	    
		
	}
	
	
	
	

}
