package com.wordpress.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.ProductsPage;

public class ProductsPageTest extends TestBase {

	HomePage HomePag;
	ProductsPage ProductsPag;

	@BeforeMethod
	public void before() {
		initialization();

	}

	@Test(priority = 1)
	public void menuveify() throws Throwable {
		HomePag = new HomePage();                
		ProductsPag = HomePag.ProductVerify();    
		ProductsPag.SecondaryVerify();            
	}

	@AfterMethod
	public void Teardown() {
		driver.close();
	}

}
