package com.qa.bridgelabz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.bridgelabz.base.TestBase;
/**
 * @author PremSai Manthani
 * @purpose This class locate all we elements present on the login page 
 * 
 */

public class LoginPage extends TestBase {

	// Page Factory -OR

	@FindBy(xpath = "//input[@name='uname']")
	WebElement username;

	@FindBy(xpath = "//input[@name='pass']")
	WebElement password;

	@FindBy(xpath = "//form[contains(text(),'Enter username :')] ")
	WebElement login;

	@FindBy(xpath = "//input[@value='click here']")
	WebElement click;

	

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public WelcomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
		return new WelcomePage();
	}

}
