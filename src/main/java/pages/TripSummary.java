package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.ProjectSpecificationMethod;

public class TripSummary extends ProjectSpecificationMethod {
public TripSummary(WebDriver driver) {
this.driver=driver;
}
/*public TripSummary seatSelection() {
	driver.findElement(By.xpath("//div[@data-testid=\"bookingFlow-seats-add-cta\"]")).click();
	//driver.findElement(By.xpath("(//div[text() =\"Normal Seat\"])[1]")).click();
	driver.findElement(By.xpath("(//div[text() =\"1B\"])[1]")).click();
	//driver.findElement(By.xpath("(//div[@class=\"css-76zvg2 r-poiln3 r-ubezar r-16dba41\"])[2]")).click();
	driver.findElement(By.xpath("(//div[text() =\"1C\"])[1]")).click();
    driver.findElement(By.xpath("//div[@class=\"css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73\"]")).click();
return this;
}*/

public TripSummary continuTripSummary() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@data-testid='add-ons-continue-footer-button'])[3]")).click();
	return this;
}
public PaymentDetail skip() {
	driver.findElement(By.xpath("//span[text() =\"Skip this to skip comfort.\"]")).click();
	return new PaymentDetail(driver);
}

}

