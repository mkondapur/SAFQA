package com.tr.pages;


import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import com.tr.util.BasePageObject;

public class SelectYourAvatarPage extends BasePageObject{
	
	WebElement element;
	boolean flag = false;
	public SelectYourAvatarPage(WebDriver driver) {
		
		super(driver);
	}
	

	By aviatorText = By.xpath("//div[@class='reg_headbig']");
	By aviatorSelectorExperience = By.id("Just_in_Job");
	By saveAndContinue = By.id("avatr_sel");
	/**
	 * Author Gowtham
	 * This method help us to verify the text present in the avatar page
	 * @param no parameters 
	 * @return this
	 * @throws Exception
	 */
	public boolean verifyIsAvatarSelectTextIsPresent(){
		element = driver.findElement(aviatorText);
		flag=	element.isDisplayed();
		Assert.assertTrue(flag, "avatar text is not present");
		String text = element.getText();
		System.out.println(text);
		return flag;
		}
		
	/**
	 * Author Gowtham
	 * This method help us to select the avatar 
	 * @param no parameters 
	 * @return this
	 * @throws Exception
	 */
		public SelectYourAvatarPage selectAvatar() throws Exception{
			element = setElement(aviatorSelectorExperience);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "experience avatar is not displayed");
			if (element.isEnabled()) { 
				element.click();
			}
			
			return this;

		}
		
		/**
		 * Author Gowtham
		 * This method help us to navigate to dash board page
		 * @param no parameters 
		 * @return this
		 * @throws Exception
		 */
		public MyDashbordPage clickSaveAndContinue() throws Exception{
				
			element = setElement(saveAndContinue);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "save and continue button is not displayed");
			if (element.isEnabled()) {
				element.click();
			}
			return new MyDashbordPage(driver);
		}
	
	
	
	/**
	 * Author Gowtham
	 * This method help us to verify the text present in the avatar page
	 * @param no parameters 
	 * @return this
	 * @throws Exception
	 */
	public boolean verifyAvatarSelectText(){
		element = driver.findElement(aviatorText);
		flag=	element.isDisplayed();
		
		if (flag) { System.out.println("avatar select text is present");
			
		} else { System.out.println("avatar select text is not present");

		}
		String text = element.getText();
		System.out.println(text);
		return flag;
		}
		
		

}
