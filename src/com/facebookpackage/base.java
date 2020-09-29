package com.facebookpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class base {
	
	public static WebDriver driver;
	
	public static void chromebrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sample\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	public static void send(WebElement dr,String asd) {
		dr.sendKeys(asd);
	}
	
	public static void click(WebElement dx){
			dx.click();
		}
	public static void closebrowse() {
		driver.close();
		}
	public static void selectbyvalue(WebElement s,String df) {
	Select d = new Select(s);
	d.selectByValue(df);
	
	}
	public static void selectbytxt(WebElement f, String ds) {
		Select d = new Select(f);
		d.selectByVisibleText(ds);
	}
	public static void selectbyindex(WebElement f, int ds) {
		Select d = new Select(f);
		d.selectByIndex(ds);
	}
		
	public static void hover(WebElement h) {
		Actions a = new Actions(driver);
		a.moveToElement(h).perform();
	}	
		
	}
	


