package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class CropsPage extends TestBase{

	public CropsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[text()='Fruit Crops']")
	WebElement fruit;
	
	
	public boolean fruitVerify() {
		boolean sp = fruit.isDisplayed();
		return sp;
	}
	
}
