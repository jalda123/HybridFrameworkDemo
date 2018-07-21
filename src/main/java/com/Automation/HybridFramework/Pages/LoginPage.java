package com.Automation.HybridFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automation.HybridFramework.Base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath="(//div[@class='_39M2dM'])[1]/input")
			WebElement email;
	
	@FindBy(xpath="(//div[@class='_39M2dM'])[2]/input")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit'] [@class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement loginbtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void loginToapplication() throws InterruptedException {
		
		email.sendKeys(pro.getProperty("user"));
		
		Thread.sleep(2000);
		
		password.sendKeys(pro.getProperty("pass"));
		
		Thread.sleep(2000);

		
		loginbtn.click();
	}

}
