package com.tr.test;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tr.pages.ViewResumePage;
import com.tr.util.BaseTestObject;

public class ViewResumePageTest extends BaseTestObject{

	/**
	 * @author Mahesh
	 */
	
	
	ViewResumePage objViewResumePage = null;
	boolean flag;
	
	// TEST CASE TO VERIFY EXPERIENCE SECTION
	@Test
	public void verifyExperience() throws Exception
	{
		Log.info("---> Verifying Experience Section<----");
	try 
	{
		objViewResumePage = new ViewResumePage(driver);
		flag = objViewResumePage.isExperienceSectionDisplayed();
		Assert.assertTrue(flag, "Experience section is not displayed");
		Log.info("---> Verifyied Experience Section <----");
	} 
	catch (Exception e) 
	{
		throw new Exception("FAILED TO VERIFY EXPERIENCE SECTION AND VERFIY EXPERIENCE TESTCASE" + "\n isExperienceSectionDisplayed" +e.getLocalizedMessage());
	}
	}
	
	// TEST CASE TO VERIFY CURRENT LOCATION  SECTION
	@Test
	public void verifyCurrentLocation() throws Exception
	{
		Log.info("---> Verifying Current Location Section<----");
	try 
	{
		objViewResumePage = new ViewResumePage(driver);
		flag = objViewResumePage.isCurrentLocationSectionDisplayed();
		Assert.assertTrue(flag, " Current Location section is not displayed");
		Log.info("---> Verifyied  Current Location Section <----");
	} 
	catch (Exception e) 
	{
		throw new Exception("FAILED TO VERIFY  CURRENT LOCATION SECTION AND VERFIY CURRENT LOCATION TESTCASE" + "\n isCurrentLocationSectionDisplayed" +e.getLocalizedMessage());
	}
	}
	
	// TEST CASE TO VERIFY PREFERRED LOCATION  SECTION
	@Test
	public void verifyPreferredLocation() throws Exception{
		{
			Log.info("--------> Verifying Preferref Location Section <-------");
			try {
				objViewResumePage=new ViewResumePage(driver);
				flag=objViewResumePage.isPreferredLocationSectionDisplayed();
				Assert.assertEquals(flag,"Preferred Location Section is not displayed");
			} catch (Exception e) {
				throw new Exception("FAILED TO VERIFY  PREFERRED  LOCATION SECTION AND VERFIY PREFERRED LOCATION  TESTCASE"+ "\n isPreferredLocationSectionDisplayed" +e.getLocalizedMessage());
			} 
		}
	}
	
	
	// TEST CASE TO VERIFY NATIONALITY SECTION
	@Test
	public void verifyNationality() throws Exception{
		{
			Log.info("--------> Verifying Nationality Section <-------");
			try {
				objViewResumePage=new ViewResumePage(driver);
				flag=objViewResumePage.isNationalitySectionDisplayed();
				Assert.assertEquals(flag,"Nationality Section is not displayed");
			} catch (Exception e) {
				throw new Exception("FAILED TO VERIFY  NATIONALITY SECTION AND VERFIY NATIONALITY TESTCASE"+ "\n isNationalitySectionDisplayed" +e.getLocalizedMessage());
			} 
		}
	}
	
	// TEST CASE TO VERIFY INDUSTRY SECTION
	@Test
	public void verifyIndustry() throws Exception{
		{
			Log.info("--------> Verifying Industry Section <-------");
			try {
				objViewResumePage=new ViewResumePage(driver);
				flag=objViewResumePage.isIndustrySectionDisplayed();
				Assert.assertEquals(flag,"Industry Section is not displayed");
			} catch (Exception e) {
				throw new Exception("FAILED TO VERIFY  INDUSTRY SECTION AND VERFIY INDUSTRY  TESTCASE"+ "\n isIndustrySectionDisplayed" +e.getLocalizedMessage());
			} 
		}
	}
	
