package com.qa.Bridgelabz.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.bridgelabz.base.TestBase;
import com.qa.bridgelabz.pages.RegisterationPage;
import com.qa.bridgelabz.pages.WelcomePage;
import com.qa.bridgelabz.util.TestUtil;
/**
 * @author PremSai Manthani
 * @purpose This class performs the test cases on registration page
 * 
 */

public class RegisterationPageTest extends TestBase{

	RegisterationPage registerationPage;
	WelcomePage welcomePage;
	String sheetName="registeration_details";

	@BeforeMethod
	public void setUp() {
		intialization();
		registerationPage  =new RegisterationPage();
		
	}
	
	@Test(priority=1)
	public void validateregisterationPageTitle() {
		String title=registerationPage.validateregisterationPageTitle();
		Assert.assertEquals(title,"registerationPage");
	}
	
	@DataProvider
	public Object[][] getCRMTestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=2,dataProvider="getCRMTestData")
	public void registeration(String firstName,String userName,String password,String address,String contact,String mail) throws InterruptedException
	{
	//	welcomePage=registerationPage.registeration(prop.getProperty("firstName"),prop.getProperty("userName"),prop.getProperty("password"),prop.getProperty("address"),prop.getProperty("contact"),prop.getProperty("mail"));
		welcomePage=registerationPage.registeration(firstName, userName, password, address, contact, mail);
	
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
