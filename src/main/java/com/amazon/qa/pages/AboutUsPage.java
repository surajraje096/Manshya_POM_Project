package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class AboutUsPage extends TestBase{
	
	public AboutUsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()=\"Our Mission\"]")
	WebElement ourMission;
	
	
	public boolean ourMissionVerify() {
		boolean sp = ourMission.isDisplayed();
		return sp;
	}
	
	
	
	
	
	
	
	
	

}
