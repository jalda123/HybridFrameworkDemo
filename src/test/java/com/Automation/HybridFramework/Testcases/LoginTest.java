package com.Automation.HybridFramework.Testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Automation.HybridFramework.Base.TestBase;
import com.Automation.HybridFramework.Pages.LoginPage;

public class LoginTest extends TestBase{
	
	LoginPage login;

	
	public LoginTest() {
		super();
	}
	
	@BeforeTest
	
	public void init() {
		
		initilaization();
		
		login = new LoginPage();
	
	}
	
	@Test
	
	public void LoginTest() throws InterruptedException {
		
		login.loginToapplication();
	}
}
