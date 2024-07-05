package test;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.HomePage;

public class TC004_TwoWayTrip extends ProjectSpecificationMethod {
@Test
	public void twoWayTrip() throws InterruptedException, IOException {
		// TODO Auto-generated method stub

HomePage obj = new HomePage(driver);
obj.roundTrip().onewayFrom().onewayTo().date().returnDate().searchButton().confirmBooking()
.contactDetail().passengerInformation1().continuFlight()
.continuTripSummary().skip().cardInfo();

	}

}
