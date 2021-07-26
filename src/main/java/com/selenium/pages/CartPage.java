package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver;

	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//b[contains(text(),'Cart')]")
	public WebElement Cart;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Your shopping cart is empty.')]")
	public WebElement CartEmpty;
	
	public void UserCart() {
		Cart.click();
	}
	public String CartEmpty() {
		return CartEmpty.getText();
	}

}
