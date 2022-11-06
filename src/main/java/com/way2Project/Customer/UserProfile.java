package com.way2Project.Customer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.way2Project.actiondriver.Action;
import com.way2Project.base.Base;

public class UserProfile extends Base{

	Action action = new Action();

	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/strong/text()[1]")
	private WebElement welcomeText;

	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[3]/button[2]")
	private WebElement DepositeBtn;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[4]/div/form/div/input")
	private WebElement ammount;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[4]/div/form/button")
	private WebElement depositeAfterAddingAmmountBtn;

	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[3]/button[1]")
	private WebElement TransactionBtn;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[3]/button[3]")
	private WebElement WithDrawlBtn;

	

	public UserProfile() {
		PageFactory.initElements(getDriver(), this);
	}

	public boolean validateTitle() {
		
		return action.isDisplayed(getDriver(), welcomeText);
	}
	
	public void clickOnDepositeBtn(){

		action.click(getDriver(), DepositeBtn);

	}
	
	public void ammount(String ammountOfDeposit) {
		
		action.typestring(ammount, ammountOfDeposit);
		action.click(getDriver(), depositeAfterAddingAmmountBtn);
		
	}
	
	public void clickOnTransactionBtn() {

		action.click(getDriver(), TransactionBtn);

		
	}
	
	public void clickOnWithDrawlBtn() {

		action.click(getDriver(), WithDrawlBtn);

	}
}
