package com.tr.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.tr.common.MonsterUtil;
import com.tr.util.BasePageObject;

public class MyDashbordPage extends BasePageObject {
	
	/**
	 * @author Satish 
	 */
	
	public MyDashbordPage(WebDriver driver) {
		super(driver);
	}
	//************** Declaration Area begins**************************
		WebElement element = null;
		Actions act ;
		boolean flag = false;
		String txt = null;
		String Str_pagetitle = null;
		String Str_username = null;
		String Str_phoneno = null;
		String Str_phoneverified = null;
		String Str_email = null;
		String Str_emailverified = null;
		String Str_lastupdated = null;
		List<WebElement>tabslist = new ArrayList<WebElement>();
		List<WebElement>view = new ArrayList<WebElement>();
		String tabclass = null;
		String tabtitle = null;
		String job = null;
		int count;
	//*********************************** web elements locators *****************************************************	
		By pageid = By.id("light_profilecomp");
		By donotaskagain = By.xpath("//a[contains(.,'Do not Display Again')]");
		By img_profilepic = By.xpath("//img[@class='round_ie']");
		By username = By.xpath("//a[@class ='mn-uname']");
		By completelink = By.xpath("//a[@class ='lft mn-cmplnk']");
		By phone =By.xpath("//div[@class ='left ar-align pf_metext']");
		By phoneverified = By.xpath("//div[@class ='left ar-align pf_metext']/span");
		By email = By.xpath("//div[@class= 'left pf_metext']");
		By emailverified = By.xpath("//div[@class= 'left pf_metext']/span");
		By lastupdated = By.xpath("//div[@class= 'mn-update']");
		By edit = By.xpath("// a[@class ='mn-uppf_btn mn-eico']");
		By tabs = By.xpath("//div[contains(@class,'tabitem')]");
		By viewbtn = By.xpath("//div[@id='jobs_like']//a[contains(@class,'apply_btn')]");
	//************ Declaration area ends ***********************************
		/**
		 * This is a constructor used to pass the driver
		 * @param driver
		 */
		
		
	/**
	* This method returns the page title.
	* @return String page title
	 * @throws Exception 
	*/
		public String pagetitle() throws Exception{
			try {
				Str_pagetitle = driver.getTitle();
			} catch (Exception e) {
				throw new Exception("FAILED TO GET THE PAGE TITLE:: "+e.getLocalizedMessage());
			}
			
			return Str_pagetitle;
		}
	/**
	 * 
	 * @return boolean flag
	 */
		public boolean ProfileCompletnessPagexists(){
			element = driver.findElement(pageid);
			flag = element.isDisplayed();
			if (flag = true ){
			System.out.println("Profile Completeness page is displayed");
			}else{
				System.out.println("Profile Completeness page is displayed");
			}
			return flag;
		}
		public void ClickDonotAskAgain(){
			element = driver.findElement(donotaskagain);
			element.click();
		
		}
		//div[@id='light_profilecomp']//a[contains(.,'Do not Display Again')]
	/**
	 * This method returns the user name displayed
	 * @return String Username
	 * @throws Exception
	 */
	// ************************ The methods  below are used to get the User info from the dash board *******************************	
		public String username() throws Exception{
			try {
				element = driver.findElement(username);
				flag = element.isDisplayed();
				Assert.assertTrue(flag, "User Name is not displayed");
				Str_username = element.getText();
			} catch (Exception e) {
				throw new Exception("USER NAME NOT FOUND:: "+e.getLocalizedMessage());
			}
			
			return Str_username;
		}
	/**
	 * This method checks if the complete link is displayed and enabled
	 * @return boolean
	 * @throws Exception
	 */

		public boolean phonedisplayed() throws Exception{
			try {
				element = driver.findElement(phone);
				flag = element.isDisplayed();
				Assert.assertTrue(flag, "Phone Number is not dispalyed and enabled");
			} catch (Exception e) {
				throw new Exception("Phone Number NOT FOUND:: "+e.getLocalizedMessage());
			}
			
			return flag;
		}
		
	/**
	 * This Method gets the Phone no.
	 * @return String Phone No.
	 * @throws Exception
	 */
		public String  Phone() throws Exception {
			try {
				element = driver.findElement(phone);
				Str_phoneno = element.getText();
			} catch (Exception e) {
				throw new Exception("Phone Number NOT FOUND:: "+e.getLocalizedMessage());
			}
			
			return Str_phoneno;
			
		}
	/**
	 * This Method retrieves the verification status of the Phone Number
	 * @return String phone verified
	 * @throws Exception
	 */
		
