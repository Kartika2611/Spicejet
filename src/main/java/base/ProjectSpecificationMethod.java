package base;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.Utility;

public class ProjectSpecificationMethod extends Utility  {

	@Parameters({"browser","url"})
	
@BeforeMethod

public void launchBrowserandURL() throws IOException  {
	
	browserLaunchandURL();	
}


@AfterMethod
public void close() {
	//driver.close();
}
@DataProvider(name ="ReadfromExcel")
public String[][] excelData() throws IOException {
	String[][] data = readExcel(excelFile);
	return data;
}

}
