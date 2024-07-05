package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecificationMethod;

public class HomePage extends ProjectSpecificationMethod {
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public SignupPage signup() {
		driver.findElement(By.xpath("//div[text()=\"Signup\"]")).click();
		return new SignupPage(driver);
		
	}
  public LoginPage login() {
	  driver.findElement(By.xpath("//div[text()=\"Login\"]")).click();
	  return new LoginPage(driver);
  }

  public HomePage onewayFrom() {
	  driver.findElement(By.xpath("//div[text()=\"From\"]")).sendKeys("Chennai");
	  return this;
  }

  public HomePage onewayTo() {
	  
	  driver.findElement(By.xpath("//input[@value=\"Select Destination\"]")).sendKeys("Delhi");
	  return this;
  }
  
  public HomePage date() {
	  driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu\"])[31]")).click();
  return this;
  }
 
  /*public HomePage date() throws InterruptedException {
	
	 // Thread.sleep(2000);
	 WebElement deparDate = driver.findElement(By.xpath("//div[text()='Departure Date']"));
	 WebDriverWait obj1 = new WebDriverWait(driver,Duration.ofSeconds(50));
		obj1.until(ExpectedConditions.elementToBeClickable(deparDate));
		Actions deparmouse = new Actions(driver);
		  deparmouse.click(deparDate).perform(); 
		  
		 // Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//div[text()='1'])[8]")); 
		//WebDriverWait obj = new WebDriverWait(driver,Duration.ofSeconds(20));
		//obj.until(ExpectedConditions.elementToBeClickable(ele));
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(100));
		
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
		Actions mouse = new Actions(driver);
		  mouse.click(ele).perform(); 
	 
	  return this;
  }   */



public HomePage adults() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep\"])[5]")).click();
	driver.findElement(By.xpath("//div[@data-testid=\"Adult-testID-plus-one-cta\"]")).click();
	return this;
}

public FlightsPage searchButton() {
	driver.findElement(By.xpath("//div[@data-testid=\"home-page-flight-cta\"]")).click();
	return new FlightsPage(driver);
}

//TWO WAYS TRIP
public HomePage roundTrip() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text() = \"round trip\"]")).click();
	return this;
}
public HomePage returnDate() {
	driver.findElement(By.xpath("(//div[text()='5'])[2]")).click();
	return this;
}
public HomePage checkin() {
	String actualText = driver.findElement(By.xpath("//div[text()='check-in']")).getText();
	System.out.println(actualText);
	if(actualText.equalsIgnoreCase("Check-In")) {
		System.out.println("Check in menu available in Homepage");
	} else {
		System.out.println("Check in menu not available in Homepage");
	}
return this;
}

public HomePage flightStatus() {
	String actualText = driver.findElement(By.xpath("//div[text()='flight status']")).getText();
	System.out.println(actualText);
	if(actualText.equalsIgnoreCase("Flight Status")) {
		System.out.println("Flight Status menu available in Homepage");
	} else {
		System.out.println("Flight Status menu not available in Homepage");
	}
return this;
}
public HomePage manageBooking() {
	String actualText = driver.findElement(By.xpath("//div[text()='manage booking']")).getText();
	System.out.println(actualText);
	if(actualText.equalsIgnoreCase("Manage Booking")) {
		System.out.println("Manage Booking menu available in Homepage");
	} else {
		System.out.println("Manage Booking menu not available in Homepage");
	}
return this;
}
}


