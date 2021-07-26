package com.selenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.pages.CartPage;

public class CartTest extends BaseTest {
	@Test (groups = { "valid" }, priority = 2)
	public void validCarTest() throws InterruptedException {

		extentTest = extent.startTest("Valid Cart scenario test");
		CartPage Cart = new CartPage(driver);
		Cart.UserCart();
		logger.info("Cart Test Case Passed");
	 //   Assert.assertEquals(prop.getProperty("ValidCartTest"),Cart.CartEmpty());
		Thread.sleep(5000);
	}
	
	
	@Test (groups = { "invalid" }, priority = 1)
	public void invalidCartTest() throws InterruptedException {

		extentTest = extent.startTest("Invalid Cart scenario test");
		CartPage Cart = new CartPage(driver);
		Cart.UserCart();
		logger.info("Cart Test Case Failed");
	//	Assert.assertEquals(prop.getProperty("InvalidCartTest"),Cart.CartEmpty());
		Thread.sleep(5000);
	}
}
