package com.wordpress.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.AboutUsPage;
import com.amazon.qa.pages.HomePage;

public class AboutUsPageTest extends TestBase {
	HomePage HomePag;
	AboutUsPage AboutUsPag;

	@BeforeMethod
	public void before() {
		initialization();

	}

	@Test(priority = 1)
	public void menuveify() throws Throwable {
		HomePag = new HomePage();                 //     create home page object
		AboutUsPag = HomePag.aboutVerify();      //      call to veryfy method
		AboutUsPag.ourMissionVerify();           //       about page ourmission method call  
	}

	@AfterMethod
	public void Teardown() {
		driver.close();
	}

}
