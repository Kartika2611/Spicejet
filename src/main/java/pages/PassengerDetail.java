package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethod;

public class PassengerDetail extends ProjectSpecificationMethod{
public PassengerDetail(WebDriver driver) {
	this.driver=driver;
}
public PassengerDetail contactDetail() {
	driver.findElement(By.xpath("//div[@data-testid=\"title-contact-detail-card\"]")).click();
	driver.findElement(By.xpath("//div[text() = \"Mrs\"]")).click();
	driver.findElement(By.xpath("//input[@data-testid=\"first-inputbox-contact-details\"]"))
	.sendKeys("Divya");
	driver.findElement(By.xpath("//input[@data-testid=\"last-inputbox-contact-details\"]"))
	.sendKeys("Anburose");
	driver.findElement(By.xpath("//input[@data-testid=\"contact-number-input-box\"]"))
	.sendKeys("7200965967");
	driver.findElement(By.xpath("//input[@data-testid=\"emailAddress-inputbox-contact-details\"]"))
	.sendKeys("divyaganeshwathi@gmail.com");
	driver.findElement(By.xpath("//input[@data-testid=\"city-inputbox-contact-details\"]"))
	.sendKeys("Chennai");
	return this;
}

public PassengerDetail passengerInformation1() {
	driver.findElement(By.xpath("//div[text()=\"I am flying as the primary passenger\"]")).click();
	/*driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep\"])[4]"))
	.click();
	driver.findElement(By.xpath("//div[text()=\"Mrs\"]")).click();
	driver.findElement(By.xpath("//input[@data-testid=\"traveller-0-first-traveller-info-input-box\"]"))
	.sendKeys("Divya");
	driver.findElement(By.xpath("//input[@data-testid=\"traveller-0-last-traveller-info-input-box\"]"))
	.sendKeys("Anburose");
	driver.findElement(By.xpath("//input[@data-testid=\"sc-member-mobile-number-input-box\"]"))
	.sendKeys("7200965967");*/
	return this;
}

public PassengerDetail passengerInformation2() {
	driver.findElement(By.xpath("//div[text() = \"Passenger 2\"]")).click();
	driver.findElement(By.xpath("//input[@data-testid=\"traveller-1-first-traveller-info-input-box\"]"))
	.sendKeys("Anbu");
	driver.findElement(By.xpath("//input[@data-testid=\"traveller-1-last-traveller-info-input-box\"]"))
	.sendKeys("Rose");
	driver.findElement(By.xpath("//input[@data-testid=\"sc-member-mobile-number-input-box\"]"))
	.sendKeys("7200965967");
	return this;
}
public TripSummary continuFlight() {
	driver.findElement(By.xpath("//div[@data-testid=\"traveller-info-continue-cta\"]")).click();
	return new TripSummary(driver);
}
}
