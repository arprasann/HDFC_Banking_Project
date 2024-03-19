package com.amazon.script;

import org.testng.annotations.Test;

import com.amazon.generics.Excel;
import com.amazon.pom.InvalidLoginPage;
import com.amazon.pom.LoginPage;

public class ValidateInvalidLoginPageE extends BaseTest {

	@Test
	public void validateInvalidLoginPageE() {
		String sheet = "InvalidLoginPage";

		int totalRows = Excel.getRowCount(PATH, sheet);

		for (int i = 1; i <=totalRows; i++) {
			String un = Excel.getCellValue(PATH, sheet, i, 1);
			String pw = Excel.getCellValue(PATH, sheet, i, 2);

			LoginPage l1 = new LoginPage(driver);
			l1.setUserName(un);
			waitforSomeTime();
			l1.setPassword(pw);
			l1.clickOnLoginButton();

			InvalidLoginPage i1 = new InvalidLoginPage(driver);
			waitforSomeTime();
			i1.verifyInvalidLoginPage();
			System.out.println("******Successfully Validated ErrorMsg******");

		}

	}

}
