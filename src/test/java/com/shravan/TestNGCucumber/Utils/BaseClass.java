package com.shravan.TestNGCucumber.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public WebDriver driver;
	
	
	public void startBrowser(){
		System.setProperty("webdriver.gecko.driver", "/Users/shravanmechineni/Tools/selenium/geckodriver");
		driver = new FirefoxDriver();
	}
	
	public void navigateTo(String url){
		driver.navigate().to(url);
	}
	
	public void closeBrowser(){
		driver.quit();
	}
		

}
