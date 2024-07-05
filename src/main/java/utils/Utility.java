package utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Utility {
	
	public static WebDriver driver;
	public String excelFile;
	
	public void browserLaunchandURL() throws IOException  {

		//to read the prop file
		FileReader reader = new FileReader("C:\\Users\\kartika\\eclipse-workspace\\capstone_SpiceJet\\src\\main\\resources\\Testdata.properties");
		//read the properties
		Properties prop = new Properties();
		prop.load(reader);
		
		if(prop.getProperty("browser").equals("Chrome")) {
			ChromeOptions obj = new ChromeOptions();
			obj.addArguments("--disable-notifications");
			driver = new ChromeDriver(obj);	
		}else if (prop.getProperty("browser").equals("Edge-headless")){
			EdgeOptions obj =new EdgeOptions();
			obj.addArguments("--headless");
			driver = new EdgeDriver(obj);
		}
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	
	public String takeScreenshot(String screenshotName) throws IOException {
		
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		String screenshotTitle = time.toString().replace(":", "").replace(" ","");
		
		String path ="C:\\Users\\kartika\\eclipse-workspace\\capstone_SpiceJet\\screenshot\\"+screenshotTitle+".png";
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(source, dest);
		return path;
	
	}
	
	public void close() {
		//driver.close();
	}
	
	public String[][] readExcel(String excelFile) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\kartika\\eclipse-workspace\\capstone_SpiceJet\\data\\"+excelFile+".xlsx");
		XSSFSheet sheet1 = book.getSheetAt(0);
		
		
		int rowCount = sheet1.getLastRowNum();
		int columnCount = sheet1.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowCount][columnCount] ;
		
		//Get into row
		for(int i =1;i<=rowCount;i++) {
			XSSFRow row = sheet1.getRow(i);
		
		//Get into column
		for(int j =0;j<columnCount;j++) {
			XSSFCell cell = row.getCell(j);
		
		//read the data from excel
			data[i-1][j] = cell.getStringCellValue();
		
		}
		}
		book.close();
		return data;
	}


}
