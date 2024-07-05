package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportSpiceJet {

	public static ExtentReports getReport() {
		// create physical report
	String path ="C:\\Users\\karika\\eclipse-workspace\\capstone_SpiceJet\\reports\\SpicejetReport.html";
	ExtentSparkReporter reporter =new ExtentSparkReporter(path);
	reporter.config().setReportName("SpiceJet Report");
	
	//Add automation data to physical report
	ExtentReports extent = new ExtentReports();
    extent.attachReporter(reporter);
    return extent;
	}
}
