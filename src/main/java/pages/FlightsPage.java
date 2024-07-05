package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethod;

public class FlightsPage extends ProjectSpecificationMethod{
public FlightsPage(WebDriver driver) {
	this.driver = driver;
}

public PassengerDetail confirmBooking() {
	driver.findElement(By.xpath("//div[@data-testid=\"continue-search-page-cta\"]")).click();
	return new PassengerDetail(driver);
}






}
