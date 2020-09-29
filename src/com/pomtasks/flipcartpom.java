package com.pomtasks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebookpackage.base;



public class flipcartpom extends base {
 
public 	flipcartpom(){
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//span[text()='Electronics']")
private WebElement electronics;

public WebElement getElectronics() {
	return electronics;
}

}
