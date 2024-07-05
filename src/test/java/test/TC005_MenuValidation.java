package test;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.HomePage;

public class TC005_MenuValidation extends ProjectSpecificationMethod {
@Test
	public void menuValidation() throws IOException {
		// TODO Auto-generated method stub
HomePage obj = new HomePage(driver);
obj.checkin().flightStatus().manageBooking();
	}

}
