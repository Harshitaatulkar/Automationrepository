package pageobjectmodelpackage;

import java.io.IOException;

public class ActiTimeValidLogin extends BaseTest implements IautoConstant {
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		LoginPage lp = new LoginPage(driver);
		//read data from property file
		  Flib flib = new Flib();
		  lp.validLogin(flib.readDataFromPropeerty(PROP_PATH, "username"), flib.readDataFromPropeerty(PROP_PATH, "password"));
		  Thread.sleep(2000);
		  bt.tearDown();
	}

}
