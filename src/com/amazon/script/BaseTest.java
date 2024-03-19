package com.amazon.script;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutomationConstantInput
{
public WebDriver driver;


public static void waitforSomeTime()
{
	try
	{
		Thread.sleep(2000);
	}
	catch (Exception e) {
		// TODO: handle exception
	}
}

Logger log;

@BeforeMethod
public void preCondtion() throws InterruptedException
{
	log=Logger.getLogger("devpinoyLogger");

	log.debug("Open the Browser");
	driver = new ChromeDriver();
	waitforSomeTime();
	
	log.debug("Maximize The Browser");
	driver.manage().window().maximize();
	
	log.debug("Enter The URL");
	
	driver.get("http://localhost/login.do");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}


@AfterMethod
public void postCondtion()
{
	log.debug("Close the Browser");
	driver.close();
}
}
