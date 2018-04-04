package com.myPackage;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyClass {
	

	public static void main(String[] args) {
		
		System.out.println("hi");
		
//		String extentReportFile = System.getProperty("user.dir")
//				+ "\\extentReportFile.html";
//		String extentReportImage = System.getProperty("user.dir")
//				+ "\\extentReportImage.png";
//
//		// Create object of extent report and specify the report file path.
//		ExtentReports extent = new ExtentReports(extentReportFile, true );
//
//		// Start the test using the ExtentTest class object.
//		ExtentTest extentTest = extent.startTest("My First Test",
//				"Verify WebSite Title");
//		
//		extentTest.log(LogStatus.INFO, "Browser Launched");
//		extentTest.log(LogStatus.INFO, "Navigated to www.techbeamers.com");
//		extentTest.log(LogStatus.PASS, "Title verified");
//		
//		extentTest.log(LogStatus.INFO,"Error Snapshot : "+extentTest.addScreenCapture(extentReportImage));
//		
//		// close report.
//		extent.endTest(extentTest);
//
//	
//		
//		
//		// Start the test using the ExtentTest class object.
//				ExtentTest extentTest1= extent.startTest("My Second Test",
//						"Verify WebSite Title");
//				
//				extentTest1.log(LogStatus.PASS, "Title verified");
//								
//				// close report.
//				extent.endTest(extentTest1);
//				
//				// writing everything to document.
//				extent.flush();
	}

}
