package com.way2Project.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.way2Project.Customer.CutomerPage;
import com.way2Project.Customer.UserProfile;
import com.way2Project.base.Base;
import com.way2Project.homePage.HomePage;
import com.way2Project.utility.Log;

public class CutomerPageTest extends Base{

	private CutomerPage customer;
	private HomePage homePage;
	private UserProfile userProfile;
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser) {
		launchApp(browser);
	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		getDriver().quit();
	}
	
	@Test()
	public void selectUserTest() throws InterruptedException {
		
		Log.startTestCase("selectUserTest");
		homePage = new HomePage();
		homePage.clickOnBankCustomerLogin();
		customer = new CutomerPage();
		customer.selectTheUser();
		userProfile = customer.clickOnOpenAccountBtn();
		Boolean t= userProfile.validateTitle();
		Assert.assertTrue(t);
		
		
	}
}
