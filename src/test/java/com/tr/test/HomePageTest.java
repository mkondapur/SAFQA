package com.tr.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.tr.common.MonsterIndiaConstants;
import com.tr.pages.MyDashbordPage;
import com.tr.pages.HomePage;
import com.tr.pages.LogOutPage;
import com.tr.pages.LoginPage;
import com.tr.pages.SearchResultPage;
import com.tr.util.BaseTestObject;
import com.tr.util.ExcelutilObject;

public class HomePageTest extends BaseTestObject{

	/**
	 * @author Manjunath H S
	 */
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	HomePage objHomePage = null;
	int count = 0;
	LoginPage objLoginPage = null;
	MyDashbordPage objDashboardPage = null;
	LogOutPage objLogOutPage = null;
	SearchResultPage objSearchResultPage = null;
	
	boolean flag;
	String actual_Result=null;
	String exp_Result=null;
	String jobTitle = null;
	String jobExp = null;
	List<String> actual_Values=null;
	
	
	@Parameters({"browserType","url"})
	@Test(priority=0, enabled=true)
	public void verifySiteLogo() throws Exception
	{
		Log.info("---> Verifying site logo <----");
	try 
	{
		objHomePage = new HomePage(driver);
		flag = objHomePage.isSiteLogoDisplayed();
		Assert.assertTrue(flag, "Site logo is not displayed");
		Log.info("---> Verifyied site logo <----");
	} 
	catch (Exception e) 
	{
		throw new Exception("FAILED CLICK ON SITELOGO AND VERFIY PAGETITLE TESTCASE" + "\n clickOnSiteLogoAndCheckThePageTitle" +e.getLocalizedMessage());
	}
	}
	
	@Parameters({"borswerType", "url"})
	@Test(priority=1, enabled=true)
	public void countHeaderText() throws Exception
	{
		Log.info("-->Counting Header Text links<--");
		try
		{
			objHomePage = new HomePage(driver);
			objHomePage.verifyHeaderCount();
			Log.info("-->Counted Header Text Links<--");			
		}
		catch (Exception e)
		{
			throw new Exception("ACTUAL AND EXPECTD COUNT NOT MARCHING:"+e.getLocalizedMessage());
			
		}
	}
	
	@Parameters({"borswerType", "url"})
	@Test(priority=2, enabled=true)
	public List<String> getHeaderName() throws Exception
	{
		Log.info("-->Getting Header Names<--");
		try
		{
			objHomePage = new HomePage(driver);
			actual_Values = objHomePage.getHeaderLinkNames();
		Log.info("Getted Header Names");
		}
		catch (Exception e)
		{
		throw new Exception("NOT DISPLAYED HEADER NAMES:"+e.getLocalizedMessage());	
		}
		return actual_Values;
	}
	
	@Parameters({"browserType","url"})
	@Test(priority=0, enabled=true)
	public void verifyTopJobs() throws Exception
	{
		Log.info("-->Verifying Top Job section<--");
	try 
	{
		objHomePage = new HomePage(driver);
		objHomePage.getTextContentFromTopJobs();
		Log.info("-->Verified Top Job section<--");
	} 
	catch (Exception e)
	{
	throw new Exception("NOT ABLE TO FIND THE TOP JOB SECTION:"+e.getLocalizedMessage());	
	}
	}
	
	@Parameters({"browserType","url"})
	@Test(priority=0, enabled=true)
	public void verifyRecruiters() throws Exception
	{
		Log.info("-->Verifying Recruiters Section<--");
		try 
		{
			objHomePage = new HomePage(driver);
			objHomePage.verifyTopRec();
			Log.info("-->Verified Recruiters Section<--");
		} 
		catch (Exception e)
		{
		throw new Exception("NOT ABLE TO FIND THE RECRUITERS SECTION:"+e.getLocalizedMessage());	
		}	
	}
	
	@Parameters({"browserType","url"})
	@Test(priority=0, enabled=true)
	public boolean TollFreeNumber() throws Exception
	{
		try
		{
			objHomePage = new HomePage(driver);
			flag = objHomePage.isTollFreeNumberPrestnt();
			Assert.assertTrue(flag,"ACTUAL AND EXPECTED TOLL FREE NUMBERS ARE NOT SAME");
		}
		catch (Exception e)
		{
			throw new Exception("NOT ABLE TO FIND TOLL FREE NUMBER:"+e.getLocalizedMessage());
		}
		return flag;
	}
	
	
	@Parameters({"browserType","url"})
	@Test(priority=1, enabled=true)
	public void verify_Jobtitle() throws Exception
	{
		Log.info("---> Searching jobs by jobtitle <----");
	try 
	{
		
		objHomePage = new HomePage(driver);
		flag = objHomePage.isSiteLogoDisplayed();
		Assert.assertTrue(flag, "Site logo is not displayed");
		jobTitle = getExcelTest(2,1);
		jobExp = getExcelTest(2,2);
		objHomePage.enterJObTitle(jobTitle);
		objHomePage.selectExperience(jobExp);
		objSearchResultPage = objHomePage.clickOnFindBetter();
		Log.info("---> Job title is verified <----");
	} 
	catch (Exception e) 
	{
		throw new Exception("FAILED CLICK VERIFYING SEARCH BY JOB TITLE " + "\n clickOnSiteLogoAndCheckThePageTitle" +e.getLocalizedMessage());
	}

	}
	
	public String getExcelTest(int row,int column) throws Exception {
		
		ExcelutilObject.setExcelFile(MonsterIndiaConstants.Path_TestData, "SearchTestData");
		return ExcelutilObject.getCellData(row, column);
		
	}
	

	public String getExpData(int row,int column) throws Exception {
		
		ExcelutilObject.setExcelFile(MonsterIndiaConstants.Path_TestData, "SearchTestData");
		return ExcelutilObject.getCellData(row, column);
		
	}
}
