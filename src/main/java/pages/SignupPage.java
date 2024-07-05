package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecificationMethod;

public class SignupPage extends ProjectSpecificationMethod {
	
	public SignupPage(WebDriver driver) {
		this.driver=driver;
	}

	//Switch to windows
	
	public SignupPage switchWindow() {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> lstWindow = new ArrayList<>(windowHandles);
		driver.switchTo().window(lstWindow.get(1));
		return this;
	}
	
    public SignupPage title() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//select[@class=\"form-control form-select \"] ")).click();
    	driver.findElement(By.xpath("//option[text()=\"Mrs\"] ")).click();
    	return this;
    }

    
    public SignupPage firstName() {
    	driver.findElement(By.xpath("//input[@id=\"first_name\"]")).sendKeys("Kartika");
    	return this;
    }

    public SignupPage lastName() {
    	driver.findElement(By.xpath("//input[@id=\"last_name\"]")).sendKeys("Hari");
    	return this;
    }

    public SignupPage country() throws InterruptedException {
    	WebElement dropdown = driver.findElement(By.xpath("//select[@class=\"form-control form-select\"]"));
    	Select select = new Select(dropdown);
    	select.selectByVisibleText("India ");
    	return this;
    }

    public SignupPage dateOfBirth() {
        driver.findElement(By.xpath("//input[@id=\"dobDate\"]")).click();
        driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]")).click();
    	driver.findElement(By.xpath("//option[@value=\"11\"]")).click();
    	driver.findElement(By.xpath("//select[@class=\"react-datepicker__year-select\"]")).click();
    	driver.findElement(By.xpath("//option[@value=\"1994\"]")).click();
    	driver.findElement(By.xpath("//div[@aria-label=\"Choose Thursday, November 26th, 1994\"]")).click();
    	return this;
    }
    
    public SignupPage mobileNum() {
    	driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("8896365592");
    	return this;
    	
    }

    public SignupPage email() {
    	driver.findElement(By.xpath("//input[@id=\"email_id\"]")).sendKeys("kartika261194@gmail.com");
    	return this;
    }

    public SignupPage password() {
    	driver.findElement(By.xpath("id=\"new-password\"")).sendKeys("kartika@123");
    	return this;
    }

    public SignupPage confirmPassword() {
    	driver.findElement(By.xpath("//input[@id=\"c-password\"]")).sendKeys("kartika@123");
    	return this;
    }

    public SignupPage checkBox() {
    	driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
    	return this;
    }
    
    public SignupPage submitButton() {
    	 WebElement submitbutton = driver.findElement(By.xpath("//button[@type=\"button\"]"));
    	 Actions mouse = new Actions(driver);
    	 mouse.moveToElement(submitbutton).perform();
    	return this;
    }




}
