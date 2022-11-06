package com.way2Project.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.way2Project.Customer.CutomerPage;
import com.way2Project.bankManager.ManagerPage;
import com.way2Project.base.Base;
import com.way2Project.homePage.HomePage;
import com.way2Project.utility.Log;

public class HomePageTest extends Base {

	private HomePage homePage;
	private ManagerPage managerPage;
	private CutomerPage customerPage;

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

	@Test
	public void bankManagerloginTest() throws Throwable {
		Log.startTestCase("bankManagerloginTest");
		homePage = new HomePage();
		managerPage = homePage.clickOnBankManagerLogin();
		boolean tm = managerPage.validateManagerPage();
		Assert.assertTrue(tm);

	}
	
	/*
	@Test
	public void customerLoginTest() throws Throwable {
		Log.startTestCase("customerLoginTest");
		homePage = new HomePage();
		customerPage =homePage.clickOnBankCustomerLogin();
		boolean tc = customerPage.nameValidity();
		Assert.assertTrue(tc);
		

	}*/
}
