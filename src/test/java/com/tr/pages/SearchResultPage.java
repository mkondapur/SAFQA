package com.tr.pages;

import org.openqa.selenium.WebDriver;

import com.tr.util.BasePageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage extends BasePageObject{

	public SearchResultPage(WebDriver driver) {
		super(driver);
	}

	WebDriver driver;
	WebElement element;
	
	String[] count;
	String txt;
	boolean flag;
	int pagecount;
	List<String>jobslisting = new ArrayList<String>();
	List<WebElement>resultset = new ArrayList<WebElement>();
	
	
//***************************** WebElement declaration ************************************//
	By keyword = By.id("fts_id");
	By exp1 = By.id("selExp");
	
	By location1 = By.id("lmy");
	By btnsearch = By.xpath("//input[@class='btnmain']");
	
	
	
	String key = null;;
	String yrs =null;

	String loc =null;
	
	By jobcount = By.xpath("//div[@class='searchinfotxt lft']");
	By keyskill = By.xpath("//span[@itemprop='skills']");
	
	
	
	public void Search(String key,String yrs,String loc) throws Exception{
		this.key = key;
		this.yrs = yrs;
		this.loc = loc;
		String expyrs= "//a[@data-id='"+yrs+"']";
		System.out.println(expyrs);
		By exp11 = By.xpath(expyrs);
		element = driver.findElement(keyword);
		element.click();
		element.clear();
		element.sendKeys(key);
		
		element = driver.findElement(exp1);
		element.click();
		element.click();
		element= driver.findElement(exp11);
		element.click();

		element = driver.findElement(location1);
		element.sendKeys(loc);
		element= driver.findElement(btnsearch);
		element.click();
		
		flag = verifyresult(key, loc);
		System.out.println(flag);
	}
	public void Search(String key,String loc){
		this.key = key;
		this.loc=loc;
		element = driver.findElement(keyword);
		element.click();
		element.clear();
		element.sendKeys(key);
		
		element = driver.findElement(location1);
		element.sendKeys(loc);
		element= driver.findElement(btnsearch);
		element.click();
		flag = verifyresult(key, loc);
		System.out.println(flag);
		if (flag = true){
			System.out.println(" All The Key SKILL CONTAIN THE ::"+key);
		}else{
			System.out.println(" All The Key SKILL DOES NOT CONTAIN THE ::"+key);
		}
	}
	
	public String jobcount(){
		element = driver.findElement(jobcount);
		txt = element.getText();
		count = txt.split("f");
		txt = count[1];
		count = txt.split("J");
		txt = count[0];
		System.out.println(txt);
		return txt;
		
	}
	
	public boolean verifyresult(String key,String loc){
		this.key=key;
		this.loc=loc;
		key=key.toLowerCase();
		System.out.println(key);
		resultset=driver.findElements(keyskill);
		for (int i = 1; i <= resultset.size(); i++) {
			By skill = By.xpath("//div[@class='tpjob_item ']["+i+"]//span[@itemprop='skills']");
			element=driver.findElement(skill);
			txt = element.getText().toLowerCase();
			
			System.out.println(i);
			System.out.println(txt);
			By titletext = By.xpath("//div[@class='tpjob_item ']["+i+"]//span[@itemprop='title']");
			element = driver.findElement(titletext);
			String texttitle =element.getText().toLowerCase();
			if (txt.contains(key)||texttitle.contains(key)){
				flag = true;
			}else{
				flag = false;
				break;
			}
			
		}
		
		return flag;
	}
	
}

