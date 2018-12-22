package com.cucumber.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.cucumber.common.utils.TestUtils;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseTest(){
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\com\\cucumber\\config\\Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization(){
		
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")){
		    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\resources\\chromedriver.exe");	
			driver = new ChromeDriver(); 
			driver.manage().window().maximize();
		}
		else if(browserName.equals("firefox")){
			FirefoxOptions options = new FirefoxOptions();
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\resources\\geckodriver.exe");	
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}	
		driver.get(prop.getProperty("url"));
	}

	public static void teardown() {
		// TODO Auto-generated method stub
		driver.quit();
		
	}
}
