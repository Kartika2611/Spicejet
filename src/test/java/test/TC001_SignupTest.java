package test;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.HomePage;

public class TC001_SignupTest extends ProjectSpecificationMethod {
	
@Test()
	public void signup() throws InterruptedException, IOException  {
		// TODO Auto-generated method stub

	HomePage obj = new HomePage(driver);
	
	obj.signup().switchWindow().title().firstName().lastName().country()
	.dateOfBirth().mobileNum().email().password().confirmPassword()
	.checkBox().submitButton();
	
	
	
	
	
	
	
	
	
	
	
	}

}
