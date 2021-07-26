package com.selenium.tests;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.selenium.pages.ContactUsPage;

public class ContactUsTest  extends BaseTest{
	
	@Test (groups = { "valid" }, priority = 1)
	public void validcontactus() throws InterruptedException {

		extentTest = extent.startTest("Valid scenario test");
		ContactUsPage Contact = new ContactUsPage(driver);
		Contact.ContactUsClick();
		AssertJUnit.assertEquals("Contact us - My Store", driver.getTitle()); //Check the equality title of page
		Contact.UserEmail(prop.getProperty("Email"));
		Contact.UserService(prop.getProperty("ServiceName"));
		Contact.UserMessage("Website is not Working");
		Contact.SendButtonClick(); //click send button
		logger.info("Test Case Passed");
		Thread.sleep(5000);
	}
	@Test (groups = { "invalid" }, priority = 2)
	public void Invalidcontactus() throws InterruptedException {

		extentTest = extent.startTest("Valid scenario test");
		ContactUsPage Contact = new ContactUsPage(driver);
		Contact.ContactUsClick();
		Assert.assertEquals("Contact us - My Store", driver.getTitle()); //Check the equality of title page
		Contact.UserEmail(prop.getProperty("Email"));
		Contact.UserService(prop.getProperty("ServiceName"));
		Contact.UserMessage("");//No Message pass
		Contact.SendButtonClick();
		logger.info("Test Case Failed");//print log info
		Thread.sleep(5000);
	}
}
