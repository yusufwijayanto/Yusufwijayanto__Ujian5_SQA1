package com.juaracoding.selenium.ujian.sqa1.automationpractice.pages.addtocart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.selenium.ujian.sqa1.automationpractice.driver.DriverSingleton;

public class AddToCart {
	
private WebDriver driver;
	
	public AddToCart() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id = "#header > div.nav > div > div > nav > div:nth-child(2) > a")
	private WebElement account;
	
	@FindBy(css = "#block_top_menu > ul > li:nth-child(2) > a")
	private WebElement buttonDress;
	
	public void Dresses() {	

		buttonDress.click();
	}
	

	@FindBy(css = "#page > div.columns-container")
	private WebElement Gaje;
	
	@FindBy(css = "#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-in-line.first-item-of-tablet-line.last-item-of-mobile-line")
	private WebElement PilihDress;
	
	public void PilihDresses() {	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1050)");
		WebDriverWait wait = new WebDriverWait(driver,15);
		Gaje.click();
		PilihDress.click();
	}
	
	
	@FindBy(css = "#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-in-line.first-item-of-tablet-line.last-item-of-mobile-line.hovered > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span")
	private WebElement Cart;
	
	@FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span > span")
	private WebElement Next;
	
	public void CartDress() {	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Cart.click();
		Next.click();
	}
	
	
	@FindBy(css = "#block_top_menu > ul > li:nth-child(3) > a")
	private WebElement buttonTShirts;
	
	@FindBy(css = "#center_column > ul > li > div")
	private WebElement PilihTShirts;
	
	public void TShirts() {	
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript("window.scrollBy(0,-1050)");
		WebDriverWait wait = new WebDriverWait(driver,10);
		buttonTShirts.click();
		js.executeScript("window.scrollBy(0,700)");
		Gaje.click();
		PilihTShirts.click();
	}
	
	
	@FindBy(css = "#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span")
	private WebElement CartTS;
	
	public void CartTShirt() {	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		CartTS.click();
	}
	
	
	@FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a")
	private WebElement ButtonCheckOut;
	
	@FindBy(css = "#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium")
	private WebElement ButtonCheckOut2;
	
	public void CheckOut() {	
		ButtonCheckOut.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript("window.scrollBy(0,1050)");
		this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ButtonCheckOut2.click();
	}
	
	@FindBy(css = "#ordermsg > textarea")
	private WebElement OrderMsg;
	
	@FindBy(css = "#center_column > form > p > button")
	private WebElement ButtonCheckOut3;
	
	public void OrderMessage(String message) {	
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript("arguments[0].scrollIntoView()", OrderMsg);
		OrderMsg.sendKeys(message);
		ButtonCheckOut3.click();
	}
	
	
	@FindBy(css = "#form > div > p.checkbox > label")
	private WebElement Checkbox;
	
	@FindBy(css = "#form > p > button")
	private WebElement ButtonCheckOut4;
	
	public void CheckBoxShipping() {	
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript("arguments[0].scrollIntoView()", Checkbox);
		Checkbox.click();
		ButtonCheckOut4.click();
	}
	
	
	@FindBy(css = "#HOOK_PAYMENT > div:nth-child(1) > div > p > a")
	private WebElement ButtonPayment;
	
	public void Payment() {	
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript("window.scrollBy(0,500)");
		this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ButtonPayment.click();
	}
	
	
	@FindBy(css = "#cart_navigation > button")
	private WebElement ButtonConfirm;
	
	public void Confirm() {	
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript("window.scrollBy(0,600)");
		this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ButtonConfirm.click();
		js.executeScript("window.scrollBy(0,400)");
	}
	
}
