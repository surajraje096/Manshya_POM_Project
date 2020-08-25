package com.wordpress.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;

public class HomePageTest extends TestBase {

	HomePage HomePag;

	@BeforeMethod
	public void before() {
		initialization();
		HomePag = new HomePage();
	}

	@Test(priority=1)
	public void menuveify() throws Throwable {
		HomePag.Countsimilerproduct();
	}
	@Test(priority=2)
	public void aboutveify() throws Throwable {
		HomePag.aboutVerify();
	}
	@Test(priority=3)
	public void productveify() throws Throwable {
		HomePag.ProductVerify();
	}
	@Test(priority=4)
	public void cropsveify() throws Throwable {
		HomePag.cropsVerify();
	}
	@Test(priority=5)
	public void BPNveify() throws Throwable {
		HomePag.BPNVerify();
	}
	@Test(priority=6)
	public void Galleryveify() throws Throwable {
		HomePag.GalleryVerify();
	}
	@AfterMethod
	public void Teardown() {
		driver.close();
	}

}
