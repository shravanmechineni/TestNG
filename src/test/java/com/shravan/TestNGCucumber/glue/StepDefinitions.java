package com.shravan.TestNGCucumber.glue;

import com.shravan.TestNGCucumber.Utils.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class StepDefinitions extends BaseClass{

	@Before
    public void beforeScenario() {
        startBrowser();
    }
	
	@Given("^I am on \"([^\"]*)\"$")
    public void I_am_on(String url) {
        navigateTo(url);
    }
 
 
    @After
    public void afterScenario() {
        closeBrowser();
    }

}
