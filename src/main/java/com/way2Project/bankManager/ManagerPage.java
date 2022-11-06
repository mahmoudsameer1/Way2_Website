package com.way2Project.bankManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.way2Project.actiondriver.Action;
import com.way2Project.base.Base;

public class ManagerPage extends Base{

	Action action = new Action();

	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/button[1]")
	private WebElement addCutomerBtn;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[1]/input")
	private WebElement firstName;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[2]/input")
	private WebElement secondName;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[3]/input")
	private WebElement postCode;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/button")
	private WebElement addCustomerafterBtn;
	
	
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/button[2]")
	private WebElement openAccountBtn;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/button[3]")
	private WebElement customersBtn;
	


	public ManagerPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public boolean validateManagerPage() {
		
		return action.isDisplayed(getDriver(), addCutomerBtn);
	}
	
	
	public void ClickOnAddCustomerBtn(String firstname, String secondname,String postcode) throws InterruptedException {

		action.click(getDriver(), addCutomerBtn);
		Thread.sleep(3000);
		action.typestring(firstName, firstname);
		action.typestring(secondName, secondname);
		action.typestring(postCode, postcode);
		action.click(getDriver(), addCustomerafterBtn);
		action.Alert(getDriver());

	}
	
	public void clickOnOpenAccountBtn() throws InterruptedException {

		action.click(getDriver(), openAccountBtn);

	}
	
	public void clickOncustomersBtn() throws InterruptedException {

		action.click(getDriver(), customersBtn);

	}
	
}
