package com.amazon.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.actiondriver.Action;
import com.amazon.qa.base.TestBase;

public class HomePage extends TestBase {
	Actions act = new Actions(driver);

	@FindBy(xpath = "//*[@id=\"menu-menu-1\"]/li")
	WebElement allMenu;

	@FindBy(xpath = "(//li[contains(@class,'menu-item menu-item-type-post_type')]//a)[2]")
	WebElement about;

	@FindBy(linkText = "Our Mission")
	WebElement ourmistion;

	@FindBy(xpath = "//li[@id='menu-item-2474']/a[1]")
	WebElement product;

	@FindBy(xpath = "//li[@id='menu-item-4347']/a[1]")
	WebElement Secondary;

	@FindBy(xpath = "//li[@id='menu-item-4225']/a[1]")
	WebElement crops;

	@FindBy(xpath = "//li[@id='menu-item-4299']/a[1]")
	WebElement fruit;

	@FindBy(xpath = "//li[@id='menu-item-2536']/a[1]")
	WebElement BPN;

	@FindBy(xpath = "//li[@id='menu-item-2536']/a[1]")
	WebElement Major;

	@FindBy(xpath = "//li[@id='menu-item-3015']/a[1]")
	WebElement Galary;

	@FindBy(xpath = "//li[@id='menu-item-4470']/a[1]")
	WebElement head;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void Countsimilerproduct() {

		List<WebElement> sp = driver.findElements(By.xpath("//*[@class=\"menu-menu-1-container\"]/ul/li"));
		System.out.println(sp.size());

	}

	public AboutUsPage aboutVerify() throws Throwable {
		act.moveToElement(about).build().perform();
		Thread.sleep(3000);
		ourmistion.click();

		return new AboutUsPage();
	}

	public ProductsPage ProductVerify() throws Throwable {
		act.moveToElement(product).build().perform();
		Thread.sleep(3000);
		Secondary.click();
		return new ProductsPage();
	}

	public CropsPage cropsVerify() throws Throwable {
		act.moveToElement(crops).build().perform();
		Thread.sleep(3000);
		fruit.click();
		return new CropsPage();
	}

	public BPNPage BPNVerify() throws Throwable {
		act.moveToElement(crops).build().perform();
		Thread.sleep(3000);
		Major.click();
		return new BPNPage();
	}

	public GalleryPage GalleryVerify() throws Throwable {
		act.moveToElement(Galary).build().perform();
		Thread.sleep(4000);
		head.click();
		return new GalleryPage();
	}

}
