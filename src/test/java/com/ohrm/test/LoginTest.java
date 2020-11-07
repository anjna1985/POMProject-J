package com.ohrm.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	@Test
	public void login() {
		lpage.doLogin("Admin", "admin123");
		boolean status = driver.getCurrentUrl().contains("dashboard");
		if (status==true) {
			System.out.println("Test Passed");
			Assert.assertTrue(true);
		} else {
			System.out.println("Test Failed");
			Assert.assertTrue(false);
		}
	}

}

