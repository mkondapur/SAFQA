package com.tr.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class MonsterUtil {

	public static WebDriver driver;
	
	public static void implicitWait(int seconds){
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	public static void explicitWait(int miliSeconds) throws InterruptedException{
		
		try {
			Thread.sleep(miliSeconds);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
