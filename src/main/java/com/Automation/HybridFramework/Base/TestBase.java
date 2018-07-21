package com.Automation.HybridFramework.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties pro;
	
	public TestBase()  {
		
		
		try {
			
			pro = new Properties();

			FileInputStream fis
 = new FileInputStream("E:\\NewLocation\\HybridFramework\\src\\main\\java\\com\\Automation\\HybridFramework\\Config\\config.properties");
			pro.load(fis);

			
		} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void initilaization() {
		
		String browsername = pro.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		
		}
		
		else if(browsername.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Driver/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(pro.getProperty("url"));
	}
	
	

}
