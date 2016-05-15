package com.tr.pages;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.tr.util.BasePageObject;

public class UploadResumePage extends BasePageObject{

	/**
	 * @author Gowtham
	 */
	boolean flag = false;
	String text = null;
	WebElement element;
	
	
	public UploadResumePage(WebDriver driver) {
		super(driver);
	}
	By skipAndContinue = By.linkText("Skip & Continue »");
	By nationality = By.id("s2id_nationality");
	By searchField = By.id("s2id_autogen4_search");
	By indian = By.xpath("//div[@id='select2-result-label-454']//span[contains(.,'Indian')]");////ul[@id='select2-results-4']/li
	By selectCountry = By.xpath("//ul[@id='select2-results-4']//div[@id='select2-result-label-1906']/span");
	By gender = By.id("gender1_label");
	By dobDateClick = By.id("dob_dd_id");
	By dobSelectDate = By.xpath("//div[@data-id='parent_dob_dd']//a[@data-id='6']");
	By dobMonthClick = By.id("dob_mm_id");
	By dobSelectMonth = By.xpath("//div[@data-id='parent_dob_mm']//a[@data-id='4']");
	By dobYear = By.id("dob_yy_id");
	By dobSelectYear = By.xpath("//div[@data-id='parent_dob_yy']//a[@data-id='1990']");
	By jobType = By.id("jobType_value");
	By jobTypeField = By.id("jobType_typeahead");
	By jobTypePermanent = By.id("other_jobType_full_val");
	By closeJobType = By.xpath("//div[@class='right clip_image closedropdown']");
	//job type = Permanent Full Time;
	By openToWorkInStartUp = By.id("startupWork");
	By preferredJobLocation = By.id("pref_location");
	By jobLocationField = By.id("pref_location_typeahead");
	By selectPreferredJobLocation = By.xpath("//div[@id='other_pref_location_2_val']");
	By closePrefferedJobLocation = By.xpath("//div[@class='right clip_image closedropdown']");
	//job location = Bengaluru / Bangalore;
	By locationId = By.id("other_pref_location_2_check");
	By closeLocation = By.xpath("//div[@class='right clip_image closedropdown']");
	By roles = By.id("selRol");
	By rolesField = By.id("selRol_typeahead");
	By jobRole = By.id("top_selRol_746_check");
	By roleClose = By.xpath("//div[@class='right clip_image closedropdown']");
	By skills = By.id("select2-chosen-1");
	By enterSkills = By.id("s2id_autogen1_search");
	By experienceLevel = By.id("expSkill1");
	By experienceYear = By.id("skill_exp12");
	By experiencrField = By.id("expSkill_1_value");
	By closeExperience = By.xpath("//div[@class='right clip_image closedropdown']");
	
	By fromDate = By.id("wh_date_from1");
	By selectMonthDropDown = By.xpath("//select[@class='ui-datepicker-month']");
	By selectYeadDropDown = By.xpath("//select[@class='ui-datepicker-year']");
	By toDate = By.id("wh_date_to1");
	By selectToDateDropDownMonth = By.xpath("//select[@class='ui-datepicker-month']");
	By selectToDateDropDownYear = By.xpath("//select[@class='ui-datepicker-year']");

	By salary = By.id("sal1");
	By salaryLacs = By.xpath("//div/label/div/div/input[@name='SalLac1']");
	By salaryThousands = By.xpath("//div/label/div/div/input[@name='SalTh1']");
	By closeSalary = By.xpath("//div[@class='right clip_image closedropdown']");
	
	//Project Worked on
	By projectTitle = By.id("proj_title_1");
	By projectFromDate = By.id("proj_from_date_1");
	By projectFromDateMonth = By.xpath("//select[@class='ui-datepicker-month']");
	By projectFromDateYear = By.xpath("//select[@class='ui-datepicker-year']");
	
	By projectToDate = By.id("proj_to_date_1");
	By projectToDateMonth = By.xpath("//select[@class='ui-datepicker-month']");
	By projectTodateYear = By.xpath("//select[@class='ui-datepicker-year']");
	By descriptionOfProject = By.id("proj_descr_1");
	
	//work history
	
	By designations = By.id("designation_1");
	By companyName = By.id("company_name_1");
		
	By noticePeriod = By.id("notice_period");
	By noticePeriodValues = By.xpath("//div[@data-id='parent_notice_period']//a[@data-id='15D']");
	
	//Qualification
	
	By highestQualification = By.id("highest_degree");
	By selectHighestQualification = By.xpath("//div[@data-id='parent_highest_degree']//a[@data-id='8']");
	
