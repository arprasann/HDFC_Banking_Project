package com.amazon.script;

import org.testng.annotations.Test;

import com.amazon.pom.HomePage;
import com.amazon.pom.LoginPage;
import com.amazon.pom.Tasks;

public class Validate_Tasks extends BaseTest
{

	
	@Test
	public void validateTasks()
	{
		LoginPage l1 = new LoginPage(driver);
        l1.setUserName("admin");
        waitforSomeTime();
        l1.setPassword("manager");
        waitforSomeTime();
        l1.clickOnLoginButton(); 
        
        
        Tasks t1 = new Tasks(driver);
              t1.clickOnTasks();
              t1.enterFilterTaskName("Prasanna");
              waitforSomeTime();
              t1.clickOnApplyButton();
              
              
              HomePage h1 = new HomePage(driver);
              h1.clickOnLogoutButton();
              
              
	
	
	}
}
