package com.qa.Bridgelabz.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.bridgelabz.base.TestBase;
import com.qa.bridgelabz.pages.ForgotPage;
import com.qa.bridgelabz.pages.LoginPage;
import com.qa.bridgelabz.util.TestUtil;
/**
 * @author PremSai Manthani
 * @purpose This class perform the test case on forgot page  
 * 
 */

public class ForgotPageTest extends TestBase{

	ForgotPage forgotPage;
	LoginPage loginPage;
	String sheetName="forgot_details";
	
	@BeforeMethod
	public void setUp() {
		intialization();
		forgotPage  =new ForgotPage();
	}
	
	@Test(priority=1)
	public void forgotPageTitleTest() {
		String title=forgotPage.validateForgotPageTitle();
		Assert.assertEquals(title,"loginPage");
	}
	@DataProvider
	public Object[][] getCRMTestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=2,dataProvider="getCRMTestData")
	public void forgot(String userName,String mail,String news,String Confirm) throws InterruptedException {
		loginPage =forgotPage.forgot(userName, mail, news, Confirm);
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
