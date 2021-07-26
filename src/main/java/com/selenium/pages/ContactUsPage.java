package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {

	WebDriver driver;

	public ContactUsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
	public WebElement ContactUs;
	
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	public WebElement UserEmail;
	
	@FindBy(how = How.XPATH, using = "//select[@id='id_contact']")
	public WebElement SelectService;
	
	@FindBy(how = How.ID, using = "message")
	public WebElement UserMessage;

	@FindBy(how = How.XPATH, using = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/fieldset[1]/div[2]/button[1]/span[1]")
	public WebElement SendButton;

	
	public void ContactUsClick() {
		ContactUs.click();
	}
	public void UserEmail(String useremail) {
		UserEmail.sendKeys(useremail);
	}
	public void UserService(String servicename) {
		SelectService.sendKeys(servicename);
	}
	
	public void UserMessage(String usermessage) {
		UserMessage.sendKeys(usermessage);
	}
	public void SendButtonClick() {
		SendButton.click();
	}

}
