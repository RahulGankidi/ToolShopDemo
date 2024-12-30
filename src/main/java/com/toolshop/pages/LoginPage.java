package com.toolshop.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	By SigninLink = By.linkText("Sign in");
	By Email = By.id("email");
	By Password = By.id("password");
	By LoginButton = By.xpath("//*[@class=\"btnSubmit\"]");
	
	public void clickonSigninLink() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement signinElement = wait.until(ExpectedConditions.elementToBeClickable(SigninLink));
		signinElement.click();
	}
	public void enterEmail() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement emailElement = wait.until(ExpectedConditions.elementToBeClickable(Email));
		emailElement.click();
		emailElement.sendKeys("ramuraorr123@gmail.com");
	}
	public void enterPassword() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(Password));
		passwordElement.click();
		passwordElement.sendKeys("RamuRao@12");
	}
	public void clickonLoginButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement loginElement = wait.until(ExpectedConditions.elementToBeClickable(LoginButton));
		loginElement.click();
	}

}
