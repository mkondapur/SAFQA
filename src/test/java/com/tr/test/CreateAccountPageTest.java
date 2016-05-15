package com.tr.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.tr.pages.CreateAccountPage;
import com.tr.pages.HomePage;
import com.tr.pages.LoginPage;
import com.tr.pages.MyDashbordPage;
import com.tr.pages.SelectYourAvatarPage;
import com.tr.pages.UploadResumePage;
import com.tr.util.BaseTestObject;

public class CreateAccountPageTest extends BaseTestObject {

	/**
	 * @author Gowtham
	 */
	WebDriver driver;
	HomePage homePageMonster = null;
	CreateAccountPage createAccountPage = null;
	LoginPage monsterLoginPage = null;
	UploadResumePage uploadResumePage = null;
	SelectYourAvatarPage selectYourAvatarPage = null;
	MyDashbordPage myDashBordPage = null;
	boolean flag = false;
	String text = null;
	
	@Parameters({"browserType","url"})
		
	@Test(priority=1, enabled=true)
	public void verify_CreateaccountTest() throws Exception{
		
		createAccountPage = new CreateAccountPage(driver);
		flag = createAccountPage.isCreateYourProfileMessageDisplayed();
		Assert.assertTrue(flag, "the text is not displayed");	
		createAccountPage.enteringFirstName("Gowtham");	
		createAccountPage.enteringlastName("H S");
		createAccountPage.enteringEmailId("gowthamgowda4231@gmail.com");
		createAccountPage.enteringPassWord("gowtham12345");
		createAccountPage.selectingCurrentLocation();
		createAccountPage.enteringMobileNumber("9741199267");
		createAccountPage.selectTotalExperience();
		createAccountPage.enterKeySkills("Core JAVA, selenium,");
		createAccountPage.selectIndustry();
		createAccountPage.selectFunctions();
	}
		@Test(priority=2)
		public void verifyingSocialSitesAndTexts() throws Exception{
		flag = createAccountPage.isDisplayedGooglePlusIcon();
		Assert.assertTrue(flag, "google plus logo is not displayed");
		flag =	createAccountPage.isDisplayedFacebookIcon();
		Assert.assertTrue(flag, "facebook logo s not displayed");
		flag =	createAccountPage.isDisplayedYahooIcon();
		Assert.assertTrue(flag, "yahoo logo is not displayed");
		createAccountPage.verifyAlreadyMember();
		createAccountPage.verifyMonsterText();
		createAccountPage.getNumberOfEmployees();
		createAccountPage.verifyAlreadyMember();
		createAccountPage.verifyLinks();
		createAccountPage.upLoadResume();
		uploadResumePage =createAccountPage.clickCreateNow();	
		}
		@Test(priority=3)
		public void verifyResumeUploadPage() throws Exception{
		uploadResumePage.selectNationality("Indian");
		uploadResumePage.selectGender();			
		uploadResumePage.dateOfBirth();
		uploadResumePage.selectJobType();
		uploadResumePage.preferredJobLocation();
		uploadResumePage.selectJobRole();
		uploadResumePage.selectSkills("corejava");
		uploadResumePage.selectExperience();
		uploadResumePage.workHistory("Engineer", "abcd");
		uploadResumePage.noticePeriods();
		uploadResumePage.qualificationSelect();
		uploadResumePage.specializationSelect();
		uploadResumePage.passedOutYearSelect();
		uploadResumePage.selectInstitution();
		uploadResumePage.languageField("English,Kannada");
		uploadResumePage.languageReadSpeakWrite();
		selectYourAvatarPage = uploadResumePage.clickSubmitButton();
		}
		
		@Test(priority=4)
		public void verifyAvatarPage() throws Exception{
			selectYourAvatarPage.verifyIsAvatarSelectTextIsPresent();
			selectYourAvatarPage.selectAvatar();
			myDashBordPage = selectYourAvatarPage.clickSaveAndContinue();
		}
		
		
	
		/*@Test(priority=21)
		
		public void skipAndContinue() throws Exception{
			selectYourAvatarPage =uploadResumePage.clickSkipContinue();
		}*/
		/*@Test(priority=12)
		public void verifyLinks() throws Exception{
		createAccountMonster.windowHandlesUpLoadResume();
		}*/
		
}

