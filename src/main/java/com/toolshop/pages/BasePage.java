package com.toolshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BasePage {
	
	public WebDriver driver;
	 public static ExtentReports extent;
	    public static ExtentTest test;
	
	@BeforeSuite
	public void openBrowserUrl() {
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("test-output/ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        
        test = extent.createTest("Base Test Setup").info("Test Suite Execution Started");
        
		driver = new EdgeDriver();
		driver.get("https://practicesoftwaretesting.com/");
		driver.manage().window().maximize();
		test.pass("Browser launched and URL opened successfully.");
	}
	
	@AfterSuite
	public void closeBrowserUrl() {
		extent.flush();
		test.pass("Browser closed successfully.");
		driver.quit();
	}
	

}
