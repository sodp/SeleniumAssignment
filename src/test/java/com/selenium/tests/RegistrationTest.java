package com.selenium.tests;
import org.testng.annotations.Test;
import com.selenium.pages.SignInPage;

public class RegistrationTest extends BaseTest {
	@Test (groups = { "valid"}, priority = 1)
	public void UserRegistrationTest() throws InterruptedException {

		extentTest = extent.startTest("Valid Registration Scenario test");
		SignInPage register = new SignInPage(driver);
		register.ClickSignIn();
		register.EnterUserEmail(prop.getProperty("NewEmailid"));
		register.ClickCreateAccount();
		register.EnterUserFirstname(prop.getProperty("FirstName"));
		register.EnterUserLastname(prop.getProperty("LastName"));
		register.RenterUserEmail("");
		register.UserPassword(prop.getProperty("Password"));
		register.Firstname(prop.getProperty("FirstName"));
		register.Lastname(prop.getProperty("LastName"));
		register.UserCompany("NULL");
		register.UserAddress(prop.getProperty("Address"));
		register.UserCity(prop.getProperty("City"));
		register.UserState("Florida");
		register.UserCountry("United States");
		register.UserPostalCode("12112");
		register.UserMobileNumber("11122233331");
		register.UserAddressAlias("First");
		register.UserRegister();
		register.ClickSignOut();
		Thread.sleep(2000);
		logger.info("Test Case Passed");
	}
	//Invalid ZIP
	@Test (groups = { "invalid" }, priority = 2)
	public void InvalidRegistration() throws InterruptedException{


		extentTest = extent.startTest("Invalid Registration Invalid Zip scenario test");
		SignInPage register = new SignInPage(driver);
		register.ClickSignIn();
		register.EnterUserEmail(prop.getProperty("NewEmailid"));
		register.ClickCreateAccount();
		register.EnterUserFirstname(prop.getProperty("FirstName"));
		register.EnterUserLastname(prop.getProperty("LastName"));
		register.RenterUserEmail("");
		register.UserPassword(prop.getProperty("Password"));
		register.Firstname(prop.getProperty("FirstName"));
		register.Lastname(prop.getProperty("LastName"));
		register.UserCompany("NULL");
		register.UserAddress("West Virgmia");
		register.UserCity("Flok");
		register.UserState("Florida");
		register.UserCountry("United States");
		register.UserPostalCode("121112"); // invalid zip
		register.UserMobileNumber("11122233331");
		register.UserAddressAlias("First");
		register.UserRegister();
		register.ClickSignOut();
		Thread.sleep(2000);
		logger.info("Test Case Failed");
	}
	//Invalid State
	@Test (groups = { "invalid" }, priority = 3)
	public void InvalidRegistration_2() throws InterruptedException{

		extentTest = extent.startTest("Invalid Registration Invalid State scenario test");
		SignInPage register = new SignInPage(driver);
		register.ClickSignIn();
		register.EnterUserEmail(prop.getProperty("NewEmailid"));
		register.ClickCreateAccount();
		register.EnterUserFirstname(prop.getProperty("FirstName"));
		register.EnterUserLastname(prop.getProperty("LastName"));
	    register.RenterUserEmail("");
		register.UserPassword(prop.getProperty("Password"));
		register.Firstname(prop.getProperty("FirstName"));
		register.Lastname(prop.getProperty("LastName"));
		register.UserCompany("NULL");
		register.UserAddress(prop.getProperty("Address"));
		register.UserCity("Flokp");
		register.UserState("Floridxxa"); //Invalid State
		register.UserCountry("United States");
		register.UserPostalCode("12112");
		register.UserMobileNumber("11122233331");
		register.UserAddressAlias("First");
		register.UserRegister();
		register.ClickSignOut();
		Thread.sleep(2000);
		logger.info("Test Case Failed");
	}

}
