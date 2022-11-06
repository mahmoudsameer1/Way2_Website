package com.way2Project.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.way2Project.bankManager.ManagerPage;
import com.way2Project.base.Base;
import com.way2Project.dataProvider.DataProviders;
import com.way2Project.homePage.HomePage;
import com.way2Project.utility.Log;

public class BankManagerTest extends Base{

	private HomePage homePage;
	private ManagerPage managerPage;

	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser) {
		loadConfig();
		launchApp(browser);
		afterSuite();
	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		getDriver().quit();
	}
	
	@Test(dataProvider = "CreateUser", dataProviderClass = DataProviders.class)
	public void addCustomer(String firstname, String secondname,String postcode) throws InterruptedException {
		Log.startTestCase("addCustomer");
		homePage = new HomePage();
		managerPage = new ManagerPage();
		
		
		homePage.clickOnBankManagerLogin();
		managerPage.ClickOnAddCustomerBtn(firstname,secondname,postcode);
		
	}
}