	By specialization = By.id("highest_specialization_id");
	By selectSpecialization = By.xpath("//div[@id='highest_specialization_container']//a[@data-id='30']");
	
	By yearOfPassing = By.id("highest_passYear_id");
	By selectYearOfPassing = By.xpath("//div[@id='highest_passYear_container']//a[@data-id='2012']");
	By institution = By.id("highest_institute_id");
	By institutionName = By.xpath("//div[@id='highest_institute_container']//a[@data-id='679:0']");
	
	
	//certificate
	
	By certificateName = By.id("certi_name_1");
	By issuedBy = By.id("certi_issuedBy_1");
	By issuedDate = By.id("certi_validity_1");
	By issuedMonth = By.xpath("//select[@class='ui-datepicker-month']");
	By issuedYear = By.xpath("//select[@class='ui-datepicker-year']");
	
	//upload photograph
	
	By upLoadPhotoGraph = By.id("imgupload_id");
	By selectImage = By.id("wordresume2");
	
	//Language known
	
	By languageKnown = By.id("lang1_id");
	By read = By.id("lang1read1_label");
	By write = By.id("lang1write1_label");
	By speak = By.id("lang1spk1_label");
	
	By alternativeEmail = By.id("alt_email_id");
	
	//Affirmative actions
	
	By category = By.id("infirm_category_id");
	By disability = By.id("infirm_disability2_label");
	
	//submit button
	
	By submit = By.id("submit1_id");
	private static Logger Log = Logger.getLogger(Logger.class.getName());

	/**
	 * Author Gowtham
	 * This method help us to select the nationality
	 * @param no parameters 
	 * @return this
	 * @throws Exception
	 */
	public UploadResumePage selectNationality(String country){
		Log.info("selecting the nationality");

		try {
			element = setElement(nationality);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "nationality drop down is not present");
			element.click();
			
			element = setElement(searchField);
			element.sendKeys(country);
			element.sendKeys(Keys.ARROW_DOWN);
			element.sendKeys(Keys.ENTER);
			
			String text = element.getAttribute("value");
			System.out.println("the selected country is::"+text);
			
		} catch (Exception e) {
			System.out.println("unable to select nationality"+"selectNationality"+e.getLocalizedMessage());
		}
		Log.info("nationality is successfully selected");