	// TEST CASE TO VERIFY DESIRED JOB TYPE  SECTION
	@Test
	public void verifyDesiredJobType() throws Exception{
		{
			Log.info("--------> Verifying Desired Job Type Section <-------");
			try {
				objViewResumePage=new ViewResumePage(driver);
				flag=objViewResumePage.isJobTypeSectionDisplayed();
				Assert.assertEquals(flag,"Desired Job Type Section is not displayed");
			} catch (Exception e) {
				throw new Exception("FAILED TO VERIFY  DESIRED JOB TYPE SECTION AND VERFIY DESIRED JOB TYPE   TESTCASE"+ "\n isJobTypeSectionDisplayed" +e.getLocalizedMessage());
			} 
		}
	}
	
	
	// TEST CASE TO VERIFY FUNCTION SECTION
	@Test
	public void verifyFunction() throws Exception{
		{
			Log.info("--------> Verifying Function Section <-------");
			try {
				objViewResumePage=new ViewResumePage(driver);
				flag=objViewResumePage.isFunctionSectionDisplayed();
				Assert.assertEquals(flag,"Function Section is not displayed");
			} catch (Exception e) {
				throw new Exception("FAILED TO VERIFY  FUNCTION  SECTION AND VERFIY FUNCTION  TESTCASE"+ "\n isFunctionSectionDisplayed" +e.getLocalizedMessage());
			} 
		}
	}
	
	// TEST CASE TO VERIFY NOTICE PERIOD SECTION
	@Test
	public void verifyNoticePeriod() throws Exception{
		{
			Log.info("--------> Verifying Notice Period Section <-------");
			try {
				objViewResumePage=new ViewResumePage(driver);
				flag=objViewResumePage.isNoticePeriodSectionDisplayed();
				Assert.assertEquals(flag,"Notice Period Section is not displayed");
			} catch (Exception e) {
				throw new Exception("FAILED TO VERIFY NOTICE PERIOD  SECTION AND VERFIY NOTICE PERIOD  TESTCASE"+ "\n isNoticePeriodSectionDisplayed" +e.getLocalizedMessage());
			} 
		}
	}
	
	// TEST CASE TO VERIFY ROLES SECTION
	@Test
	public void verifyRoles() throws Exception{
		{
			Log.info("--------> Verifying Roles Section <-------");
			try {
				objViewResumePage=new ViewResumePage(driver);
				flag=objViewResumePage.isRolesSectionDisplayed();
				Assert.assertEquals(flag,"Roles Section is not displayed");
			} catch (Exception e) {
				throw new Exception("FAILED TO VERIFY ROLES SECTION AND VERFIY ROLES TESTCASE"+ "\n isRolesSectionDisplayed" +e.getLocalizedMessage());
			} 
		}
	}
	
	// TEST CASE TO VERIFY WORK HISTORY  SECTION
	@Test
	public void verifyWorkHistory() throws Exception{
		{
			Log.info("--------> Verifying Work History Section <-------");
			try {
				objViewResumePage=new ViewResumePage(driver);
				flag=objViewResumePage.isWorkHistorySectionDisplayed();
				Assert.assertEquals(flag,"Work History Section is not displayed");
			} catch (Exception e) {
				throw new Exception("FAILED TO  VERIFY WORK HISTORY SECTION AND VERFIY WORK HISTORY TESTCASE"+ "\n isWorkHistorySectionDisplayed" +e.getLocalizedMessage());
			} 
		}
	}
	
	// TEST CASE TO VERIFY EDUCATION SECTION
	@Test
	public void verifyEducation() throws Exception{
		{
			Log.info("--------> Verifying Education Section <-------");
			try {
				objViewResumePage=new ViewResumePage(driver);
				flag=objViewResumePage.isEducationSectionDisplayed();
				Assert.assertEquals(flag,"Education Section is not displayed");
			} catch (Exception e) {
				throw new Exception("FAILED TO  VERIFY EDUCATION  SECTION AND VERFIY  EDUCATION TESTCASE"+ "\n isEducationSectionDisplayed" +e.getLocalizedMessage());
			} 
		}
	}
	
}
