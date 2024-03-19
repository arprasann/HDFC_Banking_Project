package com.amazon.script;

import org.testng.annotations.Test;

import com.amazon.pom.InvalidLoginPage;
import com.amazon.pom.LoginPage;

public class Validate_Invalid_LoginPage extends BaseTest
{

	
	@Test
	public void validateInvalidLoginPage()
	{
		LoginPage l1 = new LoginPage(driver);
        l1.setUserName("admin100");
        waitforSomeTime();
        l1.setPassword("manager200");
        waitforSomeTime();
        l1.clickOnLoginButton(); 
        waitforSomeTime();
        
        InvalidLoginPage i1 = new InvalidLoginPage(driver);
                         i1.verifyInvalidLoginPage();
	}
}
