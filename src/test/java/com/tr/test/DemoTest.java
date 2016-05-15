package com.tr.test;

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

public class DemoTest extends BaseTestObject{

	/**
	 * @author Manjunath H S
	 */
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	HomePage objHomePage = null;
	LoginPage objLoginPage = null;
	MyDashbordPage objDashboardPage = null;
	LogOutPage objLogOutPage = null;
	SearchResultPage objSearchResultPage = null;
	
	boolean flag;
	String actual_Result=null;
	String exp_Result=null;
	String jobTitle = null;
	String jobExp = null;
	
	
	//@Parameters({"browserType","url"})
	@Test(priority=0, enabled=true)
	public void verifySiteLogoAndLogin() throws Exception
	{
		Log.info("---> Verifying site logo <----");
	try 
	{
		objHomePage = new HomePage(driver);
		flag = objHomePage.isSiteLogoDisplayed();
		Assert.assertTrue(flag, "Site logo is not displayed");
		Log.info("---> Verifyied site logo <----");
		objLoginPage = objHomePage.clickOnSignInButton();
		objLoginPage.loginAsJobSeeker("manjunathreddy.kondapur@gmail.com", "manjunath123");
	} 
	catch (Exception e) 
	{
		throw new Exception("FAILED CLICK ON SITELOGO AND VERFIY PAGETITLE TESTCASE" + "\n clickOnSiteLogoAndCheckThePageTitle" +e.getLocalizedMessage());
	}

	}
	
	@Parameters({"browserType","url"})
	@Test(priority=1, enabled=true)
	public void verify_Jobtitle() throws Exception
	{
		Log.info("---> Searching jobs by jobtitle <----");
	try 
	{
		jobTitle = getExcelTest(1,1);
		jobExp = getExcelTest(1, 2);
		setExcelTest("Bangalore", 1, 3);
		System.out.println(jobExp);
		objHomePage = new HomePage(driver);
		flag = objHomePage.isSiteLogoDisplayed();
		Assert.assertTrue(flag, "Site logo is not displayed");
		objHomePage.enterJObTitle(jobTitle);
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
	
public void setExcelTest(String updateVal,int row,int column) throws Exception {
		
		ExcelutilObject.setExcelFile(MonsterIndiaConstants.Path_TestData, "SearchTestData");
		ExcelutilObject.setCellData(updateVal, row, column);
		
	}
}
