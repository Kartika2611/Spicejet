package test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.HomePage;

public class TC002_LoginTest extends ProjectSpecificationMethod {
@BeforeTest
	public void setup() {
		excelFile="TC002_LoginTest";
	}
	
	
	@Test(dataProvider ="ReadfromExcel")
	public void loginTest(String email, String password) throws IOException  {
		// TODO Auto-generated method stub

	HomePage obj = new HomePage(driver);

	//obj.login().mobileNumber().password().loginButton().takeScreenshot();    // Object for Login with mobile number
	obj.login().email().mailid(email).password(password).loginButton();  // Object for login with email
    
	
	}

}
