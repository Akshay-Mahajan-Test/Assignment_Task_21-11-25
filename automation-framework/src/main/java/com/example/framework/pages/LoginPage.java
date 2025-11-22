package com.example.framework.pages;

import com.example.framework.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "email")
	private WebElement email;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id = "loginBtn")
	private WebElement loginBtn;

	public void login(String e, String p) {
		email.sendKeys(e);
		password.sendKeys(p);
		loginBtn.click();
	}
}
