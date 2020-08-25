package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class GalleryPage extends TestBase{

	public GalleryPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[text()='Head Office']")
	WebElement Head;
	
	
	public boolean HeadVerify() {
		boolean sp = Head.isDisplayed();
		return sp;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
