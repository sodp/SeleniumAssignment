package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ShirtPage {
	WebDriver driver;

	public ShirtPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	 
	 //Actions actions=new Actions(driver);
	 // driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	@FindBy(how = How.XPATH, using = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
	public WebElement WomenTab;
	
	@FindBy(how = How.XPATH, using = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	public WebElement Shirt;
	

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Faded Short Sleeve T-shirts')]")
	public WebElement Product;
	
	@FindBy(how = How.XPATH, using = "//input[@id='search_query_top']")
	public WebElement SearchBar;
	
	@FindBy(how = How.NAME, using = "submit_search")
	public WebElement SubmitBar;
	
	public String WomenTab() {
		Actions action=new Actions(driver);
		action.moveToElement(WomenTab).perform();
		Shirt.click();
		String product_name=Product.getText();
		SearchBar.sendKeys(product_name); //??
		SubmitBar.click();
		return product_name;
	} 
}
