package com.tr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.tr.util.BasePageObject;

public class SelectYourAvatarPage extends BasePageObject{
	
	WebElement element;
	boolean flag = false;
	
	public SelectYourAvatarPage(WebDriver driver) {
		
		super(driver);
	}
	By aviatorText = By.xpath("//div[@class='reg_headbig']");
	By aviatorSelectorExpeience = By.id("Just_in_Job");
	By saveAndContinue = By.id("avatr_sel");
	
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
		
	/**
	 * Author Gowtham
	 * This method help us to select the avatar 
	 * @param no parameters 
	 * @return this
	 * @throws Exception
	 */
		public SelectYourAvatarPage selectAvatar(){
			element = driver.findElement(aviatorSelectorExpeience);
			flag = element.isDisplayed();
			if (flag) { System.out.println("just in a job avatar is displayed");
				
			} else { System.out.println("just in a job avatar is not displayed ");
			
			}
			element.click();
			return this;

		}
		
		/**
		 * Author Gowtham
		 * This method help us to navigate to dash board page
		 * @param no parameters 
		 * @return this
		 * @throws Exception
		 */
		public MyDashbordPage clickSaveAndContinue(){
			
			element = driver.findElement(saveAndContinue);
			flag = element.isDisplayed();
			if (flag) { System.out.println("the save and continue button is displayed");
				
			} else {  System.out.println("the save and continue button is not displayed");

			}
			element.click();
			
			return new MyDashbordPage(driver);
		}

}
