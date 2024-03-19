package com.amazon.script;

import org.testng.annotations.Test;

import com.amazon.pom.LoginPage;

public class Validate_LoginPaqgeTitle extends BaseTest
{

	
	@Test
	public void validateLoginPageTitle()
	{
		LoginPage l1 = new LoginPage(driver);
		          l1.verifyTitle("actiTIME - Login");
	}
}
