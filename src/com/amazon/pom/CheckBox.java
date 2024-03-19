package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import graphql.Assert;

public class CheckBox extends BasePage
{

	
@FindBy(id="keepLoggedInCheckBox")
private WebElement checkBox;



public CheckBox(WebDriver driver)
{
	super(driver);
	PageFactory.initElements(driver, this);
}



public void clickOnCheckBox()
{
	checkBox.click();
	
	Assert.assertTrue(checkBox.isSelected());
}
}
