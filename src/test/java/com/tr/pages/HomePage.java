package com.tr.pages;

import java.awt.RenderingHints.Key;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.tool.Extension.Param;
import org.dom4j.Branch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.internal.Extension;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.base.Splitter.MapSplitter;
import com.google.common.base.Throwables;
import com.sun.jna.platform.win32.LMAccess.LOCALGROUP_USERS_INFO_0;
import com.sun.jna.platform.win32.OaIdl.PARAMDESC;
import com.sun.jna.platform.win32.Secur32.EXTENDED_NAME_FORMAT;
import com.sun.jna.platform.win32.WinUser.MOUSEINPUT;
import com.thoughtworks.selenium.webdriven.commands.IsElementPresent;
import com.tr.common.MonsterUtil;
import com.tr.util.BasePageObject;

public class HomePage extends BasePageObject

/**
 * @author Manjunath H S
 */

{
		
	//Constructor
		public HomePage(WebDriver driver) 
		{
			super(driver);
		}
		
	/*Variables*/
		
	boolean flag = false;
	List<WebElement> list=null;
	List<String> lnk = null;
	WebElement actualList,homePageTab=null;
	int count = 0;
	int expectedCount=4;
	String ankerLinkText=null;
	Actions act;
	String outPutValue=null;
	
	String expectedCompanyJobtext = "company JOBS";
	String expectedMoreJobstext = "More Jobs»";
	String expectedEmploerstext = "Employers of Choice";
	String txt, link = null;
	
	/*Web elements*/
	
	By imgSiteLogo = By.xpath("//div[@id='header']//a[contains(@class,'logo')]");
	By lnkHeaderLinks=By.xpath("//div[contains(@class,'mn-mainnav')]//a");
	By lnkMyMonster = By.id("mn-lnk-2");
	By txtJobTitle = By.id("fts_id");
	By scltExperience=By.id("selExp");
	//By experienceOptions = By.xpath("//div[@id='exp_container_Header']//ul/li[3]/a[1]");
	By experienceOptions = By.xpath("//div[@class='single_select']/ul/li[");
	By experienceOptionsNext  = By.xpath("]/a");
	
	By txtLocation=By.id("lmy");
	By btnFindBetter = By.xpath("//input[@value='Find Better']");
	By lblTopJobs = By.xpath("//span[@class='txt lft']");
	By txtTopJobsSection = By.xpath("//div[span[contains(.,'Top Jobs')]]/following::a[1]//div[@class='tpjob_title']");
	By lblCompanyJobs = By.xpath("//Section[@id='bodysection']//h1");
	By txtTopRecruiters= By.xpath("//div[@class[contains(.,'tpjobsmain')]]/following::a[1]//div[@class='tpjobwrap clr']");
	By lnkMoreJobs = By.xpath("//div[@id='consult_container']//a[@class='lnk']");
	By lblEmployersChoice = By.xpath("//Section[@id='bodysection']//div[@Class='emplogoh']");
	By lnkSignIn = By.xpath("//div[contains(text(),'Sign in')]");
	By lblTopRecruiters=By.xpath("//div[span[contains(.,'Top recruiters')]]");
	By numTollFreeNumber = By.xpath("//span[@id='free_num_ui']/span[1]");
	/**
	 * This method helps us to find the site Logo
	 * @return boolean
	 * @param No param
	 * @throws Exception
	 */
	public boolean isSiteLogoDisplayed() throws Exception
	{
		try 
		{
			Log.info("-->Verifying the Site-Logo in Home page<--");
			flag = isElementPresent(imgSiteLogo);
			Assert.assertTrue(flag, "Site Log not displayed in Home page");
			Log.info("-->Verified Site Logo in Home Page<--");
		} 
		catch (Exception e) 
		{
			throw new Exception("Site logo is not present in Home page::"+isSiteLogoDisplayed()+e.getLocalizedMessage());
		}
		return flag;
	}
	
	/** To verify Count of links links in the home page
	 * @return int
	 * @param No param
	 * @throws Exception 
	 */
	public void verifyHeaderCount() throws Exception
	{
		try 
		{
			Log.info("-->Verifying header links Count<--");
			//List<WebElement>elements = driver.findElements(By.xpath("//div[contains(@class,'mn-mainnav')]//a"));
			list=driver.findElements(lnkHeaderLinks);
			count = list.size();
			System.out.println("Header links count::"+count);
			if (count==expectedCount)
			{
			System.out.println("Expected header link Count::"+expectedCount+"::Actual Header link count ::"+count+" are matching");	
			}
			else
			{
				System.out.println("Expected header link count::"+expectedCount+"::Actual header link count::"+count+" are not matching");
			}
			Log.info("-->Verifyed header links Count<--");
							
		} 
		catch (Exception e) 
		{
		throw new Exception("Expected and Actual header Link counts are not same::"+e.getLocalizedMessage());	
		}
		
		//return count;
	}
	
	/**
	 * Verify different Header Link Names.
	 * @return String
	 * @param No Parm
	 * @throws Exception
	 */
	public List<String> getHeaderLinkNames() throws Exception
	{
		try 
		{
			Log.info("-->Get Header Link Names from Home Page<--");
			lnk = new ArrayList<String>();
			list = driver.findElements(lnkHeaderLinks);
			for (int i = 0; i <= list.size(); i++)
			{
				outPutValue = list.get(i).getText();
				lnk.add(outPutValue);
				System.out.println("Header link Names are displayed as:"+outPutValue);
				Log.info("-->Getted Link Names in Home Page <--");
			}
			
		} 
		catch (Exception e) 
		{
			throw new Exception("Not displayed Header link Names in home page:"+e.getLocalizedMessage());
		}
		return lnk;
	}
	
		
	/**Job Title Text box is displayed and Enabled
	 * @return boolean;
	 * @param No Param
	 * @throws Exception
	 */
	public boolean isJobTitleTextBoxDisplayed() throws Exception
	{
		try
		{
		Log.info("-->Verifying the Job title text box is Dispalyed and Enabled>--");
		flag = isElementPresent(txtJobTitle);
		Assert.assertTrue(flag, "Job Title Text box is not displayed");
		if (flag)
		{
			flag = setElement(txtJobTitle).isEnabled();
			System.out.println("Job Title TextBox is Displayed and Enabled");
			Assert.assertTrue(flag, "Job Title TextBox is Displayed, but not Enabled");
		}
		else
		{
			System.out.println("Job Title TextBox is not Displayed");
		}
		Log.info("-->Verified the Job title text box status <--");
		}
		catch(Exception e)
		{
			throw new Exception("Not able to find the Job Title Text Box:"+isJobTitleTextBoxDisplayed()+e.getLocalizedMessage());
		}
		return flag;
	}
	/**
	 * Job Location Text box is displayed and Enabled
	 * @return boolean
	 * @param No param
	 * @throws Exception
	 */
	public boolean isLocationTextBoxDisplayed() throws Exception
	{
		try 
		{
		Log.info("-->Verifying the Location text box is Dispalyed and Enabled>--");
		flag = isElementPresent(txtLocation);
		Assert.assertTrue(flag, "Location text box is not displayed");
		if (flag)
		{
			flag = setElement(txtLocation).isEnabled();
			Assert.assertTrue(flag, "Location text box is displayed, but not enabled");
				
		}
		Log.info("-->Verified the Location text box status <--");
		}
		catch (Exception e) 
		{
			throw new Exception("Not able to find the Location text box:"+isLocationTextBoxDisplayed()+e.getLocalizedMessage());
		}
		return flag;
	}
	/**
	 * Job Experience Text box is displayed and Enabled
	 * @return boolean
	 * @param No Parm
	 * @throws Exception
	 */
	public boolean isExperienceTextBoxDisplayed() throws Exception
	{
		try
		{
			Log.info("-->Verifying the Experince text box is Dispalyed and Enabled>--");
			flag = isElementPresent(scltExperience);
			Assert.assertTrue(flag, "Experince drop down text box is not displayed");
			if (flag)
			{
			flag = setElement(scltExperience).isEnabled();
			Assert.assertTrue(flag, "Experience drop down text box is displayed, but not enabled");
			}
			Log.info("-->Verified the Experience text box status <--");
			
		}
		catch(Exception e)
		{
			throw new Exception("Not able to Found Experince drop down in home page:"+isExperienceTextBoxDisplayed()+e.getLocalizedMessage());
		}
		return flag;
	}
	
	/**
	 * To input jobtitle,skills.
	 * @return homePage
	 * @param String jobTitle
	 * @throws Exception
	 */
	public HomePage enterJObTitle(String jobTitle) throws Exception{
		try 
		{
			Log.info("-->Entering Job Title>--");	
			isJobTitleTextBoxDisplayed();
			clearAndEnterValueInTextBox(txtJobTitle, jobTitle);
			Log.info("-->Entered Job Title>--");
		} 
			
		catch (Exception e) 
		{
			throw new Exception("Failed while entering jobTitle"+e.getLocalizedMessage());
		}
		
		return new HomePage(driver);
	}
	
	/**
	 * To input Location
	 * @param String jobLocation
	 * @return HomePage
	 * @throws Exception
	 */
	
	public HomePage enterJobLocation(String jobLocation) throws Exception
	{
		try 
		{
			Log.info("-->Entering Job Location>--");
			isJobTitleTextBoxDisplayed();
			clearAndEnterValueInTextBox(txtLocation, jobLocation);
			Log.info("-->Entered Job Location>--");
		}
		catch (Exception e)
		{
			throw new Exception("Failed while entering Location"+e.getLocalizedMessage());
		}
		
		return new HomePage(driver);
	}
	/**
	 * To Select Location
	 * @param String jobExperince
	 * @return HomePage
	 * @throws Exception
	 */
	public HomePage selectExperience(String jobExperince) throws Exception
	{
		try 
		{
			Log.info("-->Entering Years of Experince>--");
			isExperienceTextBoxDisplayed();
			if (element.isEnabled())
			{
			element.click();
			MonsterUtil.explicitWait(2000);
			WebElement element = driver.findElement(By.xpath("//div[@class='single_select']/ul/li[2]/a"));
			element.click();
			MonsterUtil.explicitWait(2000);
//			lnk = new ArrayList<String>();
//			list = driver.findElements(experienceOptions);
//			for (int i = 1; i <= list.size(); i++)
//			{
//				outPutValue=list.get(i).getText();	
//			if (outPutValue.equals("2"))
//			{
//				element.sendKeys(Keys.ARROW_DOWN);
//				element.click();
//				break;
//			}
			
				/*outPutValue = list.get(i).getText();
				lnk.add(outPutValue);
				System.out.println("Header link Names are displayed as:"+outPutValue);
				Log.info("-->Getted Link Names in Home Page <--");*/
			}
			
			//element = setElement(experienceOptions);
			//element.click();
			
			Log.info("-->Entered Years of Experince>--");
			//}
		} 
		catch (Exception e)
		{
			throw new Exception("Failed to select Experince details"+e.getLocalizedMessage());
		}
			return new HomePage(driver);
	}
	/**
	 * Click on Find Better button.
	 * @return boolean
	 * @param No param
	 * @throws Exception
	 */
	public SearchResultPage clickOnFindBetter() throws Exception
	{
		try 
		{
			Log.info("-->Clicking on Find Better link>--");
			element = setElement(btnFindBetter);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "Find button is not displayed");
			if (flag)
			{
				flag = element.isEnabled();
				element.click();
				MonsterUtil.explicitWait(2000);
			}
			Log.info("-->Clicked on Find Better link>--");
		} 
		catch (Exception e) 
		{
		throw new Exception("Failed to click on Find Better link::"+e.getLocalizedMessage());	
		}
		
		return new SearchResultPage(driver);
	}
	
	/**
	 * Verify only Top Job Section in Home page
	 * @return Void
	 * @throws Exception
	 * @param No param
	 */
	public void verifyTopJobsSection()throws Exception
	 
	{
		String expectedTopJobstext="Top Jobs";
		try 
		{
		Log.info("-->Verifying the Top Job text in Home Page<--");
		flag = isElementPresent(lblTopJobs);
		Assert.assertTrue(flag, "Top Job section not found");
		if (flag)
		{
			txt = setElement(lblTopJobs).getText();
			Assert.assertEquals(txt, expectedTopJobstext, "Actual Top Job text:" + txt + "Expected Top Job text:"+expectedTopJobstext+"are Same");
		}
		Log.info("-->Verified the Top Job text in Home Page<--");
		}
		catch (Exception e)
		{
			throw new Exception("Expected and Actual Top Job text message are not matching:"+e.getLocalizedMessage());
		}
	}
	
	/**
	 * Checking Top Job section
	 * @return String
	 * @param No Param
	 * @throws Exception
	 */
	
	public String getTextContentFromTopJobs() throws Exception
	{
		try 
		{
			Log.info("-->Validating text contents in Top Job section--");
			verifyTopJobsSection();
			outPutValue = getText(txtTopJobsSection);
			if (outPutValue!=null)
			{
			System.out.println("Contents in Top Job Sections are::"+outPutValue);	
			}
			Log.info("-->Validated text contents in Top Job section--");
		} 
		catch (Exception e) 
		{
			throw new Exception("Not displaying any contents in Top Job section::"+getTextContentFromTopJobs()+e.getLocalizedMessage());
		}
		return outPutValue;
	}
	
	/**
	 * Checking Recruiters Section in Home page
	 * @return String
	 * @throws Exception
	 * @param No param
	 */
	public String verifyTopRec() throws Exception
	{
		String expectedTopRecText = "Top recruiters";
		try 
		{
			Log.info("-->Validating Recruiterssd--");
			flag = isElementPresent(lblTopRecruiters);
			Assert.assertTrue(flag, "Top Recruiters section not found"); 
			if (flag)
			{
				txt = setElement(lblTopRecruiters).getText();
				Assert.assertEquals(txt,lblTopRecruiters, "Actual Recruiters text is:" + txt + "Expected Recruiters text:"+expectedTopRecText+"are Same");
				outPutValue = getText(txtTopRecruiters);
				if (outPutValue!=null)
				{
					System.out.println("Contents in recruiters section are::"+outPutValue);	
				}
				else
				{
					System.out.println("Contents in the recruiters section are Empty");
				}
			} 
			Log.info("-->Validated Recruiters--");
		}
		catch (Exception e)
		{
			throw new Exception("Expected and Actual Top Recruiters text message are not matching"+verifyTopRec()+e.getLocalizedMessage());
		}
		return outPutValue;
	}
	/**
	 * Toll Free number in Home page
	 * @return boolean
	 * 
	 */
	public boolean isTollFreeNumberPrestnt() throws Exception
	{
		try 
		{
			String expectedToolFreeNumber = "1-800-4196666";
			flag = isElementPresent(numTollFreeNumber);
			Assert.assertTrue(flag, "Toll Free number not present");
			if (flag) 
			{
			txt = setElement(numTollFreeNumber).getText();
			Assert.assertEquals(txt, expectedToolFreeNumber ,"Actual Toll Free number:" + txt + "Expected Toll Free number:" + expectedToolFreeNumber + "is same");
			}
			else
			{
			System.out.println("Actual Toll Free number:"+txt+"Expected Toll Free number:"+expectedToolFreeNumber+"is NOT same");
			}
		}
		catch (Exception e)
		{
			throw new Exception("Toll Free number is not matching with valid number"+e.getLocalizedMessage());
		}
		return flag;
	}
	
	/**
	 * Click on SignIn button in the Home Page
	 * @return LoginPage
	 * @throws Exception
	 * @param String lnkSignIn;
	 */
	public LoginPage clickOnSignInButton() throws Exception
	{
		try 
		{
			element = setElement(lnkSignIn);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "Sign-In button is not present");
			element.click();
		} catch (Exception e)
		{
			throw new Exception("Not able to click on Sing-In button:"+clickOnSignInButton()+e.getLocalizedMessage());
		}
		return new LoginPage(driver);
	}
	
}
