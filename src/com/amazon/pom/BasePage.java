package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public abstract class BasePage 
{
public WebDriver driver;


public BasePage(WebDriver driver)
{
	this.driver = driver;
}


public void verifyTitle(String eTitle)
{
	String aTitle = driver.getTitle();
    Assert.assertEquals(aTitle, eTitle);
}
	
	
}
