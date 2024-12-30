package com.toolshop.tests;

import org.testng.annotations.Test;

import com.toolshop.pages.BasePage;
import com.toolshop.pages.LoginPage;

public class LoginTest extends BasePage {
	
	LoginPage loginpage;
	
	@Test
	public void LoginPage() {
		loginpage = new LoginPage(driver);
		loginpage.clickonSigninLink();
		loginpage.enterEmail();
		loginpage.enterPassword();
		loginpage.clickonLoginButton();
	}

}
