package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.ProjectSpecificationMethod;

public class PaymentDetail extends ProjectSpecificationMethod{
public PaymentDetail(WebDriver driver) {
	this.driver = driver;
}
public PaymentDetail cardInfo() {
	/*driver.findElement(By.xpath("//div[text() =\"Credit/Debit Card\"]")).click();
	
	
	WebElement childFrame =
	driver.findElement(By.xpath("//iframe[@class='card_number_iframe']"));
	driver.switchTo().frame(childFrame);
    driver.findElement(By.xpath("//input[@id='card_number']"))
     .sendKeys("5974 5842 3697 1236 558");
	driver.findElement(By.xpath("//input[@id=\"name_on_card\"]"))
	.sendKeys("Divya");
	driver.findElement(By.xpath("//input[@id=\"card_exp_month\"]"))
	.sendKeys("10");
	driver.findElement(By.xpath("//input[@id=\"card_exp_year\"]"))
	.sendKeys("2025");
	driver.findElement(By.xpath("//input[@id=\"security_code\"]"))
	.sendKeys("123");
	driver.findElement(By.xpath("//div[@data-testid=\"common-proceed-to-pay\"]"))
    .click();*/

driver.findElement(By.xpath("//div[text()=\"UPI\"]")).click();
driver.findElement(By.xpath("//div[@data-testid=\"select-upiOptions-1\"]")).click();
driver.findElement(By.xpath("//input[@class=\"css-1cwyjr8 r-homxoj r-poiln3\"]")).sendKeys("kartika");
driver.findElement(By.xpath("//div[@data-testid=\"common-proceed-to-pay\"]")).click();

String actualError = driver.findElement(By.xpath("//div[text()=\"Failed to verify VPA.\"]")).getText();
System.out.println(actualError);
if(actualError.equalsIgnoreCase("Failed to verify VPA.")) {
	System.out.println("Please enter a valid detail");
} else {
	System.out.println("Transaction success");
}
	
	return this;
}
}
