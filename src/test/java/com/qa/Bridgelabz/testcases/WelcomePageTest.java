package com.qa.Bridgelabz.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.bridgelabz.base.TestBase;
import com.qa.bridgelabz.pages.LoginPage;
import com.qa.bridgelabz.pages.WelcomePage;
/**
 * @author PremSai Manthani
 * @purpose This class performs the test acmes on welcome page 
 * 
 */
public class WelcomePageTest extends TestBase{
	
	LoginPage loginPage;
	WelcomePage welcomePage;
	
	public  WelcomePageTest()
	{
		super();
		PageFactory.initElements(driver, this); 
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		loginPage  =new LoginPage();
		welcomePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void WelcomePageTitle() {
		String title=welcomePage.verifyWelcomePageTitle();
		Assert.assertEquals(title,"welcomePage");
	}
	
	@Test(priority=2)
	public void text() {
		Assert.assertTrue(welcomePage.verifyText());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
