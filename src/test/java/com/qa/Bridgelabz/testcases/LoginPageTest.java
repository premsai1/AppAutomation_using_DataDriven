package com.qa.Bridgelabz.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.bridgelabz.base.TestBase;
import com.qa.bridgelabz.pages.LoginPage;
import com.qa.bridgelabz.pages.WelcomePage;
import com.qa.bridgelabz.util.TestUtil;
/**
 * @author PremSai Manthani
 * @purpose This class perform test case on login page
 * 
 */

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	WelcomePage welcomePage;
	String sheetName = "login_details";

	public LoginPageTest() {
		super();

	}

	@BeforeMethod
	public void setUp() {
		intialization();
		loginPage = new LoginPage();

	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "loginPage");
	}

	@DataProvider
	public Object[][] getCRMTestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}

	@Test(priority = 2, dataProvider = "getCRMTestData")
	public void loginTest(String username, String password) {
		// welcomePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		welcomePage = loginPage.login(username, password);
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
