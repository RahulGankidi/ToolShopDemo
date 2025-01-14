package com.toolshop.tests;

import org.testng.annotations.Test;

import com.toolshop.pages.BasePage;
import com.toolshop.pages.RegisterPage;

public class RegisterTest extends BasePage {
	
	RegisterPage registerpage;
	
	@Test
	public void RegisterTest() {
		test = extent.createTest("Register Test").info("Register Test Execution Started");
		registerpage = new RegisterPage(driver, test);
		registerpage.clickonSignIn();
		registerpage.clickonRegisterLink();
		registerpage.enterFirstname();
		registerpage.enterLastname();
		registerpage.enterDOB();
		registerpage.enterAddress();
		registerpage.enterPostcode();
		registerpage.enterCity();
		registerpage.enterState();
		registerpage.selectCountry();
		registerpage.enterPhone();
		registerpage.enterPhone();
		registerpage.enterEmail();
		registerpage.enterPassword();
		registerpage.clickonRegisterButton();
		
		test.info("Register Test Execution Completed Successfully");
	}

}
