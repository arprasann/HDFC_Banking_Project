package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Version extends BasePage
{
@FindBy(xpath="//nobr[text()='actiTIME 2016.3']")
private WebElement version;

public Version(WebDriver driver)
{
	super(driver);
	
PageFactory.initElements(driver, this);	
}


public void verifyVersion(String eVersion)
{
	String aVersion = version.getText();
     Assert.assertEquals(aVersion, eVersion);
}

	
}
