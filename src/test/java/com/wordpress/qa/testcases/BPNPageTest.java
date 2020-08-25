package com.wordpress.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.AboutUsPage;
import com.amazon.qa.pages.BPNPage;
import com.amazon.qa.pages.HomePage;

public class BPNPageTest extends TestBase{

	HomePage HomePag;
	BPNPage BPNPag;

	@BeforeMethod
	public void before() {
		initialization();

	}

	@Test(priority = 1)
	public void menuveify() throws Throwable {
		HomePag = new HomePage();                 //     create home page object
		BPNPag = HomePag.BPNVerify();      //      call to veryfy method
		BPNPag.majorVerify();
		BPNPag.majorVerifyAssert();
		BPNPag.majorVerifyString();
		BPNPag.majorVerifyTrue();
	}

	@AfterMethod
	public void Teardown() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
