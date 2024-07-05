package test;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.HomePage;

public class TC003_OneWayTrip extends ProjectSpecificationMethod {
@Test
	public void OneWayTrip() throws InterruptedException, IOException {
		// TODO Auto-generated method stub

	HomePage obj = new HomePage(driver);
	obj.onewayFrom().onewayTo().date().adults().searchButton().confirmBooking()
	.contactDetail().passengerInformation1().passengerInformation2()
	.continuFlight().continuTripSummary().skip().cardInfo();
	
	
	
	
	
	
	
	}

}
