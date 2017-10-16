package com.shravan.TestNGCucumber.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/features/test2.feature",
        glue = "com.shravan.TestNGCucumber.glue")
public class Test2FeatureRunner extends AbstractTestNGCucumberTests {
}
