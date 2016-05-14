package com.tr.test;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.tr.pages.LoginPage;
import com.tr.pages.MyDashbordPage;
import com.tr.util.BaseTestObject;

public class MyDashBoardPageTest extends BaseTestObject{
		int wait = 30;
		String pagetitle = null;
		String expectedpagetitle = "Monster - Find Jobs with Monsterindia.com. Submit Resume on Monster";
		String expectedusername = "Satish B M";
		String username = null;
		String txt = null;
		boolean flag = false;
		String phoneno = "+91-9686560200 Verified";
		String phverified = "Verified";
		String email ="Satish.muniyappa@gmail.com";
		String emailverified = "Verified";
// *********************creating object for the class *****************************************		
		MyDashbordPage objMyDashboard = null;
		LoginPage objlogin = null;
//********************** Declaration Area ends *************************************************
		// setup class
		
		@Test(priority=0)
		public void Profilecompletepage() throws Exception{
			objlogin = new LoginPage(driver);
			objlogin.loginAsJobSeeker("Satish.muniyappa@gmail.com","Nov17@2008");
			objMyDashboard = new MyDashbordPage(driver);
			flag = objMyDashboard.ProfileCompletnessPagexists();
			if (flag = true){
				objMyDashboard.ClickDonotAskAgain();
			}
		}
		
		@Test(priority=1)
		public void Verifyuserinfopage() throws Exception{
			pagetitle = objMyDashboard.pagetitle();
			if (pagetitle.contains(expectedpagetitle)){
				flag = true;
				System.out.println(pagetitle);
			} 
			Assert.assertTrue(flag, "Page Title is not matching the expected");
			Thread.sleep(30000);
			username = objMyDashboard.username();
			if (username.equals(expectedusername)){
				flag = true;
				System.out.println(username);
			}
			Assert.assertTrue(flag, "Username is not matching the expected");
			
			txt = objMyDashboard.Phone();
			System.out.println(txt);
			Assert.assertEquals(txt, phoneno, "Phone No. are not matching");
			
			txt = objMyDashboard.PhoneVerify();
			System.out.println(txt);
			Assert.assertEquals(txt, phverified, "Phone No. is not verified");
			
			txt = objMyDashboard.email();
			System.out.println(txt);
			Assert.assertTrue(email.contains(txt), "Email id is not Matching ");
			
		}

}
