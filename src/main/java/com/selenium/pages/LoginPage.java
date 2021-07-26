package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Sign in')]")
	public WebElement SignIn;

	@FindBy(how = How.ID, using = "email")
	public WebElement LoginEmailid;

	@FindBy(how = How.ID, using = "passwd")
	public WebElement LoginPassword;
	

	@FindBy(how = How.NAME, using = "SubmitLogin")
	public WebElement ClickLoginButton;
	
	@FindBy(how = How.LINK_TEXT, using = "Forgot your password?")
	public WebElement ForgetPassword;


	@FindBy(how = How.LINK_TEXT, using = "Sign out")
	public WebElement SignOutButton;

	
	public void ClickSignIn() {
		SignIn.click();
	}
	
	public void UserLoginEmailId(String emailid) {
		LoginEmailid.sendKeys(emailid);
	}

	public void UserLoginPassword(String password) {
		LoginPassword.sendKeys(password);
	}
	public void UserForgetPassword() {
		ForgetPassword.click();
	}
	public void ClickLogin() {
		 ClickLoginButton.click();
	}
	public void UserSignOut() {
		SignOutButton.click();
	}

}
