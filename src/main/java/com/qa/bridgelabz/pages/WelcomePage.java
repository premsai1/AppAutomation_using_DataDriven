package com.qa.bridgelabz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.qa.bridgelabz.base.TestBase;
/**
 * @author PremSai Manthani
 * @purpose This class locate all we elements present on the Welcome page 
 * 
 */

public class WelcomePage extends TestBase {

	
	//h3[contains(text(),'welcome user')]
	
	@FindBy(xpath = "//h3[contains(text(),'welcome user')]")
	WebElement text;
	
	
	public String verifyWelcomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyText() {
		
		return text.isDisplayed();
		
	}
	
}