		public String PhoneVerify() throws Exception {
			try {
				element = driver.findElement(phoneverified);
				Str_phoneverified = element.getText();
			} catch (Exception e) {
				throw new Exception("Phone Number NOT FOUND:: "+e.getLocalizedMessage());
			}
			
			return Str_phoneverified;
			
		}
	/**
	 * This method checks if the email is displayed or not
	 * @return boolean flag
	 * @throws Exception
	 */
		public boolean emailisdisplayed() throws Exception {
			try {
				element = driver.findElement(email);
				flag = element.isDisplayed();
				Assert.assertTrue(flag, "Email is is not dispalyed and enabled");
			} catch (Exception e) {
				throw new Exception("Email Id NOT FOUND:: "+e.getLocalizedMessage());
			}
			return flag;
			
		}
	/**
	 * This method returns the email displayed
	 * @return String email id
	 * @throws Exception
	 */
		public String email() throws Exception {
			try {
				element = driver.findElement(email);
				Str_email = element.getText();
			} catch (Exception e) {
				throw new Exception("Email Id NOT FOUND:: "+e.getLocalizedMessage());
			}
			return Str_email;
		}
	//***************************** user info methods ends here ********************************************************************
		
	//****************************************** Verify the Complete link is displayed ********************************************** 
		public boolean  completelink() throws Exception {
			try {
				element = driver.findElement(completelink);
				flag = element.isDisplayed() && element.isEnabled();
				Assert.assertTrue(flag, "Complete link is not dispalyed and enabled");
			} catch (Exception e) {
				throw new Exception("USER NAME NOT FOUND:: "+e.getLocalizedMessage());
			}
			
			return flag;
		}

		// **************************** Verify the last updated **************************************************************
		
	/**
	 * This Method retrieves the last updated value
	 * @return String Last Updated
	 * @throws Exception
	 */
		public String lastupdated() throws Exception{
			try {
				element = driver.findElement(lastupdated);
				Str_lastupdated = element.getText();
			} catch (Exception e) {
				throw new Exception("LAST UPDATED NOT FOUND:: "+e.getLocalizedMessage());
			}
			return Str_lastupdated;
		}
		
	// *************************************** To verify the edit profile link exists**************************************************************
	/** 
	 * This click on edit link 
	 * @return driver to view resume page
	 * @throws Exception
	 */
		
		
		
		public ViewResumePage clickonedit() throws Exception{
			try {
				element = driver.findElement(edit);
				flag = element.isDisplayed() && element.isEnabled();
				Assert.assertTrue(flag, "Edit button is not displayed");
				element.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			} catch (Exception e) {
				throw new Exception("Edit Button NOT FOUND:: "+e.getLocalizedMessage());
			}
			return new ViewResumePage(driver);
		}
		
	//******************* Below methods are used to verify the jobs tabs ******************************************************************************
	/**
	 * This Method gets the all the tabs present in the jobs header
	 * @return List of tabs
	 * @throws Exception
	 */
		public  List<WebElement> jobstab() throws Exception{
			try {
				tabslist = driver.findElements(tabs);
			} catch (Exception e) {
				throw new Exception("Jobs Tabs NOT FOUND:: "+e.getLocalizedMessage());
			}
			return tabslist;
		}
	/**
	 * This Method prints the tab names
	 * @param tablist
	 * @throws Exception 
	 */
		public void printtabnames (List <WebElement> tablist) throws Exception{
			try {
				int count = tablist.size();
			for (int i= 0; i<count; i++){
				element =  tablist.get(i);
				String tabname = element.getText();
				System.out.println(tabname);
			}
				
			} catch (Exception e) {
				throw new Exception("Tab not found :: "+e.getLocalizedMessage());
			}
		}
		
		
	/**
	 * This Method is used to click on tab 
	 * @param String tabname
	 * @return boolean 
	 * @throws Exception
	 */
		public boolean clicktab(String tabname) throws Exception {
			try {
				By tab = By.xpath("//div[@class='ds_jobheader']//div[contains(.,'"+tabname+"')]");
				System.out.println(tab);
				element = driver.findElement(tab);
				flag = element.isDisplayed() && element.isEnabled();
				Assert.assertTrue(flag, "Tab Not present");
				element.click();
				Thread.sleep(3000);
				txt = element.getAttribute("class");
				System.out.println(txt);
				if (txt.contains("active")){
					flag = true;
					System.out.println("Tab " + tabname +" is selected");
				}else{
					System.out.println("Tab " + tabname +" is  not selected");
					flag = false;
				}
				Assert.assertTrue(flag, "Tab can not be selected");
				
			} catch (Exception e) {
				throw new Exception("Tab "+tabname +" NOT FOUND:: "+e.getLocalizedMessage());
			}
			return flag;
			
		}

		public String savejob() throws Exception{
			try {
			
				view = driver.findElements(viewbtn);
				element = view.get(1);
				act = new Actions(driver);
				act.moveToElement(element);
				
					
				
				
			} catch (Exception e) {
				throw new Exception("save job not found "+e.getLocalizedMessage());
			}
			
			return job;
		}

}

