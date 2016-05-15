package com.tr.test;

import com.tr.pages.SearchResultPage;
import com.tr.util.BaseTestObject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SearchPageTest extends BaseTestObject{

	/**
	 * @author Manjunath H S
	 */
	
	
	WebDriver driver;
	WebElement element;
	String url = "http://www.monsterindia.com/"; 
	int wait = 30;
	
	//****************** web
	
	By keyword = By.id("fts_id");
	By exp1 = By.id("selExp");
	
	
	By location = By.id("lmy");
	By btnsearch = By.xpath("//input[@class='btnmain']");
	
	
	
	String key = "Selenium";
	String yrs ="2";
//	String expyrs= "//a[@data-id='"+yrs+"']";
//	By exp = By.xpath(expyrs);
	String loc ="Bangalore";
	
	
	
@BeforeTest
		
		public void setup(){
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}

@org.testng.annotations.Test
	public void clicksearch() throws Exception{
	SearchResultPage result = new SearchResultPage(driver);
	result.Search(key, yrs, loc);	
	element = new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(By.id("searchresultfrm")));
	String value=result.jobcount();
	
	

	
	} 
@AfterTest
public void teardown(){
driver.quit();
}	
}
