package com.way2Project.homePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.way2Project.Customer.CutomerPage;
import com.way2Project.actiondriver.Action;
import com.way2Project.bankManager.ManagerPage;
import com.way2Project.base.Base;

public class HomePage extends Base {

	Action action = new Action();

	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div[2]/button")
	private WebElement BankManagerloginBtn;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div[1]/button")
	private WebElement customerloginBtn;

	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	public ManagerPage clickOnBankManagerLogin() throws InterruptedException {

		Thread.sleep(4000);
		action.click(getDriver(), BankManagerloginBtn);
		return new ManagerPage();

	}
	
	public CutomerPage clickOnBankCustomerLogin() throws InterruptedException {

		Thread.sleep(4000);
		action.click(getDriver(), customerloginBtn);
		return new CutomerPage();

	}
	
}
