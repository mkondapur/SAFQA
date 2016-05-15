package com.tr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.tr.util.BasePageObject;

public class ProfileCompletenessPage extends BasePageObject {

	/**
	 * @author Satish
	 */
	WebDriver driver;
	WebElement element;
	boolean flag = false;
	By pageid = By.id("light_profilecomp");
	
	public ProfileCompletenessPage(WebDriver driver) {
		
		super(driver);
		
	}
	
	public boolean Pagexists(){
		element = driver.findElement(pageid);
		flag = element.isDisplayed();
		if (flag = true ){
		System.out.println("Profile Completeness page is displayed");
		}
		return flag;
	}
	//div[@id='light_profilecomp']//a[contains(.,'Do not Display Again')]
}