package com.amazon.script;

import org.testng.annotations.Test;

import com.amazon.generics.Excel;
import com.amazon.pom.HomePage;
import com.amazon.pom.LoginPage;

public class Validate_Valid_LoginPageE extends BaseTest
{

	
@Test
public void validateLoginPageE()
{
String sheet = "LoginPageData";

String un = Excel.getCellValue(PATH, sheet, 1, 1);
String pw = Excel.getCellValue(PATH, sheet, 1, 2);
String lpt = Excel.getCellValue(PATH, sheet, 1, 3);
String hpt = Excel.getCellValue(PATH, sheet, 1, 4);

LoginPage l1 = new LoginPage(driver);
           l1.verifyTitle(lpt);
           waitforSomeTime();
          l1.setUserName(un);
          
          l1.setPassword(pw);
          
          l1.clickOnLoginButton();
          
          
 HomePage h1 = new HomePage(driver);
 waitforSomeTime();
          h1.verifyTitle(hpt);
          
          h1.clickOnLogoutButton();
          
          

}
}
