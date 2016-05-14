package com.tr.pages;

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

	/**
	 * Author Gowtham
	 * This method help us to select the nationality
	 * @param no parameters 
	 * @return this
	 * @throws Exception
	 */
	public UploadResumePage selectNationality(String country){
		Log.info("verifiction of nationality drop down");

		element = driver.findElement(nationality);
		element.click();
		
		element = driver.findElement(searchField);
		element.sendKeys(country);
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ENTER);
		
		String text = element.getAttribute("value");
		System.out.println("the selected country is::"+text);
		
		return this;
	}
	
	/**
	 * Author Gowtham
	 * This method help us to select the gender
	 * @param no parameters 
	 * @return this
	 * @throws Exception
	 */
	public UploadResumePage selectGender(){
		Log.info("verifiction of gender button");

		element = driver.findElement(gender);
		flag = element.isDisplayed();
		System.out.println("the male button is displayed::"+flag);
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
	public UploadResumePage dateOfBirth() {
		Log.info("verifiction of date of birth drop down");

		element = driver.findElement(dobDateClick);
		element.click();
		element = driver.findElement(dobSelectDate);
		element.click();
		text = element.getAttribute("value");
		System.out.println("the selected date is::"+text);
	
		element = driver.findElement(dobMonthClick);
		element.click();
		element = driver.findElement(dobSelectMonth);
		element.click();
		text = element.getAttribute("value");
		System.out.println("the selected month is::"+text);
		
		element = driver.findElement(dobYear);
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
			WebDriverWait wait = new WebDriverWait(driver, 15); 
			
			
			element = driver.findElement(jobType);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "job type text field is not displayed");
			element.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(jobType));
			
			element = driver.findElement(jobTypePermanent);
			element.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(jobTypePermanent));

			
			element = driver.findElement(jobTypeField);
			text = element.getAttribute("value");
			System.out.println("preferred job type is::"+text);
			text = element.getAttribute("value");
			System.out.println("the selected job type is::"+text);
			element = driver.findElement(closeJobType);
			Actions action = new Actions(driver);
			action.moveToElement(element);
			action.click().build().perform();
			
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
			WebDriverWait wait = new WebDriverWait(driver, 15); 

			element = driver.findElement(preferredJobLocation);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "the job ocation field is not displayed");
			wait.until(ExpectedConditions.visibilityOfElementLocated(preferredJobLocation));
			element.click();
			
			element = driver.findElement(selectPreferredJobLocation);
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectPreferredJobLocation));
			element.click();
			
			element = driver.findElement(jobLocationField);
			text = element.getAttribute("value");
			System.out.println("preferred job location is::"+text);
			
			element = driver.findElement(closePrefferedJobLocation);
			Actions action = new Actions(driver);
			action.moveToElement(element);
			action.click().build().perform();
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
			WebDriverWait wait = new WebDriverWait(driver, 15);
			element = driver.findElement(roles);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "job role is not displayed");
			wait.until(ExpectedConditions.visibilityOfElementLocated(roles));
			element.click();

			element = driver.findElement(jobRole);
			wait.until(ExpectedConditions.visibilityOfElementLocated(jobRole));
			element.click();
			
			element = driver.findElement(rolesField);
			text = element.getAttribute("value");
			System.out.println("the selected job role is::"+text);
			
			element = driver.findElement(roleClose);
			Actions action = new Actions(driver);
			action.moveToElement(element);
			action.click().build().perform();
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
			WebDriverWait wait = new WebDriverWait(driver, 15);
			element = driver.findElement(skills);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "skills field is not displayed");
			wait.until(ExpectedConditions.visibilityOfElementLocated(skills));
			element.click();
			
			element = driver.findElement(enterSkills);
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
			WebDriverWait wait = new WebDriverWait(driver, 15);
			element = driver.findElement(experienceLevel);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "experience field is not displayed");
			wait.until(ExpectedConditions.visibilityOfElementLocated(experienceLevel));
			element.click();
			
			element = driver.findElement(experienceYear);
			wait.until(ExpectedConditions.visibilityOfElementLocated(experienceYear));
			element.click();
			
			element = driver.findElement(experiencrField);
			text = element.getAttribute("value");
			System.out.println("the selected experience is::"+text);
			
			element = driver.findElement(closeExperience);
			wait.until(ExpectedConditions.visibilityOfElementLocated(closeExperience));
			element.click();
		} catch (Exception e) {
			System.out.println("element not found"+"selectExperience"+e.getLocalizedMessage());
		}
		return this;
	}
	
	public UploadResumePage workHistory(String designation, String company){
		Log.info("verifiction designation and company field");

		element = driver.findElement(designations);
		flag = element.isEnabled();
		if (flag) { System.out.println("designation field is enabled");
			
		} else { System.out.println("designation field is disabled");

		}
		element.clear();
		element.sendKeys(designation);
		
		element = driver.findElement(companyName);
		flag = element.isEnabled();
		if (flag) { System.out.println("comapany name field is displayed");
			
		} else {  System.out.println("comapany name field is displayed");

		}
		element.clear();
		element.sendKeys(company);
		
		return this;
		
	}
	
	public UploadResumePage noticePeriods(){
		Log.info("verifiction of notice period drop down");

		try {
			WebDriverWait wait = new WebDriverWait(driver, 15);

			element = driver.findElement(noticePeriod);
			flag = element.isDisplayed();
			if (flag) { System.out.println("notice period element is displayed");
				
			} else { System.out.println("notice period element is not displayed ");
			}
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(noticePeriod));

			element.click();
			
			element= driver.findElement(noticePeriodValues);
			wait.until(ExpectedConditions.visibilityOfElementLocated(noticePeriodValues));

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
			WebDriverWait wait = new WebDriverWait(driver, 15);

			element = driver.findElement(highestQualification);
			flag = element.isDisplayed();
			if (flag) { System.out.println("qualification field is displayd");
				
			} else {
				System.out.println("qualification field is not displayd");
			}
			wait.until(ExpectedConditions.visibilityOfElementLocated(highestQualification));

			element.click();
			
			element = driver.findElement(selectHighestQualification);
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectHighestQualification));

			element.click();
			
			element = driver.findElement(highestQualification);
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
			
			WebDriverWait wait = new WebDriverWait(driver, 20);

			element = driver.findElement(specialization);
			flag = element.isDisplayed();
			if (flag) { System.out.println("specialization field is displayd");
				
			} else {
				System.out.println("specialization field is not displayd");
			}
			wait.until(ExpectedConditions.visibilityOfElementLocated(specialization));

			element.click();
			
			element = driver.findElement(selectSpecialization);
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectSpecialization));
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
	public UploadResumePage passedOutYear(){
		Log.info("verifiction of passed out year drop down");

		WebDriverWait wait = new WebDriverWait(driver, 20);

		element = driver.findElement(yearOfPassing);
		flag = element.isDisplayed();
		if (flag) { System.out.println("year of passing field is displayd");
			
		} else {
			System.out.println("year of passing field is not displayd");
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(yearOfPassing));

		element.click();
		
		element = driver.findElement(selectYearOfPassing);
		wait.until(ExpectedConditions.visibilityOfElementLocated(selectYearOfPassing));

		element.click();
		
		element = driver.findElement(yearOfPassing);
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
	public UploadResumePage selectInstitution(){
		Log.info("verifiction of institution drop down");

		WebDriverWait wait = new WebDriverWait(driver, 20);

		element = driver.findElement(institution);
		flag = element.isDisplayed();
		if (flag) { System.out.println("institution field is displayd");
			
		} else {
			System.out.println("institution field is not displayd");
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(institution));

		element.click();
		
		element = driver.findElement(institutionName);
		wait.until(ExpectedConditions.visibilityOfElementLocated(institutionName));

		element.click();
		
		element = driver.findElement(institution);
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
	public UploadResumePage languageField(String languages){
		Log.info("verifiction of language field"+languages);

		element = driver.findElement(languageKnown);
		flag = element.isDisplayed();
		if (flag) { System.out.println("language field is displayed");
			
		} else {  System.out.println("language field is not displayed");

		}
		
		element.sendKeys(languages);
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
	public UploadResumePage languageReadSpeakWrite(){
		Log.info("verifiction of read speak and write languages");

		element = driver.findElement(read);
		flag = element.isEnabled();
		if (flag) { System.out.println("language read field is enabled");
			
		} else {  System.out.println("language read field is not enabled");

		}
		element.click();
		element = driver.findElement(write);
		flag = element.isEnabled();
		if (flag) { System.out.println("language write field is enabled");
			
		} else {  System.out.println("language write field is not enabled");

		}
		element.click();
		element = driver.findElement(speak);
		flag = element.isEnabled();
		if (flag) { System.out.println("language speak field is enabled");
			
		} else {  System.out.println("language speak field is not enabled");

		}
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
			element = driver.findElement(submit);
			flag = element.isDisplayed();
			if (flag) { System.out.println("submit button is displayed");
				
			} else {  System.out.println("submit button is not displayed");

			}
			element.click();
			
		} catch (Exception e) {
			throw new Exception("unable to click on skip and continue"+"clickSkipContinue"+e.getLocalizedMessage());
		}
		return new SelectYourAvatarPage(driver);
	}
}
