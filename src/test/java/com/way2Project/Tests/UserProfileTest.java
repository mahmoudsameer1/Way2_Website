package com.way2Project.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.way2Project.Customer.CutomerPage;
import com.way2Project.Customer.UserProfile;
import com.way2Project.base.Base;
import com.way2Project.dataProvider.DataProviders;
import com.way2Project.homePage.HomePage;
import com.way2Project.utility.Log;

public class UserProfileTest extends Base{
	
	private CutomerPage customer;
	private HomePage homePage;
	private UserProfile userprofile;
	
	
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
	
	@Test(dataProvider = "Ammount", dataProviderClass = DataProviders.class)
	public void deposit(String ammountOfDeposit) throws InterruptedException {
		
		Log.startTestCase("selectUserTest");
		
		userprofile = new UserProfile();
		homePage = new HomePage();
		customer = new CutomerPage();


		homePage.clickOnBankCustomerLogin();
		customer.selectTheUser();
		customer.clickOnOpenAccountBtn();
		userprofile.clickOnDepositeBtn();
		userprofile.ammount(ammountOfDeposit);
	}
	
}
