package com.amazon.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class BPNPage extends TestBase {

	public BPNPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[text()='Major']")
	WebElement major;

	public boolean majorVerify() { // option 1
		boolean sp = major.isDisplayed();
		return sp;
	}

	public void majorVerifyAssert() { // option 2
        String majorActual = major.getText();          // validate
		String majorexpected = "Major Nutrients";     //  validation
		Assert.assertEquals(majorexpected, majorActual);                // Result
	}

	public void majorVerifyTrue() { // option 3
		boolean std =major.isDisplayed();
		Assert.assertTrue(std);
	}
	public void majorVerifyString() { // option 4
        String majorActual = major.getText();
		String majorexpected = "Major Nutrients";
		if(majorActual.equals(majorexpected)) {
			System.out.println("given Test is successfully Aquret");
		}
	}
	
	
	
	
}
