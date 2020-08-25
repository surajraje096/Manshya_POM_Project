package com.wordpress.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.CropsPage;
import com.amazon.qa.pages.HomePage;

public class CropsPageTest extends TestBase {

	HomePage HomePag;
	CropsPage CropsPag;

	@BeforeMethod
	public void before() {
		initialization();

	}

	@Test(priority = 1)
	public void menuveify() throws Throwable {
		HomePag = new HomePage();
		CropsPag = HomePag.cropsVerify();
		CropsPag.fruitVerify();
	}

	@AfterMethod
	public void Teardown() {
		driver.close();
	}

}
