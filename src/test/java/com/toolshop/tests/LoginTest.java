package com.toolshop.tests;

import org.testng.annotations.Test;

import com.toolshop.pages.BasePage;
import com.toolshop.pages.LoginPage;

public class LoginTest extends BasePage {
	
	LoginPage loginpage;
	
	@Test
	public void LoginPage() {
		test = extent.createTest("Login Test").info("Login Test Execution Started");
		loginpage = new LoginPage(driver, test);
		loginpage.clickonSigninLink();
		loginpage.enterEmail();
		loginpage.enterPassword();
		loginpage.clickonLoginButton();
		
		test.info("Login Test Execution Completed.");
	}

}
