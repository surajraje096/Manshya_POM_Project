package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class ProductsPage extends TestBase{

	public ProductsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h3[text()='Secondary Product Range']")
	WebElement Secondary;
	
	
	public boolean SecondaryVerify() {
		boolean sp = Secondary.isDisplayed();
		return sp;
	}
	
	
}
