package com.qa.bridgelabz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.bridgelabz.base.TestBase;
/**
 * @author PremSai Manthani
 * @purpose This class locate all we elements present on the forgot page 
 * 
 */

public class ForgotPage extends TestBase {
	
	@FindBy(xpath = "//input[@value='forgot password']")
	WebElement forgot;
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement userName;

	@FindBy(xpath = "//input[@name='mail']")
	WebElement mail;

	@FindBy(xpath = "//input[@name='news']")
	WebElement newPassword;

	@FindBy(xpath = "//input[@value='resetpass']")
	WebElement confirmPassword;

	@FindBy(xpath = "//input[@value='resetpass']")
	WebElement reset;

	// Initializing the page Objects
	public ForgotPage() {
		super();
		PageFactory.initElements(driver, this);
	}

	public String validateForgotPageTitle() {
		return driver.getTitle();
	}
	
	public LoginPage forgot(String uname, String mal, String news, String confirm) throws InterruptedException {
		
		forgot.click();
		userName.sendKeys(uname);
		Thread.sleep(3000);
		mail.sendKeys(mal);
		Thread.sleep(3000);
		newPassword.sendKeys(news);
		Thread.sleep(3000);
		confirmPassword.sendKeys(confirm);
		Thread.sleep(3000);
		reset.click();
		return new LoginPage();
	}

}
