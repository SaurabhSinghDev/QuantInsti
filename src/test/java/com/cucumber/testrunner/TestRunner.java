package com.cucumber.testrunner;

//import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"features"},
        glue = {"com.cucumber.stepdefinitions"},
        tags= {"@formfill"},
        monochrome = true,
    	dryRun = false)

public class TestRunner extends AbstractTestNGCucumberTests {
	
}