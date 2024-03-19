package com.amazon.script;

import org.testng.annotations.Test;

import com.amazon.pom.DownLoadReports;
import com.amazon.pom.HomePage;
import com.amazon.pom.LoginPage;

public class Validate_Reports extends BaseTest {

	@Test
	public void validateReports() {
		log.debug("DownLoad Report TEst Case Execution Stared...");
		LoginPage l1 = new LoginPage(driver);
		l1.setUserName("admin");
		waitforSomeTime();
		l1.setPassword("manager");
		waitforSomeTime();
		l1.clickOnLoginButton();

		DownLoadReports d1 = new DownLoadReports(driver);
		d1.clickonReports();
		System.out.println("*****Click On Reports***");
		d1.clickonNewReport();
		System.out.println("*****Clicked on New Report***");
		d1.clickConfigureReport();
		System.out.println("*****Clicked on Configure Report***");
		d1.clickonGenerateReport();
		System.out.println("*****Clicked on Generate Reoprt***");
		d1.clickOnExporttoCSVReport();

		System.out.println("*****Successfully Report Vaidated***");

		HomePage h1 = new HomePage(driver);
		h1.clickOnLogoutButton();
		
		log.debug("DownLoad Report TEst Case Execution Completed Successfully****");
	}
}
