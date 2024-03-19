package com.amazon.script;

import org.testng.annotations.Test;

import com.amazon.pom.HomePage;
import com.amazon.pom.LoginPage;

public class Validate_HomePage_Title extends BaseTest
{

	
	@Test
	public void validateHomePageTitle()
	{
		LoginPage l1 = new LoginPage(driver);
        l1.setUserName("admin");
        waitforSomeTime();
        l1.setPassword("manager");
        waitforSomeTime();
        l1.clickOnLoginButton(); 
        
        waitforSomeTime();
        
        HomePage h1 = new HomePage(driver);
                 h1.verifyTitle("actiTIME - Enter Time-Track");
	
	System.out.println("*******Home Page Title Validated Successfully*****");
	}
}
