package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownLoadReports extends BasePage
{

@FindBy(xpath="//div[text()='REPORTS']")
private WebElement reports;


@FindBy(xpath="//span[text()='New Report']")
private WebElement newReport;


@FindBy(id="configureReportParametersButton")
private WebElement configureReport;


@FindBy(id="applyReportConfiguration")
private WebElement generatereport;


@FindBy(xpath="(//*[contains(text(),'Export to CSV')])[2]")
private WebElement exportToCSV;
	


public DownLoadReports(WebDriver driver)
{
	super(driver);
	PageFactory.initElements(driver, this);
}



public void clickonReports()
{
	reports.click();
}


public void clickonNewReport()
{
	newReport.click();
}


public void clickConfigureReport()
{
	configureReport.click();
}



public void clickonGenerateReport()
{
	generatereport.click();
}


public void clickOnExporttoCSVReport()
{
	exportToCSV.click();
}
}
