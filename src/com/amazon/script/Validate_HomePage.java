package com.amazon.script;

import org.testng.annotations.Test;

import com.amazon.pom.HomePage;
import com.amazon.pom.LoginPage;

public class Validate_HomePage extends BaseTest
{

	
	@Test
	public void validateHomePage()
	{
		log.debug("Validate Valid LoginPage");
		LoginPage l1 = new LoginPage(driver);
		log.debug("Enter the UserName");
		           l1.setUserName("admin");
		           waitforSomeTime();
		           log.debug("Enter The Password");
		           l1.setPassword("manager");
		           waitforSomeTime();
		           log.debug("Click On LoginButton");
                   l1.clickOnLoginButton(); 
                   
                   log.debug("****Valid LoginPage Validated Successfully*****");   
        
        HomePage h1 = new HomePage(driver);
        log.debug("Home Page Screen Displayed****");
                 h1.clickOnLogoutButton();
                 log.debug("****Successfully Clicked on Loggedout Button****");
	}
}
