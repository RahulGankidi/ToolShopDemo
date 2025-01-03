package com.toolshop.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

public class LoginPage {
	
	WebDriver driver;
	WebDriverWait wait;
	 ExtentTest test;
	
	public LoginPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 this.test = test;
	}
	
	By SigninLink = By.linkText("Sign in");
	By Email = By.id("email");
	By Password = By.id("password");
	By LoginButton = By.xpath("//*[@class=\"btnSubmit\"]");
	
	public void clickonSigninLink() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement signinElement = wait.until(ExpectedConditions.elementToBeClickable(SigninLink));
		signinElement.click();
		test.pass("Clicked on Sign in link.");
	}
	public void enterEmail() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement emailElement = wait.until(ExpectedConditions.elementToBeClickable(Email));
		emailElement.click();
		emailElement.sendKeys("srinivasrao11@gmail.com");
		test.pass("Entered email successfully.");
	}
	public void enterPassword() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(Password));
		passwordElement.click();
		passwordElement.sendKeys("Srinivas@4455");
		test.pass("Entered password successfully.");
	}
	public void clickonLoginButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement loginElement = wait.until(ExpectedConditions.elementToBeClickable(LoginButton));
		loginElement.click();
		test.pass("Clicked on Login button.");
	}

}
