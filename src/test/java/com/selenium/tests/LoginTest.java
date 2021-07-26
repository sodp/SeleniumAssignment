package com.selenium.tests;

import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.selenium.pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test (groups = { "valid" }, priority = 1)
	public void validLogin() throws InterruptedException {
		extentTest = extent.startTest("Valid Login scenario test");
		LoginPage login = new LoginPage(driver);
		login.ClickSignIn();
		AssertJUnit.assertEquals("Login - My Store", driver.getTitle());
		login.UserLoginEmailId(prop.getProperty("Email"));
		login.UserLoginPassword(prop.getProperty("Password"));
		login.ClickLogin();
		//login.UserSignOut();
		logger.info("Login Test Case Passed");
		Thread.sleep(5000);
	}

	@Test (groups = { "invalid" }, priority = 3)
	public void invalidLogin() throws InterruptedException {
		extentTest = extent.startTest("Invalid Login Password Wrong scenario test");
		LoginPage login = new LoginPage(driver);
		login.ClickSignIn();
		AssertJUnit.assertEquals("Login - My Store", driver.getTitle());
		login.UserLoginEmailId(prop.getProperty("Email")); // Email 
		login.UserLoginPassword(prop.getProperty("WrongPassword")); // Wrong Password
		login.ClickLogin();
		//login.UserSignOut();
		logger.info("Login Test Case Failed");
		Thread.sleep(2000);
	}
	
	//Wrong Email providing
	@Test (groups = { "invalid" }, priority = 2)
	public void invalidLogin_2() throws InterruptedException {
		extentTest = extent.startTest("Invalid Email Login scenario test");
		LoginPage login = new LoginPage(driver);
		login.ClickSignIn();
		Assert.assertEquals("Login - My Store", driver.getTitle());
		login.UserLoginEmailId(prop.getProperty("WrongEmail"));//Wrong Email id
		login.UserLoginPassword(prop.getProperty("Password")); //Password
		login.ClickLogin();
		//login.UserSignOut();
		logger.info("Login Test Case Failed");
		Thread.sleep(2000);
	}

}