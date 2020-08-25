package com.wordpress.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.GalleryPage;
import com.amazon.qa.pages.HomePage;

public class GalleryPageTest extends TestBase {

	HomePage HomePag;
	GalleryPage GalleryPag;

	@BeforeMethod
	public void before() {
		initialization();

	}

	@Test(priority = 1)
	public void menuveify() throws Throwable {
		HomePag = new HomePage();
		GalleryPag = HomePag.GalleryVerify();
		GalleryPag.HeadVerify();
	}

	@AfterMethod
	public void Teardown() {
		driver.close();
	}

}
