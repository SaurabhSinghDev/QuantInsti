package com.cucumber.common.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.base.BaseTest;

public class TestUtils extends BaseTest {
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	public void waitForElementVisibility(WebElement element) throws TimeoutException{
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void implicitWait(int wait)
	{
		driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
	}
	
	

}
