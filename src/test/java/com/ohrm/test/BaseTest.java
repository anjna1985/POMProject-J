package com.ohrm.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ohrm.pages.LoginPage;

public class BaseTest {

	public static WebDriver driver;
	String browser;
	ReadConfig rc;
	
	LoginPage lpage;
	
	@BeforeMethod
	public void setUP() {

		rc = new ReadConfig();
		browser = rc.getBrowser();
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else {
			driver = new FirefoxDriver();

		}
		
		driver.get(rc.getURL());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		lpage = new LoginPage(driver);
	}

	
	@AfterMethod
	public void terminate() {
		driver.close();
	}
}
