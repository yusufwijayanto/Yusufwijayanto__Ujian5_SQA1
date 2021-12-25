package com.juaracoding.selenium.ujian.sqa1.automationpractice.pages.createaccount;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.selenium.ujian.sqa1.automationpractice.driver.DriverSingleton;


public class Login {
	
private WebDriver driver;
	
	public Login() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#header > div.nav > div > div > nav > div.header_user_info > a")
	private WebElement buttonSignIn;
	
	public void SignIn() {	
		buttonSignIn.click();
	}
	
	@FindBy(id = "email_create")
	private WebElement TextBoxEmail;
	@FindBy(id = "SubmitCreate")
	private WebElement ButtonCreate;
	
	public void CreateAccount(String email) {	
		TextBoxEmail.sendKeys(email);
		ButtonCreate.click();		
	}
	
	
	@FindBy(id = "uniform-id_gender1")
	private WebElement GenderMr;
	@FindBy(id = "uniform-id_gender2")
	private WebElement GenderMrs;

	public void setGender(int selection) {
		switch(selection) {
		case 1 :
			GenderMr.click();
			break;
		case 2 :
			GenderMrs.click();
			break;
		}
    }

	
	@FindBy(id = "customer_firstname")
	private WebElement TextBoxFirstName;
	@FindBy(id = "customer_lastname")
	private WebElement TextBoxLastName;
	@FindBy(id = "email")
	private WebElement TextBoxEmailAccount;
	@FindBy(id = "passwd")
	private WebElement TextBoxPassword;
	
	public void FormInformation(String firstname, String lastname, String password) {	
		TextBoxFirstName.sendKeys(firstname);
		TextBoxLastName.sendKeys(lastname);
		TextBoxEmailAccount.click();
		TextBoxPassword.sendKeys(password);	
	}
	
	
	@FindBy(id = "uniform-days")
	private WebElement DOBday;
	@FindBy(id = "uniform-months")
	private WebElement DOBmonths;
	@FindBy(id = "uniform-years")
	private WebElement DOByears;
	
	public void Days (int selection) {
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript("arguments[0].scrollIntoView()", DOBday);
		DOBday.click();		
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void Months (int selection) {
		DOBmonths.click();		
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void Years (int selection) {
		DOByears.click();		
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	
	@FindBy(id = "newsletter")
	private WebElement CeklisNewsLetter;
	@FindBy(id = "optin")
	private WebElement CeklisPartner;
	
	public void Ceklis () {
		CeklisNewsLetter.click();	
		CeklisPartner.click();	
	}
	
	
	@FindBy(id = "firstname")
	private WebElement TextBoxFirstNameAddress;
	@FindBy(id = "lastname")
	private WebElement TextBoxLastNameAddress;
	@FindBy(id = "company")
	private WebElement TextBoxCompany;
	@FindBy(id = "address1")
	private WebElement TextBoxAaddress1;
	@FindBy(id = "address2")
	private WebElement TextBoxAaddress2;
	@FindBy(id = "city")
	private WebElement TextBoxCity;
	
	public void FormAddress(String company, String address1, String address2, String city) {	
		TextBoxFirstNameAddress.click();	
		TextBoxLastNameAddress.click();	
		TextBoxCompany.sendKeys(company);	
		TextBoxAaddress1.sendKeys(address1);	
		TextBoxAaddress2.sendKeys(address2);	
		TextBoxCity.sendKeys(city);	
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript("arguments[0].scrollIntoView()", TextBoxCity);
	}
	

	@FindBy(id = "id_state")
	private WebElement TextBoxState;
	
	
	public void State (int selection) {
		TextBoxState.click();		
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	

	@FindBy(id = "postcode")
	private WebElement TextBoxPostCode;
	@FindBy(id = "id_country")
	private WebElement TextBoxCountry;
	@FindBy(id = "other")
	private WebElement TextBoxOther;
	@FindBy(id = "phone")
	private WebElement TextBoxPhone;
	@FindBy(id = "phone_mobile")
	private WebElement TextBoxPhoneMobile;
	@FindBy(id = "alias")
	private WebElement TextBoxAlias;
	@FindBy(id = "submitAccount")
	private WebElement ButtonSubmit;
	
	
	public void FormAddressNext(String postcode, String other, String phone, String mobile) {	
		TextBoxPostCode.sendKeys(postcode);
		TextBoxCountry.click();
		TextBoxCountry.sendKeys(Keys.ENTER);	
		TextBoxOther.sendKeys(other);	
		TextBoxPhone.sendKeys(phone);	
		TextBoxPhoneMobile.sendKeys(mobile);	
		TextBoxAlias.click();
		TextBoxAlias.sendKeys(Keys.ENTER);
//		ButtonSubmit.click();
	}
	
	
	public void Close() {	
		driver.close();
	}
	
	
	@FindBy(id = "email")
	private WebElement SignInEmail;
	@FindBy(id = "passwd")
	private WebElement SignInPassword;
	@FindBy(id = "SubmitLogin")
	private WebElement ButtonLogin;
	
	public void Login(String emaillogin, String passlogin) {
		buttonSignIn.click();
		SignInEmail.sendKeys(emaillogin);
		SignInPassword.sendKeys(passlogin);
		ButtonLogin.click();
	}

}

