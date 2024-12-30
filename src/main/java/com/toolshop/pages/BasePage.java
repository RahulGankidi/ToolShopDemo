package com.toolshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BasePage {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void openBrowserUrl() {
		driver = new EdgeDriver();
		driver.get("https://practicesoftwaretesting.com/");
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void closeBrowserUrl() {
		driver.quit();
	}
	

}
