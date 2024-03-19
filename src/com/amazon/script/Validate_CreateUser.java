package com.amazon.script;

import org.testng.annotations.Test;

import com.amazon.pom.CreateUser;
import com.amazon.pom.HomePage;
import com.amazon.pom.LoginPage;

public class Validate_CreateUser extends BaseTest
{

	
	@Test
	public void validateCreateUser()
	{
		LoginPage l1 = new LoginPage(driver);
        l1.setUserName("admin");
        waitforSomeTime();
        l1.setPassword("manager");
        waitforSomeTime();
        l1.clickOnLoginButton(); 
        
        CreateUser c1 = new CreateUser(driver);
                   c1.clickOnUsers();
                   c1.clickOnAddUser();
                   waitforSomeTime();
                   c1.enterFirstName("Dinga01123");
                   c1.enterLastName("Manga44056");
                   c1.enterEmail("dingamanga10@gmail.com");
                   waitforSomeTime();
                   c1.enterUserName("dingamanag111");
                   c1.enterPassword("12345666");
                   c1.reEnterPassord("12345666");
                   waitforSomeTime();
                   c1.clickOnCreateUserButton();
                   waitforSomeTime();
                   
                   HomePage h1 = new HomePage(driver);
                   h1.clickOnLogoutButton();
            System.out.println("*******User1 Created Successfully*****");       
	}
}
