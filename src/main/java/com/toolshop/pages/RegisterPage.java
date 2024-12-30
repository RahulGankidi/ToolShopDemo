package com.toolshop.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	By SigninLink = By.linkText("Sign in");
	By RegisterAccount = By.linkText("Register your account");
	By FirstName = By.id("first_name");
	By LastName = By.id("last_name");
	By DateofBirth = By.id("dob");
	By Address = By.id("address");
	By PostCode = By.id("postcode");
	By City = By.id("city");
	By State = By.id("state");
	By Country = By.id("country");
	By Phone = By.id("phone");
	By EmailAddress = By.id("email");
	By Password = By.id("password");
	By RegisterButton = By.xpath("//*[@class=\"btnSubmit mb-3\"]");
	
	public void clickonSignIn() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement signElement = wait.until(ExpectedConditions.elementToBeClickable(SigninLink));
		signElement.click();
	}
	public void clickonRegisterLink() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement regElement = wait.until(ExpectedConditions.elementToBeClickable(RegisterAccount));
		regElement.click();
	}
	public void enterFirstname() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement fnameElement = wait.until(ExpectedConditions.elementToBeClickable(FirstName));
		fnameElement.click();
		fnameElement.sendKeys("Santhosh");
	}
	public void enterLastname() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement lnameElement = wait.until(ExpectedConditions.elementToBeClickable(LastName));
		lnameElement.click();
		lnameElement.sendKeys("Rao");
	}
	public void enterDOB() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement dobElement = wait.until(ExpectedConditions.elementToBeClickable(DateofBirth));
		dobElement.click();
		dobElement.sendKeys("25-02-1999");
	}
	public void enterAddress() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement addElement = wait.until(ExpectedConditions.elementToBeClickable(Address));
		addElement.click();
		addElement.sendKeys("10-101,LaxmiNagar");
	}
	public void enterPostcode() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement postElement = wait.until(ExpectedConditions.elementToBeClickable(PostCode));
		postElement.click();
		postElement.sendKeys("552233");
	}
	public void enterCity() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement cityElement = wait.until(ExpectedConditions.elementToBeClickable(City));
		cityElement.click();
		cityElement.sendKeys("Jagitial");
	}
	public void enterState() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement stateElement = wait.until(ExpectedConditions.elementToBeClickable(State));
		stateElement.click();
		stateElement.sendKeys("Telangana");
	}
	public void selectCountry() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement counElement = wait.until(ExpectedConditions.elementToBeClickable(Country));
		counElement.click();
		counElement.sendKeys("India");
	}
	public void enterPhone() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement phoneElement = wait.until(ExpectedConditions.elementToBeClickable(Phone));
		phoneElement.click();
		phoneElement.sendKeys("9966223344");
	}
	public void enterEmail() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement emailElement = wait.until(ExpectedConditions.elementToBeClickable(EmailAddress));
		emailElement.click();
		emailElement.sendKeys("santhoshrao1@gmail.com");
	}
	public void enterPassword() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement passElement = wait.until(ExpectedConditions.elementToBeClickable(Password));
		passElement.click();
		passElement.sendKeys("SanthoshRao@11");
	}
	public void clickonRegisterButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement regbtnElement = wait.until(ExpectedConditions.elementToBeClickable(RegisterButton));
		regbtnElement.click();
	}

}
