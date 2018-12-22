package com.cucumber.stepdefinitions;

import com.cucumber.base.BaseTest;
import com.cucumber.pages.pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends BaseTest {
	pages page;
	
	@Given("^I am logged in as user$")
	public void i_am_logged_in_as_user() throws Throwable {
		BaseTest.initialization();
		page = new pages();
		page.loginClick();
		
	}
	
	@When("^I click on profile icon and profile link$")
	public void i_click_on_profile_icon_and_profile_link() throws Throwable {
		page.clickProfile();
	}
	
	@When("^I get the text from the email address$")
	public void i_get_the_text_from_the_email_address() throws Throwable {
		page.getEmailtext();
	}
	
	@When("^I validate wrong mobile number$")
	public void i_validate_wrong_mobile_number() throws Throwable {
		page.validateWrongNumber();
	}
	
	@Then("^I correct mobile number$")
	public void i_correct_mobile_number() throws Throwable {
		page.correctMobile();
	}
	
	@Then("^I fill the form and Capture the message$")
	public void i_fill_the_form_and_Capture_the_message() throws Throwable {
		page.selectExperienceandSave();
	}
	
	@Then("^I go to my service page and get title of the page$")
	public void i_go_to_my_service_page_and_get_title_of_the_page() throws Throwable {
		page.goToMyService();
	}
	
	@Then("^I logout from the application$")
	public void i_logout_from_the_application() throws Throwable {
		page.logout();
		BaseTest.teardown();
	}
}