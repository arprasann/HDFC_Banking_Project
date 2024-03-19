package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tasks extends BasePage
{

	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement tasks;
	
	
	@FindBy(name="visiableFilterString")
	private WebElement filtertaskName;
	
	
	
	@FindBy(name="searchTasks")
	private WebElement applyFilter;
	
	
	public Tasks(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickOnTasks()
	{
		tasks.click();
	}
	
	
	public void enterFilterTaskName(String ftn)
	{
		filtertaskName.clear();
		filtertaskName.sendKeys(ftn);
	}
	
	
	public void clickOnApplyButton()
	{
		applyFilter.click();
	}
	
	
	
}
