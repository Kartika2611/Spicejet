package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethod;

public class LoginPage extends ProjectSpecificationMethod {
public LoginPage(WebDriver driver) {
	this.driver = driver;
}
//login with mobile number and password	
public LoginPage mobileNumber() {
	driver.findElement(By.xpath("//input[@data-testid=\"user-mobileno-input-box\"]"))
	.sendKeys("7200965967");
	return this;
}
public LoginPage password(String password) {
	driver.findElement(By.xpath("//input[@data-testid=\"password-input-box-cta\"]"))
	.sendKeys(password);
	return this;
}
public HomePage loginButton() {
	driver.findElement(By.xpath("//div[@data-testid=\"login-cta\"]")).click();
	return new HomePage(driver);
}

//Login with email and password

public LoginPage email() {
	driver.findElement(By.xpath("//div[text()=\"Email\"]")).click();
	return this;
}

public LoginPage mailid(String email) {
	driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys(email);
	return this;
}


}
