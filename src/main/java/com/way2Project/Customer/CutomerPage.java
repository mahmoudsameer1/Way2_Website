package com.way2Project.Customer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.way2Project.actiondriver.Action;
import com.way2Project.base.Base;

public class CutomerPage extends Base{
	
	Action action = new Action();

	@FindBy(name = "userSelect")
	private WebElement selectUser;

	@FindBy(xpath = "/html/body/div/div/div[2]/div/form/button")
	private WebElement loginBtn;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/form/div/label")
	private WebElement yourNameText;
	

	public CutomerPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public boolean nameValidity() {
		
		action.implicitWait(getDriver(), 10);
		return action.isDisplayed(getDriver(), selectUser);
	}
	
	public void selectTheUser() throws InterruptedException {

		action.selectByVisibleText("Hermoine Granger", selectUser);
	}
	
	public UserProfile clickOnOpenAccountBtn() throws InterruptedException {

		action.click(getDriver(), loginBtn);
		return new UserProfile();

	}
	
}
