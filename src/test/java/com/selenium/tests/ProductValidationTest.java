package com.selenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.pages.ShirtPage;

public class ProductValidationTest extends BaseTest {
	
	
	@Test (groups = { "valid"}, priority = 1)
	public void validproduct() throws InterruptedException {

		extentTest = extent.startTest("Valid Case Product");
		ShirtPage pageproduct_validation = new ShirtPage(driver);
		String element=pageproduct_validation.WomenTab(); //Return String of Valid Product
		
		Assert.assertEquals(prop.getProperty("ValidProductLabel"),element); //Finding matching product
		logger.info("Product Validation Test Case Passed");
		Thread.sleep(5000);
	}
	
	@Test (groups = { "invalid" }, priority = 2)
	public void invalidproduct() throws InterruptedException {

		extentTest = extent.startTest("Invalid Case Product");
		ShirtPage pageproduct_validation = new ShirtPage(driver);
		String element=pageproduct_validation.WomenTab(); // Return String Valid Product
		
		Assert.assertEquals(prop.getProperty("InvalidProductLabel"),element);//incorrect matching
		logger.info("Product Validation Test Case Failed");
		Thread.sleep(5000);
	}

}
