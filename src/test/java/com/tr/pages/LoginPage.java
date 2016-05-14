package com.tr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.tr.common.MonsterIndiaConstants;
import com.tr.common.MonsterUtil;
import com.tr.util.BasePageObject;

public class LoginPage extends BasePageObject{

	/**
	 * @author Santosh/Narendranath
	 */
	WebElement element;
	 public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	 boolean flag = false;
	 String txt=null;
	By txtuserName = By.id("username_login");
	By txtPassword = By.id("passwd_temp");
	By btnSignIn = By.id("button");
	By lblSignMSG = By.xpath("//td[contains(text(),'Already a Member? Sign In')]");
	
	public boolean isLoginPageDisplayed(){
		
		element = driver.findElement(lblSignMSG);
			flag = element.isDisplayed();
			if (flag) {
				txt = element.getText();
				Assert.assertEquals(txt, MonsterIndiaConstants.TXT_LOGIN_MSG,"Login page header is not matching");
			}
		return flag;
	}
	
	public WebElement setUserName(){
		element = driver.findElement(txtuserName);
		return element;
		
	}
	public WebElement setPassword(){
		element = driver.findElement(txtPassword);
		return element;
		
	}
	
	public LoginPage enterUserName(String txtUserName){
		Log.info("Enter user name as:"+txtUserName);
		flag = setUserName().isDisplayed();
		Assert.assertTrue(flag, "User name field is not displayed");
		setUserName().sendKeys(txtUserName);
		return new LoginPage(driver);
	}
	
	public LoginPage enterPassword(String txtPassword){
		Log.info("Enter password as:"+txtPassword);
		flag = setPassword().isDisplayed();
		Assert.assertTrue(flag, "Password txt field is not displayed");
		setPassword().sendKeys(txtPassword);
		return new LoginPage(driver);
	}
	
	public MyDashbordPage clickOnLogin() {
		Log.info("Clickin on Login button");
		element = driver.findElement(btnSignIn);
		flag = element.isDisplayed();
		Assert.assertTrue(flag, "Login button is not displayed");
		element.click();
		MonsterUtil.implicitWait(30);
		return new MyDashbordPage(driver);
	}
	
	public void loginAsJobSeeker(String userName,String password) {
		Log.info("Login as jobseeker with credentails");
		enterPassword(userName);
		enterPassword(password);
		clickOnLogin();
	}
}
