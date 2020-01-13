package com.qa.bridgelabz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.bridgelabz.base.TestBase;
/**
 * @author PremSai Manthani
 * @purpose This class locate all we elements present on the registeration page 
 * 
 */

public class RegisterationPage extends TestBase{
	
	@FindBy(xpath = "//input[@value='click here']")
	WebElement click;
	
	@FindBy(xpath = "//input[@name='first_name']")
	WebElement firstName;

	@FindBy(xpath = "//input[@name='username']")
	WebElement userName;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//input[@name='address']")
	WebElement address;

	@FindBy(xpath = "//input[@name='contact']")
	WebElement contact;

	@FindBy(xpath = "//input[@name='mail']")
	WebElement mail;

	@FindBy(xpath = "//input[@value='Submit']")
	WebElement singUp;

	// Initializing the page Objects
	public RegisterationPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String validateregisterationPageTitle() {
		return driver.getTitle();
	}
	
	public WelcomePage registeration(String firstname, String username, String pass, String add, String con, String mal)
			throws InterruptedException {
		
		click.click();
		firstName.sendKeys(firstname);
		Thread.sleep(1000);
		userName.sendKeys(username);
		Thread.sleep(1000);
		password.sendKeys(pass);
		Thread.sleep(1000);
		address.sendKeys(add);
		Thread.sleep(1000);
		contact.sendKeys(con);
		Thread.sleep(1000);
		mail.sendKeys(mal);
		Thread.sleep(1000);
		singUp.click();
		Thread.sleep(6000);
		

		return new WelcomePage();
	}

	
}