		return this;
	}
	
	/**
	 * Author Gowtham
	 * This method help us to select the gender
	 * @param no parameters 
	 * @return this
	 * @throws Exception
	 */
	public UploadResumePage selectGender() throws Exception{
		Log.info("verifiction of gender button");

		element = setElement(gender);
		flag = element.isDisplayed();
		Assert.assertTrue(flag, "gender button is not displayed");
		element.click();
		
		return this;
		
	}
	
	/**
	 * Author Gowtham
	 * This method help us to enter the date of birth
	 * @param no parameters 
	 * @return this
	 * @throws Exception
	 */
	public UploadResumePage dateOfBirth() throws Exception {
		Log.info("verifiction of date of birth drop down");

		element = setElement(dobDateClick);
		flag = element.isDisplayed();
		Assert.assertTrue(flag, "date of birth element is not present");
		element.click();
		
		element = setElement(dobSelectDate);
		flag = element.isDisplayed();
		Assert.assertTrue(flag, "dob select date is not present");
		element.click();
		text = element.getAttribute("value");
		System.out.println("the selected date is::"+text);
	
		element = setElement(dobMonthClick);
		flag = element.isDisplayed();
		Assert.assertTrue(flag, "dob month select is not displayed");
		element.click();
		
		element = setElement(dobSelectMonth);
		element.click();
		text = element.getAttribute("value");
		System.out.println("the selected month is::"+text);
		
		element = setElement(dobYear);
		flag = element.isDisplayed();
		Assert.assertTrue(flag, "dob year select is not displayed");
		element.click();
		element = driver.findElement(dobSelectYear);
		element.click();
		text = element.getAttribute("value");
		System.out.println("th selected year is::"+text);
		return this;
		}
	
	/**
	 * Author Gowtham
	 * This method help us to select the job type
	 * @param no parameters 
	 * @return this
	 * @throws Exception
	 */
	public UploadResumePage selectJobType(){
		Log.info("verifiction of select job type drop down");

		try {	
			
			element = setElement(jobType);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "job type text field is not displayed");
			element.click();			
			element = driver.findElement(jobTypePermanent);
			element.click();
			
			element = setElement(jobTypeField);
			text = element.getAttribute("value");
			System.out.println("preferred job type is::"+text);
			text = element.getAttribute("value");
			System.out.println("the selected job type is::"+text);
			element = driver.findElement(closeJobType);
			Actions action = new Actions(driver);
			action.moveToElement(element);
			action.click().build().perform();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("unable to select the element"+"selectJobType"+e.getLocalizedMessage());;
		}
		return this;
	}
	
	/**
	 * Author Gowtham
	 * This method help us to select the preferred job location
	 * @param no parameters 
	 * @return this
	 * @throws Exception
	 */
	public UploadResumePage preferredJobLocation(){
		Log.info("verifiction of preferred job location drop down");

		try {

			element = setElement(preferredJobLocation);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "the job ocation field is not displayed");
			element.click();
			
			element = setElement(selectPreferredJobLocation);
			element.click();
			
			element = setElement(jobLocationField);
			text = element.getAttribute("value");
			System.out.println("preferred job location is::"+text);
			
			element = setElement(closePrefferedJobLocation);
			Actions action = new Actions(driver);
			action.moveToElement(element);
			action.click().build().perform();
			Thread.sleep(5000);
		} catch (Exception e) {
				System.out.println("element not found"+"preferredJobLocation"+e.getLocalizedMessage());
		}
		return this;
	}
	
	/**
	 * Author Gowtham
	 * This method help us to select the job role
	 * @param no parameters 
	 * @return this
	 * @throws Exception
	 */
	public UploadResumePage selectJobRole(){
		Log.info("verifiction of select job role field");

		try {
			element = setElement(roles);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "job role is not displayed");
			element.click();

			element = driver.findElement(jobRole);
			element.click();
			
			element = setElement(rolesField);
			text = element.getAttribute("value");
			System.out.println("the selected job role is::"+text);
			
			element = setElement(roleClose);
			Actions action = new Actions(driver);
			action.moveToElement(element);
			action.click().build().perform();
			Thread.sleep(5000);
		} catch (Exception e) {
				System.out.println("element not found"+"selectJobRole"+e.getLocalizedMessage());
		}
		return this;	
	}
	/**
	 * Author Gowtham
	 * This method help us to select the key skills
	 * @param no parameters 
	 * @return this
	 * @throws Exception
	 */
	public UploadResumePage selectSkills(String skill){
		Log.info("verifiction of select skills drop down");

		try {
			element = setElement(skills);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "skills field is not displayed");
			element.click();
			
			element = setElement(enterSkills);
			element.sendKeys(skill);
			element.sendKeys(Keys.ENTER);
			text = element.getAttribute("values");
			System.out.println("enterd key skills is::"+text);
		} catch (Exception e) {
					System.out.println("element not found"+"selectSkills"+e.getLocalizedMessage());
		}
		return this;
	}
	
	/**
	 * Author Gowtham
	 * This method help us to experience
	 * @param no parameters 
	 * @return this
	 * @throws Exception
	 */
	public UploadResumePage selectExperience(){
		Log.info("verifiction of select experience drop down");

		try {
			element = setElement(experienceLevel);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "experience field is not displayed");
			element.click();
			
			element = setElement(experienceYear);
			element.click();
			
			element = setElement(experiencrField);
			text = element.getAttribute("value");
			System.out.println("the selected experience is::"+text);
			
			element = driver.findElement(closeExperience);
			element.click();
		} catch (Exception e) {
			System.out.println("element not found"+"selectExperience"+e.getLocalizedMessage());
		}
		return this;
	}
	
	public UploadResumePage workHistory(String designation, String company) throws Exception{
		Log.info("verifiction designation and company field");

		element = setElement(designations);
		flag = element.isDisplayed();
		Assert.assertTrue(flag, "designation field is not displayed");
		if (element.isEnabled()) {
			clearAndEnterValueInTextBox(designations, designation);
		}
		
		element = setElement(companyName);
		flag = element.isDisplayed();
		Assert.assertTrue(flag, "company name field is not displayed");

		if (element.isEnabled()) { 
			clearAndEnterValueInTextBox(companyName, company);

		}
		
		return this;
		
	}
	
	public UploadResumePage noticePeriods(){
		Log.info("verifiction of notice period drop down");

		try {

			element = setElement(noticePeriod);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "notice period field is not displayed");
			element.click();
			
			element= setElement(noticePeriodValues);
			element.click();
			
		} catch (Exception e) {
			System.out.println("element not found"+"noticePeriods"+e.getLocalizedMessage());
		}
		
		return this;
	}
	
	/**
	 * Author Gowtham
	 * This method help us to select the qualification
	 * @param no parameters 
	 * @return this
	 * @throws Exception
	 */
	public UploadResumePage qualificationSelect(){
		Log.info("verifiction of qualification drop down");

		try {

			element = setElement(highestQualification);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "highest qualification drop down is not displayed");
			element.click();
			
			
			element = setElement(selectHighestQualification);

			element.click();
			
			element = setElement(highestQualification);
			text = element.getAttribute("value");
			System.out.println("the selected qualification is::"+text);
		} catch (Exception e) {
				System.out.println("element not found"+"qualificationSelect"+e.getLocalizedMessage());
		}
		return this;
	}
	
	/**
	 * Author Gowtham
	 * This method help us to select the specialization
	 * @param no parameters 
	 * @return this
	 * @throws Exception
	 */
	public UploadResumePage specializationSelect(){
		Log.info("verifiction of specialization drop down");

		try {
			
			element = setElement(specialization);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "specialization drop down is not displayed");

			element.click();
			
			element = setElement(selectSpecialization);
			element.click();
			
			element = driver.findElement(specialization);
			text = element.getAttribute("value");
			System.out.println("the selected specialization is::"+text);
		} catch (Exception e) {
				System.out.println("element not found"+"specializationSelect"+e.getLocalizedMessage());
		}
		return this;
		
	}
	
	/**
	 * Author Gowtham
	 * This method help us to select the passed out year
	 * @param no parameters 
	 * @return this
	 * @throws Exception
	 */
	public UploadResumePage passedOutYearSelect() throws Exception{
		Log.info("verifiction of passed out year drop down");

		element = setElement(yearOfPassing);
		flag = element.isDisplayed();
		Assert.assertTrue(flag, "passed out year element is not displayed");
		element.click();
		
		element = setElement(selectYearOfPassing);
		element.click();
		
		element = setElement(yearOfPassing);
		text = element.getAttribute("value");
		System.out.println("the passed out year is::"+text);
		return this;
		
	}
	
	/**
	 * Author Gowtham
	 * This method help us to select the institution
	 * @param no parameters 
	 * @return this
	 * @throws Exception
	 */
	public UploadResumePage selectInstitution() throws Exception{
		Log.info("verifiction of institution drop down");

		element = setElement(institution);
		flag = element.isDisplayed();
		Assert.assertTrue(flag, "select institution drop down is not displayed");
		element.click();
		
		element = setElement(institutionName);
		element.click();
		
		element = setElement(institution);
		text = element.getAttribute("value");
		System.out.println("the selected institution is::"+text);
		return this;
	}
	
	/**
	 * Author Gowtham
	 * This method help us to give the language details
	 * @param no parameters 
	 * @return this
	 * @throws Exception
	 */
	public UploadResumePage languageField(String languages) throws Exception{
		Log.info("verifiction of language field"+languages);

		element = setElement(languageKnown);
		flag = element.isDisplayed();
		Assert.assertTrue(flag, "enter language field is not displayed");
		if (element.isEnabled()) { 
			clearAndEnterValueInTextBox(languageKnown, languages);
		}
		element.getAttribute("value");
		System.out.println("the entered languages are::"+text);
		return this;
		}
	
	/**
	 * Author Gowtham
	 * This method help us to provide the details of languages
	 * @param no parameters 
	 * @return this
	 * @throws Exception
	 */
	public UploadResumePage languageReadSpeakWrite() throws Exception{
		Log.info("verifiction of read speak and write languages");

		element = setElement(read);
		flag = element.isEnabled();
		Assert.assertTrue(flag, "language read button is not displayed");
		element.click();
		
		element = setElement(write);
		flag = element.isEnabled();
		Assert.assertTrue(flag, "language write button is not displayed");
		element.click();
		
		element = setElement(speak);
		flag = element.isEnabled();
		Assert.assertTrue(flag, "language speak button is not displayed");
		element.click();
		return this;
	}
	
	/**
	 * Author Gowtham
	 * This method help us to navigate to avtar page
	 * @param no parameters 
	 * @return this
	 * @throws Exception
	 */
	/*public SelectYourAvatarPage clickSkipContinue() throws Exception{
		
		try {
			element = driver.findElement(skipAndContinue);
			element.click();
			
		} catch (Exception e) {
			throw new Exception("unable to click on skip and continue"+"clickSkipContinue"+e.getLocalizedMessage());
		}
		return new SelectYourAvatarPage(driver);
	}*/
    public SelectYourAvatarPage clickSubmitButton() throws Exception{
		Log.info("verifiction of submit button and click");

		try {
			element = setElement(submit);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "submit button is not displayed");
			if (element.isEnabled()) { 
			element.click();
			}
		} catch (Exception e) {
			throw new Exception("unable to click on skip and continue"+"clickSkipContinue"+e.getLocalizedMessage());
		}
		return new SelectYourAvatarPage(driver);
	}
	


}
	
	
	
	
	


