package com.facebookpackage;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomclass extends base  {
	
	public pomclass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	private WebElement txtEmail;
	
	@FindBy(id = "pass")
	private WebElement txtPass;

	@FindBy(name = "firstname")
	private WebElement txtFirstName;

	@FindBy(name = "lastname")
	private WebElement txtLastName;
	
	@FindBy(id = "u_0_r")
	private WebElement email;
	
	@FindBy(id = "u_0_u")
	private WebElement reemail;
	
	public WebElement getReemail() {
		return reemail;
	}

	@FindBy(id = "u_0_w")
	private WebElement pass;

	@FindBy(id = "day")
	private WebElement drpday;
	
	@FindBy(id="month")
	private WebElement drpmonth;
	
	@FindBy(id = "year")
	private WebElement drpYear;
	
	@FindBy(id = "loginbutton")
	private WebElement btnLogin;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getDrpday() {
		return drpday;
	}

	public WebElement getDrpmonth() {
		return drpmonth;
	}

	public WebElement getDrpYear() {
		return drpYear;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	
	   
	

}
