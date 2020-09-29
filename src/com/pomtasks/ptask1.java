package com.pomtasks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebookpackage.base;

public class ptask1 extends base {
	
	public ptask1() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Women']")
	private WebElement women;
	
	@FindBy(xpath="(//a[text()='T-shirts'])[1]")
	private WebElement tshirt;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement addtocart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement checkout;
	

	public WebElement getCheckout() {
		return checkout;
	}


	public WebElement getAddtocart() {
		return addtocart;
	}

	@FindBy(xpath="//a[@class='login']")
	private WebElement txtEmail;
	
	@FindBy(name="email_create")
	private WebElement email;
	
	
	
	@FindBy(id="SubmitCreate")
	private WebElement submit;


	public WebElement getTxtEmail() {
		return txtEmail;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getSubmit() {
		return submit;
	}
	
	public WebElement getWomen() {
		return women;
	}
	
	public WebElement getTshirt() {
		return tshirt;
	}

}
