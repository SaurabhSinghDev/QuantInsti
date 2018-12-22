package com.cucumber.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.base.BaseTest;
import com.cucumber.common.utils.CaptureScreenshots;

public class pages extends BaseTest{
	
    @FindBy(xpath = "//*[@id='container']/div/div/header/div/div/div/div/div[2]/ul/li[@class='header-navbar-list']/a/p[text()='Login']")
    WebElement login;
    
    @FindBy(xpath = "//*[@id='app']/div/div/div/div/form/div[4]/div[1]/input")
    WebElement username;
    
    @FindBy(xpath = "//*[@id='app']/div/div/div/div/form/div[4]/div[2]/input")
    WebElement password;
  
    @FindBy(xpath = "//*[@id='app']/div/div/div/div/form/button")
    WebElement loginButton;
    
    @FindBy(xpath = "//*[@id='container']/div/div/header-page/header/div/div/div/div/div[2]/ul[1]/li/span")
    WebElement profile;
    
    @FindBy(xpath = "//*[@id='container']/div/div/header-page/header/div/div/div/div/div[2]/ul[1]/div/ul/li[1]/a/span")
    WebElement profileLink;
    
    @FindBy(xpath = "//*[@id='app']/div/div/div[1]/div[2]/div/div/div/form/div[1]/div[2]/input")
    WebElement email;
    
    @FindBy(xpath = "//*[@id='app']/div/div/div[1]/div[2]/div/div/div/form/div[1]/div[5]/input")
    WebElement mobile;
    
    @FindBy(xpath = "/html/body/div[3]/div/div[10]/button[1]")
    WebElement alert1;
    
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[1]/div[2]/div/div/div/form/div[2]/button[1]")
    WebElement save;
    
    @FindBy(xpath = "//*[@id='app']/div/div/div[1]/div[2]/div/div/div/form/div[1]/div[8]/select")
    WebElement select;
    
    @FindBy(xpath = "/html/body/div[3]/div/div[10]/button[1]")
    WebElement saveSuccess;
    
    @FindBy(xpath = "//*[@id='app']/div/div/div[1]/div[1]/div[1]/div[3]/ul[1]/li[2]/a")
    WebElement myService;
    
    @FindBy(xpath = "//*[@id='app']/div/div/div[1]/div[1]/div[2]/a")
    WebElement logout;
    CaptureScreenshots screen = new CaptureScreenshots();
    
    public pages(){
		PageFactory.initElements(driver, this);
	}
    
    public String loginClick() throws InterruptedException
    {
    	Thread.sleep(2000);
    	login.click();
    	String winHandleBefore = driver.getWindowHandle();
    	driver.switchTo().window("Login");
    	username.sendKeys("sachin.p+dummy1@quantinsti.com");
    	password.sendKeys("sachintest");
    	loginButton.click();
		return winHandleBefore;
    }
    
    public void clickProfile() throws InterruptedException
    {
    	Thread.sleep(7000);
    	driver.switchTo().window("");
    	Thread.sleep(2000);
    	profile.click();
    	Thread.sleep(2000);
    	profileLink.click();
    }
    
    public void getEmailtext()
    {
    	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    	driver.switchTo().window(tabs.get(1));
    	System.out.println(email.getAttribute("value"));
    	
    }
    
    public void validateWrongNumber() throws InterruptedException
    {
    	mobile.clear();
    	mobile.sendKeys("2222222");
    	save.click();
    	Thread.sleep(4000);
    	alert1.click();
    }
    
    public void correctMobile()
    {
    	mobile.clear();
    	mobile.sendKeys("9768226717");
    }
    
    public void selectExperienceandSave() throws InterruptedException
    {
    	Select select = new Select(driver.findElement(By.xpath("//*[@id='app']/div/div/div[1]/div[2]/div/div/div/form/div[1]/div[8]/select")));
    	select.selectByValue("[object Object]");
    	Thread.sleep(2000);
    	save.click();
    	screen.getScreenshot(driver, "success_message");
    	Thread.sleep(4000);
    	saveSuccess.click();
    }
    
    public void goToMyService() throws InterruptedException
    {
    	Thread.sleep(2000);
    	myService.click();
    	String title = driver.getTitle();
    	System.out.println(title);
    }
    
    public void logout()
    {
    	logout.click();
    }
}