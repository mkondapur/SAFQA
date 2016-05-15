package com.tr.pages;


import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.tr.common.MonsterIndiaConstants;
import com.tr.common.MonsterUtil;
import com.tr.util.BasePageObject;

public class CreateAccountPage extends BasePageObject {
	
	/**
	 * @author Gowtham
	 */
	
	//WebDriver driver;
	
	boolean flag = false;
	String text = null;
	WebElement element; 
	Alert alert;
	
	public CreateAccountPage(WebDriver driver) {
		super(driver);
	}

	
	By createYourProfileText = By.xpath("//h1[contains(.,'Create your Profile on')]");
	By firstNameField = By.id("firstName_id");
	By lastNameField = By.id("lastName_id");
	By eMailIdField = By.id("email");
	By passWordField = By.id("passwd_id");
	By currentLocationField = By.id("select2-chosen-1");
	By currentLocationDropDown = By.id("select2-result-label-4");
	By mobileNumberField = By.id("mobile2");
	By totalExperienceField = By.id("expYrMonth");
	By numberOfYear = By.id("exp_year2");
	By numberOfMonths = By.id("exp_month6");
	By closeExperienceWindow = By.xpath("//div[@class='right clip_image closedropdown']");
	By selectYear = By.id("exp_year2");
	By selectMonth = By.id("exp_month6");
	By keySkillsField = By.id("skills");
	By industryField = By.id("ind_value");
	By industrySelected = By.id("other_ind_32_val");
	By closeIndustry = By.xpath("//div[@class='right clip_image closedropdown']");
	By functionField = By.id("cat");
	By selectedFunctionalArea = By.id("other_cat_22_val");
	By closeFunctional = By.xpath("//div[@class='right clip_image closedropdown']");
	By upLoadFileField = By.id("wordresume");
	By acceptTermsButton = By.id("accept_privacy_id");
	By privacyStatementLink = By.linkText("privacy statement");
	By termsOfUseLink = By.linkText("terms of use");
	By defaultPreferencesLink = By.linkText("default preferences");
	By googlePlusIcon = By.xpath("//a[@class ='left sclnk gplus']");
	By faceBookIcon = By.xpath("//a[@class='left sclnk fb']");
	By yahooIcon = By.xpath("//a[@class='left sclnk yahoo']");
	By findBetterWithText = By.xpath("//h2[contains(.,' Find Better with')]");
	By monsterVerifyText = By.xpath("//h2[@class='frmright_h2 colr']");
	By findEpmloyee = By.xpath("//div[@class='separate']");
	By alreadyMember = By.xpath("//div[2][contains(.,'Already a member?')]");
	By createAccountNow = By.id("continue");
	By alreadyMemberSignInHere = By.linkText("Sign In Here");
	
