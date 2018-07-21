package com.Automation.HybridFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.HybridFramework.Base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="//span[text()='Electronics']")
	WebElement electronic;
	
	@FindBy(xpath="//img[@title='Flipkart']")
	WebElement flipkartimg;
	
	@FindBy(xpath="")
	WebElement samsung;
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String validatetitle() {
		
		return driver.getTitle();
	}
	
	public String validateurl() {
		return driver.getCurrentUrl();
	}
	
	public boolean  validateImage() {
		
		return flipkartimg.isDisplayed();
	}
	
	public SamsungPage clickOnSamsung() {
		
		Actions act = new Actions(driver);
		
		act.moveToElement(electronic);
		
		 samsung.click();
		 
		 return new SamsungPage();
		
		
		
	}
}
