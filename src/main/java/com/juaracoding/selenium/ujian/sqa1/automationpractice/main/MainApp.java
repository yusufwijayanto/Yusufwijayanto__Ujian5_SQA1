package com.juaracoding.selenium.ujian.sqa1.automationpractice.main;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.selenium.ujian.sqa1.automationpractice.driver.DriverSingleton;
import com.juaracoding.selenium.ujian.sqa1.automationpractice.pages.addtocart.AddToCart;
import com.juaracoding.selenium.ujian.sqa1.automationpractice.pages.createaccount.Login;

public class MainApp {

	public static void main(String[] args) {
		WebDriver driver = DriverSingleton.getInstance().getDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		Login login = new Login();
		login.SignIn();
		login.CreateAccount("jokogantenggggg9@gmail.com");
		login.setGender(1);	
		login.FormInformation("Joko","Waskito","123456");
		login.Days(9);
		login.Months(10);
		login.Years(31);
		login.Ceklis();
		login.FormAddress("JuaraCoding","Lenteng Agung, Jakarta Selatan","Jagakarsa, Jakarta Selatan","Jakarta Selatan");;
		login.State(6);
		login.FormAddressNext("12610","I'm Handsome","021 83432424","08137647433");

		AddToCart addtocart = new AddToCart();
		addtocart.Dresses();
		addtocart.PilihDresses();
		addtocart.CartDress();
		addtocart.TShirts();
		addtocart.CartTShirt();
		addtocart.CheckOut();
		addtocart.OrderMessage("Dont try this at home");
		addtocart.CheckBoxShipping();
		addtocart.Payment();
		addtocart.Confirm();

		
		
	}
}