	//error messages
	By firstNameError = By.id("ERR_FNAME");
	By emailIdError = By.id("ERR_EMAIL");
	By passwordError = By.id("ERR_PASS");
	By currentLocationError = By.id("ERR_CURLOC");
	By mobileNumberError = By.id("ERR_MOBILE");
	By keySkillsError = By.id("ERR_KEYSKILL");
	By industryError = By.id("ERR_INDUS");
	By functionError = By.id("ERR_JOBCAT");
	By experienceError = By.id("ERR_WORK_EXP");
	By existingEmailIdError = By.xpath("//div//span/div[contains(.,'com is already registered with us.')]");
	By resumeUploadError = By.id("ERR_WRESUME");



	
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	/**
	 * Author Gowtham
	 * This method help us to verify text is present or not
	 * @param No parameters
	 * @return boolean
	 * @throws Exception
	 */
	public boolean isCreateYourProfileMessageDisplayed(){
		Log.info("this log is used to verify the text present in the create account page");
		element = driver.findElement(createYourProfileText);
		flag = element.isDisplayed();
		
		if (flag) {System.out.println("text is displayed");
			
		} else { System.out.println("text is not displayed");

		}
		return flag;
	}
	/**
	 * Author Gowtham
	 * This method help us to verify First name field is present or not
	 * @param No parameters
	 * @return boolean
	 * @throws Exception
	 */
	public CreateAccountPage enteringFirstName(String firstName) throws Exception{
		Log.info("verifiction of first name field and entering the first name");

		element = setElement(firstNameField);
		flag = element.isDisplayed();
		Assert.assertTrue(flag, "first name field is not displayed");
		if (element.isEnabled()) { 
			
			clearAndEnterValueInTextBox(firstNameField, firstName);
			
		}
		return this;
}
	/**
	 * Author Gowtham
	 * This method help us to verify the first name error
	 * @param noparams 
	 * @return this
	 */	
	public CreateAccountPage firstNameErrorIsDisplayed() throws Exception{
		
		element = setElement(firstNameError);
		String firstNameErr = getText(firstNameError);
		Assert.assertEquals(firstNameErr, MonsterIndiaConstants.firstName_Error, "the first name error is not matching");
		return this;
	}
	/**
	 * Author Gowtham
	 * This method help us to verify last name field and enter the last name
	 * @param params String lastName
	 * @return this
	 * @throws Exception
	 */
	public CreateAccountPage enteringlastName(String lastName) throws Exception{
		Log.info("verifiction of last name field");

		try {
			element = setElement(lastNameField);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "the last name element is not displayed");
			if (element.isEnabled()) { 
				
			clearAndEnterValueInTextBox(lastNameField, lastName);
			}
		}
		 catch (Exception e) {
			throw new Exception("Failed while entering last name::"+"verifylastnameTextField::"+e.getLocalizedMessage());			
	
		}
		return this;
		
}
	
	/**
	 * Author Gowtham
	 * This method help us to verify email id field and enter the email id
	 * @param params String emailId
	 * @return this
	 * @throws Exception
	 */
	public CreateAccountPage enteringEmailId(String emailId) throws Exception{
		Log.info("verifiction of emailid field");

		try {
			element = setElement(eMailIdField);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "email id field is not displayed");
			if (element.isEnabled()) { 
				
				clearAndEnterValueInTextBox(eMailIdField, emailId);
			}
		} catch (Exception e) {
			throw new Exception("Failed while entering email id::"+"verifyEmailIdTextField::"+e.getLocalizedMessage());			

		}
		return this;
	}
	/**
	 * Author Gowtham
	 * This method help us to verify the existing email id error
	 * @param noparams 
	 * @return this
	 * @throws Exception 
	 */	
	public void existingEmailIdWarningMessage() throws Exception{
		String existingEmailIdWarningText = getText(existingEmailIdError);
		Assert.assertEquals(existingEmailIdWarningText, MonsterIndiaConstants.existingEmailId_warning, "warning message with not matching with expected");
	}
	
	/**
	 * Author Gowtham
	 * This method help us to verify the email id error
	 * @param noparams 
	 * @return this
	 */	
	public CreateAccountPage lastNameErrorIsDisplayed() throws Exception{
		
		String emailIdErr = getText(emailIdError);
		Assert.assertEquals(emailIdErr, MonsterIndiaConstants.emailId_error, "the email id error is not matching");
		return this;
	}
		/**
		 * Author Gowtham
		 * This method help us to verify password field and enter the password
		 * @param params String passWord
		 * @return this
		 * @throws Exception
		 */

	public CreateAccountPage enteringPassWord(String passWord) throws Exception{
		Log.info("verifiction of password field and entering password");

		try {
		element = setElement(passWordField);
		flag = element.isDisplayed();
		Assert.assertTrue(flag, "password field is not displayed");
		if (element.isEnabled()) {
			
			clearAndEnterValueInTextBox(passWordField, passWord);
		}
		}
		catch (Exception e) {
			throw new Exception("Failed while entering the password::"+"verifyPassWordTextField::"+e.getLocalizedMessage());			
		}
		return this;
	}
	/**
	 * Author Gowtham
	 * This method help us to verify the password  error
	 * @param noparams 
	 * @return this
	 */	
	public CreateAccountPage passwordErrorIsDisplayed() throws Exception{
		
		String passwordErr = getText(passwordError);
		Assert.assertEquals(passwordErr, MonsterIndiaConstants.password_error, "the password error is not matching");
		return this;
	}
	/**
	 * Author Gowtham
	 * This method help us to verify current location and select the location
	 * @param no parameters
	 * @return this
	 * @throws Exception
	 */
	public CreateAccountPage selectingCurrentLocation() throws Exception{
		Log.info("selecting current location field");

		try {

			element = setElement(currentLocationField);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "element is not displayed");
			flag = element.isEnabled();
			Assert.assertTrue(flag, "text box is not enabled");
			element.click();
			Actions action = new Actions(driver);
			element = driver.findElement(currentLocationDropDown);
			action.moveToElement(element);
			action.click().build().perform();
			//Select location = new Select(driver.findElement(currentLocationField));
			//location.selectByVisibleText(currentLocation);
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} catch (Exception e) {
			throw new Exception("Failed while selecting location::"+"verifyCurrentLocationTextField"+e.getLocalizedMessage());			
		}
		return this;
}
	/**
	 * Author Gowtham
	 * This method help us to verify the current location error
	 * @param noparams 
	 * @return this
	 */	
	public CreateAccountPage selectLocationErrorIsDisplayed() throws Exception{
		
		String currentLocationErr = getText(currentLocationError);
		Assert.assertEquals(currentLocationErr, MonsterIndiaConstants.location_error, "the location error is not matching");
		return this;
	}
	/**
	 * Author Gowtham
	 * This method help us to verify mobile field and enter the mobile number
	 * @param params String mobileNumber
	 * @return this
	 * @throws Exception
	 */
	public CreateAccountPage enteringMobileNumber(String mobileNumber) throws Exception{
		Log.info("entering mobile number ");

		try {
			element = setElement(mobileNumberField);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "mobile number field is not displayed");
			if (element.isEnabled()) { 
				
				clearAndEnterValueInTextBox(mobileNumberField, mobileNumber);
			}
			
		} catch (Exception e) {
			throw new Exception("Failed while entering the mobile number::"+"verify mobile number Field"+e.getLocalizedMessage());			
	
		}
		return this;
		
}
	/**
	 * Author Gowtham
	 * This method help us to verify the mobile number error
	 * @param noparams 
	 * @return this
	 */	
	public CreateAccountPage mobileNumberErrorIsDisplayed() throws Exception{
		
		String mobileNumberErr = getText(mobileNumberError);
		Assert.assertEquals(mobileNumberErr, MonsterIndiaConstants.mobileNumber_error, "the mobile number error is not matching");
		return this;
	}
	/**
	 * Author Gowtham
	 * This method help us to verify total experience field and select the year and month
	 * @param no parameters
	 * @return this
	 * @throws Exception
	 */
	public CreateAccountPage selectTotalExperience() throws Exception{
		Log.info("selecting total experience ");

		try {
			element = setElement(totalExperienceField);
			element.click();
			Actions action = new Actions(driver);
					
			element = setElement(numberOfYear);
			action.moveToElement(element);
			action.click().build().perform();
			element = setElement(numberOfMonths);
			action.moveToElement(element);
			action.click().build().perform();
			element = setElement(closeExperienceWindow);
			action.moveToElement(element);
			action.click().build().perform();
			
		} catch (Exception e) {
			throw new Exception("pop up window can not be handled::"+"verifyTotalExperienceField::"+e.getLocalizedMessage());
		
		}
		
		return this;		
		
}
	/**
	 * Author Gowtham
	 * This method help us to verify the total experience error
	 * @param noparams 
	 * @return this
	 */	
	public CreateAccountPage totalExperienceErrorIsDisplayed() throws Exception{
		
		String totalExperienceErr = getText(currentLocationError);
		Assert.assertEquals(totalExperienceErr, MonsterIndiaConstants.experience_error, "the experience error is not matching");
		return this;
	}
	/**
	 * Author Gowtham
	 * This method help us to verify key skills field and enter the last key skills
	 * @param params String keySkills
	 * @return this
	 * @throws Exception
	 */
	public CreateAccountPage enterKeySkills(String keySkills) throws Exception{
		Log.info("verifiction of skills field and entering key skills"+keySkills);

		try {
			element = setElement(keySkillsField);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "ield is not displayedkey skill f");
			if (element.isEnabled()) { 
				clearAndEnterValueInTextBox(keySkillsField, keySkills);
			}
			
		} catch (Exception e) {
			throw new Exception("key skills set field is failed::"+"verifyKeySkillsField::"+e.getLocalizedMessage());

			
		}
		return this;
		
}
	/**
	 * Author Gowtham
	 * This method help us to verify the current key skills error
	 * @param noparams 
	 * @return this
	 */	
	public CreateAccountPage keySkillsErrorIsDisplayed() throws Exception{
		
		String kekSkillsErr = getText(keySkillsError);
		Assert.assertEquals(kekSkillsErr, MonsterIndiaConstants.keySkills_erroe, "the key skills error is not matching");
		return this;
	}
	/**
	 * Author Gowtham
	 * This method help us to verify industry field and select the industry
	 * @param no parameters 
	 * @return this
	 * @throws Exception
	 */
	public CreateAccountPage selectIndustry() throws Exception{
		Log.info("verifiction of industry field");

		try {
			Actions action = new Actions(driver);
			element = setElement(industryField);
			element.click();
			element = setElement(industrySelected);
			action.moveToElement(element);
			action.click().build().perform();
			element = setElement(closeIndustry);
			action.moveToElement(element);
			action.click().build().perform();
			
			
		} catch (Exception e) {
			throw new Exception("industry drop down value is not selected::"+"verifyIndustryField::"+e.getLocalizedMessage());
		}
		
		return this;
		
}
	/**
	 * Author Gowtham
	 * This method help us to verify the select industry error
	 * @param noparams 
	 * @return this
	 */	
	public CreateAccountPage selectIndustryErrorIsDisplayed() throws Exception{
		
		String selectIndustryErr = getText(industryError);
		Assert.assertEquals(selectIndustryErr, MonsterIndiaConstants.industry_erroe, "the select industry error is not matching");
		return this;
	}
	/**
	 * Author Gowtham
	 * This method help us to verify functions field and select the functions
	 * @param no parameters
	 * @return this
	 * @throws Exception
	 */
	public CreateAccountPage selectFunctions() throws Exception{
		
		Log.info("verifiction of functional field and selecting functions");

		try {
			Actions action = new Actions(driver);
			element = setElement(functionField);
			element.click();
			element = setElement(selectedFunctionalArea);
			action.moveToElement(element);
			action.click().build().perform();
			element = setElement(closeFunctional);
			action.moveToElement(element);
			action.click().build().perform();
			
			
		} catch (Exception e) {
			throw new Exception("functional field value is not selected::"+"verifyFunctionalField::"+e.getLocalizedMessage());

		}
		return this;
	}	
	/**
	 * Author Gowtham
	 * This method help us to verify the select functions error
	 * @param noparams 
	 * @return this
	 */	
	public CreateAccountPage selectFunctionsErrorIsDisplayed() throws Exception{
		
		String selectFunctionsErr = getText(functionError);
		Assert.assertEquals(selectFunctionsErr, MonsterIndiaConstants.functions_error, "the select functions error is not matching");
		return this;
	}
	/**
	 * Author Gowtham
	 * This method help us to verify the links present in the create account page
	 * @param noparams 
	 * @return this
	 */	
		public CreateAccountPage verifyLinks() throws Exception{
			Log.info("verifiction of links present in the create account page");

			try {
				//String expTitle = "Monster Privacy Commitment, Resume, Job Seeker Contact Information Access on job site - MonsterIndia.com";
				String parentWindow = driver.getWindowHandle();
				element = setElement(privacyStatementLink);
				flag = element.isDisplayed();
				Assert.assertTrue(flag, "privacy statement link is not displayed");
				element.click();
				text = getText(privacyStatementLink);
				System.out.println("the privacy link text is::"+text);
				
				driver.switchTo().window(parentWindow);
				element = setElement(termsOfUseLink);
				flag = element.isDisplayed();
				Assert.assertTrue(flag, "the terms of use link is not displayed");
				text = getText(termsOfUseLink);
				System.out.println("terms of use text is::"+text);
				element.click();
				Thread.sleep(3000);
				driver.switchTo().window(parentWindow);
				
				element = setElement(defaultPreferencesLink);
				flag = element.isDisplayed();
				Assert.assertTrue(flag, "default preference link is displayed");
				text = getText(defaultPreferencesLink);
				System.out.println("default preference link text is::"+text);
					
			} catch (Exception e) {
				throw new Exception("unable to get the title of privacy link"+"windowHandlesUpLoadResume::"+e.getLocalizedMessage());
			}
			
			return this;
			
		}
		
		/**
		 * Author Gowtham
		 * This method help us to verify google plus icon present or not 
		 * @param no parameters 
		 * @return boolean
		 * @throws Exception
		 */
		
		public boolean isDisplayedGooglePlusIcon() throws Exception{
			Log.info("verifiction of google plus icon");

			element = setElement(googlePlusIcon);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "google plus icon is not displayed");
			
			return flag;
			
		}
		
		/**
		 * Author Gowtham
		 * This method help us to verify facebook icon is present or not 
		 * @param no parameters 
		 * @return boolean
		 * @throws Exception
		 */
		public boolean isDisplayedFacebookIcon() throws Exception{
			Log.info("verifiction of facebook icon");

			element = setElement(faceBookIcon);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "facebook icon is not displayed");
			
			return flag;
		}
		
		/**
		 * Author Gowtham
		 * This method help us to verify yahoo icon is present or not 
		 * @param no parameters 
		 * @return boolean
		 * @throws Exception
		 */
		public boolean isDisplayedYahooIcon() throws Exception{
			Log.info("verifiction of Yahoo icon");

			element = setElement(yahooIcon);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "yahoo icon is not displayed");
			
			return flag;
		}
		
		/**
		 * Author Gowtham
		 * This method help us to verify find better with text is present or not and get the text
		 * @param no parameters 
		 * @return this
		 * @throws Exception
		 */
		public CreateAccountPage verifyfindBetterWithText() throws Exception{
			element = setElement(findBetterWithText);
			element.isDisplayed();
			Assert.assertTrue(flag, "find better with text is not displayed");
			text = getText(findBetterWithText);
			System.out.println("the text present is::"+text);
			return this;

		}
		
		/**
		 * Author Gowtham
		 * This method help us to verify monster text is present or not and get the text
		 * @param no parameters 
		 * @return this
		 * @throws Exception
		 */
		public CreateAccountPage verifyMonsterText() throws Exception{
			Log.info("verifiction of monster text ");

			element = setElement(monsterVerifyText);
			element.isDisplayed();
			Assert.assertTrue(flag, "monster text is not present");
			text = getText(monsterVerifyText);
			System.out.println("the text present is::"+text);
			return this;
		}
		
		/**
		 * Author Gowtham
		 * This method help us to verify number of employees present and get the values 
		 * @param no parameters 
		 * @return this
		 * @throws Exception
		 */
		public String getNumberOfEmployees() throws Exception{
			Log.info("verifiction of number of employees");

			element = setElement(findEpmloyee);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "number of employees not present");
			text = getText(findEpmloyee);
			System.out.println("number of employees::"+text);
			return text;
		}
	
		/**
		 * Author Gowtham
		 * This method help us to verify already a member text is present or not and get the text
		 * @param no parameters 
		 * @return this
		 * @throws Exception
		 */
		public CreateAccountPage verifyAlreadyMember() throws Exception{
			Log.info("verifiction of already a member text");

			element = setElement(alreadyMember);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "already a member text is not present");
			text = getText(alreadyMember);
			System.out.println("the text is ::"+text);
			return this;
		}
		
		/**
		 * Author Gowtham
		 * This method help us to upload the resume
		 * @param no parameters 
		 * @return this
		 * @throws Exception
		 */
		public CreateAccountPage upLoadResume() throws Exception{
			Log.info("verifiction of resume upload field");

			element = setElement(upLoadFileField);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "upload resume field is not displayed");
			element.sendKeys(MonsterIndiaConstants.File_Path);
			
			return this;
		}
		/**
		 * Author Gowtham
		 * This method help us to verify the resume upload error
		 * @param noparams 
		 * @return this
		 */	
		public CreateAccountPage resumeUploadErrorIsDisplayed() throws Exception{
			
			String resumeUploadErr = getText(resumeUploadError);
			Assert.assertEquals(resumeUploadErr, MonsterIndiaConstants.resumeUpload_error, "the resume upload error is not matching");
			return this;
		}
		
		/**
		 * Author Gowtham
		 * This method help us to navigate to upload resume page
		 * @param no parameters 
		 * @return this
		 * @throws Exception
		 */
		public UploadResumePage clickCreateNow() throws Exception{
			Log.info("verifiction of create now button");

			try {
				element = setElement(createAccountNow);
				flag = element.isDisplayed();
				Assert.assertTrue(flag, "create now button is not displayed");
				element.click();
				
			} catch (Exception e) {
				throw new Exception("unable to click on create now"+"clickCreateNow"+e.getLocalizedMessage());
			}
			return new UploadResumePage(driver);
		}
				

	
	
	/**
	 * Author Gowtham
	 * This method help us to verify text is present or not
	 * @param No parameters
	 * @return boolean
	 * @throws Exception
	 */
	public boolean textIsDisplyed(){
		Log.info("this log is used to verify the text present in the create account page");
		element = driver.findElement(createYourProfileText);
		flag = element.isDisplayed();
		
		if (flag) {System.out.println("text is displayed");
			
		} else { System.out.println("text is not displayed");

		}
		return flag;
	}
	/**
	 * Author Gowtham
	 * This method help us to verify First name field is present or not
	 * @param No parameters
	 * @return boolean
	 * @throws Exception
	 */
	public boolean isDisplayedFirstNameField(){
		Log.info("verifiction of first name field");

		element = driver.findElement(firstNameField);
		flag = element.isDisplayed();
		if (flag) { System.out.println("first name field is displayed");
			
		} else { System.out.println("first name field is not displayed");

		}
		flag = element.isEnabled();
		
		if (flag) { System.out.println("first name field is enabled");
			
		} else {System.out.println("first name field is disabled");

		}
		return flag;
}
	/**
	 * Author Gowtham
	 * This method help us to enter the first name
	 * @param params String firstName 
	 * @return this
	 * @throws Exception
	 */
	public CreateAccountPage enterFirstName(String firstName){
		Log.info("entering the first name");

		element = driver.findElement(firstNameField);
		element.sendKeys(firstName);
		return this;
	}	
	/**
	 * Author Gowtham
	 * This method help us to verify last name field and enter the last name
	 * @param params String lastName
	 * @return this
	 * @throws Exception
	 */
	public CreateAccountPage verifylastNameTextField(String lastName) throws Exception{
		Log.info("verifiction of last name field");

		try {
			element = driver.findElement(lastNameField);
			flag = element.isDisplayed();
			if (flag) { System.out.println("verify last name field is displayed");
				
			} else { System.out.println("verify last name field is not displayed");

			}
			flag = element.isEnabled();
			if (flag) { System.out.println("verify last name field is enabled");
			
			} else { System.out.println("verify last name field is not enabled");

			}
			element.sendKeys(lastName);
			
		} catch (Exception e) {
			throw new Exception("Failed while entering last name::"+"verifylastnameTextField::"+e.getLocalizedMessage());			
	
		}
		return this;
		
}
	/**
	 * Author Gowtham
	 * This method help us to verify email id field and enter the email id
	 * @param params String emailId
	 * @return this
	 * @throws Exception
	 */
	public CreateAccountPage verifyEmailIdTextField(String emailId) throws Exception{
		Log.info("verifiction of emailid field");

		try {
			element = driver.findElement(eMailIdField);
			flag = element.isDisplayed();
			if (flag) { System.out.println("verify email id field is displayed");
			
			} else { System.out.println("verify email id field is not displayed");

			}
			flag = element.isEnabled();
			if (flag) { System.out.println("verify email id field is enabled");
			
			} else { System.out.println("verify email id field is not enabled");

			}
			element.sendKeys(emailId);
		} catch (Exception e) {
			throw new Exception("Failed while entering email id::"+"verifyEmailIdTextField::"+e.getLocalizedMessage());			

		}
		return this;
		
		/**
		 * Author Gowtham
		 * This method help us to verify password field and enter the password
		 * @param params String passWord
		 * @return this
		 * @throws Exception
		 */
}
	public CreateAccountPage verifyPassWordTextField(String passWord) throws Exception{
		Log.info("verifiction of password field");

		try {
		element = driver.findElement(passWordField);
		flag = element.isDisplayed();
		if (flag) { System.out.println(" password field is displayed");
		
		} else { System.out.println("password field is not displayed");

		}
		flag = element.isEnabled();
		if (flag) { System.out.println("password field is enabled");
		
		} else { System.out.println("password field is  disabled");

		}
		element.sendKeys(passWord);
		}
		catch (Exception e) {
			throw new Exception("Failed while entering the password::"+"verifyPassWordTextField::"+e.getLocalizedMessage());			
		}
		return this;
	}
	/**
	 * Author Gowtham
	 * This method help us to verify current location and select the location
	 * @param no parameters
	 * @return this
	 * @throws Exception
	 */
	public CreateAccountPage verifyCurrentLocationTextField() throws Exception{
		Log.info("verifiction of current location field");

		try {

			element = driver.findElement(currentLocationField);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "element is not displayed");
			flag = element.isEnabled();
			Assert.assertTrue(flag, "text box is not enabled");
			element.click();
			Actions action = new Actions(driver);

			element = driver.findElement(currentLocationDropDown);
			action.moveToElement(element);
			action.click().build().perform();
			//Select location = new Select(driver.findElement(currentLocationField));
			//location.selectByVisibleText(currentLocation);
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} catch (Exception e) {
			throw new Exception("Failed while selecting location::"+"verifyCurrentLocationTextField"+e.getLocalizedMessage());			
		}
		return this;
}
	/**
	 * Author Gowtham
	 * This method help us to verify mobile field and enter the mobile number
	 * @param params String mobileNumber
	 * @return this
	 * @throws Exception
	 */
	public CreateAccountPage verifyMobileNumberField(String mobileNumber) throws Exception{
		Log.info("verifiction of mobile number field");

		try {
			element = driver.findElement(mobileNumberField);
			flag = element.isDisplayed();
			if (flag) { System.out.println("moblile number field is displayed");
			
			} else { System.out.println("mobile number field is not displayed");

			}
			flag = element.isEnabled();
			if (flag) { System.out.println("mobile number field is enabled");
			
			} else { System.out.println("mobile number field is disabled");

			}
			element.sendKeys(mobileNumber);
			
		} catch (Exception e) {
			throw new Exception("Failed while entering the mobile number::"+"verify mobile number Field"+e.getLocalizedMessage());			
	
		}
		return this;
		
}
	/**
	 * Author Gowtham
	 * This method help us to verify total experience field and select the year and month
	 * @param no parameters
	 * @return this
	 * @throws Exception
	 */
	public CreateAccountPage verifyTotalExperienceField() throws Exception{
		Log.info("verifiction of total experience ");

		try {
			element = driver.findElement(totalExperienceField);
			element.click();
			Actions action = new Actions(driver);
					
			element = driver.findElement(numberOfYear);
			action.moveToElement(element);
			action.click().build().perform();
			element = driver.findElement(numberOfMonths);
			action.moveToElement(element);
			action.click().build().perform();
			element = driver.findElement(closeExperienceWindow);
			action.moveToElement(element);
			action.click().build().perform();
			
		} catch (Exception e) {
			throw new Exception("pop up window can not be handled::"+"verifyTotalExperienceField::"+e.getLocalizedMessage());
		
		}
		
		return this;		
		
}
	
	/**
	 * Author Gowtham
	 * This method help us to verify key skills field and enter the last key skills
	 * @param params String keySkills
	 * @return this
	 * @throws Exception
	 */
	public CreateAccountPage verifyKeySkillsField(String keySkills) throws Exception{
		Log.info("verifiction of skills field");

		try {
			element = driver.findElement(keySkillsField);
			flag = element.isDisplayed();
			if (flag) { System.out.println("key skills field is displayed");
			
			} else { System.out.println("key skills field is not displayed");

			}			
			flag = element.isEnabled();
			if (flag) { System.out.println("key skills field is enabled");
			
			} else { System.out.println("key skills field is not disabled");

			}			
			element.sendKeys(keySkills);
			
		} catch (Exception e) {
			throw new Exception("key skills set field is failed::"+"verifyKeySkillsField::"+e.getLocalizedMessage());

			
		}
		return this;
		
}
	/**
	 * Author Gowtham
	 * This method help us to verify industry field and select the industry
	 * @param no parameters 
	 * @return this
	 * @throws Exception
	 */
	public CreateAccountPage verifyIndustryField() throws Exception{
		Log.info("verifiction of industry field");

		try {
			Actions action = new Actions(driver);
			element = driver.findElement(industryField);
			element.click();
			element = driver.findElement(industrySelected);
			action.moveToElement(element);
			action.click().build().perform();
			element = driver.findElement(closeIndustry);
			action.moveToElement(element);
			action.click().build().perform();
			
			
		} catch (Exception e) {
			throw new Exception("industry drop down value is not selected::"+"verifyIndustryField::"+e.getLocalizedMessage());
		}
		
		return this;
		
}
	/**
	 * Author Gowtham
	 * This method help us to verify functions field and select the functions
	 * @param no parameters
	 * @return this
	 * @throws Exception
	 */
	public CreateAccountPage veifyFunctionField() throws Exception{
		
		Log.info("verifiction of functional field");

		try {
			Actions action = new Actions(driver);
			element = driver.findElement(functionField);
			element.click();
			element = driver.findElement(selectedFunctionalArea);
			action.moveToElement(element);
			action.click().build().perform();
			element = driver.findElement(closeFunctional);
			action.moveToElement(element);
			action.click().build().perform();
			
			
		} catch (Exception e) {
			throw new Exception("functional field value is not selected::"+"verifyFunctionalField::"+e.getLocalizedMessage());

		}
		return this;
	}	
		public CreateAccountPage windowHandlesUpLoadResume() throws Exception{
			Log.info("verifiction of links present in the create account page");

			try {
				//String expTitle = "Monster Privacy Commitment, Resume, Job Seeker Contact Information Access on job site - MonsterIndia.com";
				String parentWindow = driver.getWindowHandle();
				element = driver.findElement(privacyStatementLink);
				flag = element.isDisplayed();
				if (flag) { System.out.println("privacy statement link is displayed");
				
				} else { System.out.println("privacy statement link is not displayed");

				}
				//text = element.getText();
				element.click();
				Thread.sleep(5000);
				//String actTitle = driver.getTitle();
				//Assert.assertEquals(actTitle, expTitle, "actual title not matching");
				driver.switchTo().window(parentWindow);
				element = driver.findElement(termsOfUseLink);
				if (flag) { System.out.println("terms of use link is displayed");
				
				} else { System.out.println("terms of use link is not displayed");

				}
				element.click();
				Thread.sleep(3000);
				driver.switchTo().window(parentWindow);
				element = driver.findElement(defaultPreferencesLink);
				if (flag) { System.out.println("default preferences link is displayed");
				
				} else { System.out.println("default preferences link is not displayed");

				}
				element.click();
				Thread.sleep(3000);
				driver.switchTo().window(parentWindow);
				
			} catch (Exception e) {
				throw new Exception("un able to get the title of privacy link"+"windowHandlesUpLoadResume::"+e.getLocalizedMessage());
			}
			
			return this;
			
		}
		
		
		
		
		
		
		
		
		
		/**
		 * Author Gowtham
		 * This method help us to verify number of employees present and get the values 
		 * @param no parameters 
		 * @return this
		 * @throws Exception
		 */
		public CreateAccountPage numberOfEmployees(){
			Log.info("verifiction of number of employees");

			element = driver.findElement(findEpmloyee);
			flag = element.isDisplayed();
			if (flag) { System.out.println("number of employees value is displyed");
				
			} else { System.out.println("number of employees value is not displyed");

			}
			text = element.getText();
			System.out.println("number of employees::"+text);
			return this;
		}
	
		
		
		
		
		
}
