package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	WebDriver driver;

	public SignInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.CLASS_NAME, using = "login")
	public WebElement SignIn;
    /*User Details*/
	@FindBy(how = How.ID, using = "email_create")
	public WebElement userEmail;
	
	@FindBy(how = How.ID, using = "SubmitCreate")
	public WebElement CreateAccount;

	@FindBy(how= How.ID, using ="customer_firstname")
	public WebElement UserFirstname;
	
	@FindBy(how= How.ID, using ="customer_lastname")
	public WebElement UserLastname;
	
	@FindBy(how= How.ID, using ="email")
	public WebElement UserEmail;
	
	@FindBy(how= How.ID, using ="passwd")
	public WebElement UserPassword;
	
	@FindBy(how= How.ID, using ="firstname")
	public WebElement Firstname;
	
	@FindBy(how= How.ID, using ="lastname")
	public WebElement Lastname;
	
	@FindBy(how= How.ID, using ="company")
	public WebElement UserCompany;
	
	@FindBy(how= How.ID, using ="address1")
	public WebElement UserAddress;
	
	@FindBy(how= How.ID, using ="city")
	public WebElement UserCity;
	
	@FindBy(how= How.ID, using ="id_state")
	public WebElement UserState;
	
	@FindBy(how= How.ID, using ="postcode")
	public WebElement UserPostalCode;
	
	@FindBy(how= How.ID, using ="id_country")
	public WebElement UserCountry;
	
	@FindBy(how= How.ID, using ="phone_mobile")
	public WebElement UserMobileNumber;
	
	@FindBy(how= How.ID, using ="alias")
	public WebElement UserAddressAlias;
	
	@FindBy(how= How.ID, using ="submitAccount")
	public WebElement UserRegister;
	
	@FindBy(how= How.CLASS_NAME, using ="logout")
	public WebElement UserSignOut;

	//function click signin
	public void ClickSignIn() {
		SignIn.click();
	}
    //function enter user email
	public void EnterUserEmail(String userNameEmail) {
		userEmail.sendKeys(userNameEmail);
	}
	//function create account
	public void ClickCreateAccount()
	{
	 CreateAccount.click();
	}
    //function for user first name
	public void EnterUserFirstname(String userfirstname) {
		UserFirstname.sendKeys(userfirstname);
	}
	//function for user last name
	public void EnterUserLastname(String userlastname) {
		UserLastname.sendKeys(userlastname);
	}
	//Re Enter email in registration page
	public void RenterUserEmail(String useremail) {
		UserEmail.sendKeys(useremail);
	}
	
	//Enter the user password
	public void UserPassword(String userpassword) {
			UserPassword.sendKeys(userpassword);
		}
	
	//Enter user firstname 
		public void Firstname(String firstname) {
				Firstname.sendKeys(firstname);
			}
		
		//Enter user lastname 
		public void Lastname(String lastname) {
				Lastname.sendKeys(lastname);
			}
		
		//Enter user company
		public void UserCompany(String usercompany) {
				UserCompany.sendKeys(usercompany);
			}
		
		//Enter user address 
		public void UserAddress(String useraddress) {
				UserAddress.sendKeys(useraddress);
			}
		//Enter user city address fields
		public void UserCity(String usercity) {
				UserCity.sendKeys(usercity);
			}
		
		//Enter user state address fields
		public void UserState(String userstate) {
				UserState.sendKeys(userstate);
			}
	
		//Enter user postal code address fields
		public void UserPostalCode(String userpostalcode) {
				UserPostalCode.sendKeys(userpostalcode);
			}
		//Enter user mobile number
		public void UserCountry(String usercountry) {
						UserCountry.sendKeys(usercountry);
					}
			
		//Enter user mobile number
		public void UserMobileNumber(String usermobilenumber) {
				UserMobileNumber.sendKeys(usermobilenumber);
			}
	
		//Enter user country address alias
		public void UserAddressAlias(String useraddressalias) {
				UserAddressAlias.sendKeys(useraddressalias);
			}
		// Click on user register
		public void UserRegister() {
			UserRegister.click();
		}

		public void ClickSignOut() {
			UserSignOut.click();
		}

}
