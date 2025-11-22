package com.example.framework.pages;

import com.example.framework.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "name")
	private WebElement nameInput;
	@FindBy(id = "email")
	private WebElement emailInput;
	@FindBy(id = "password")
	private WebElement passwordInput;
	@FindBy(id = "registerBtn")
	private WebElement registerBtn;

	public void enterName(String name) {
		nameInput.clear();
		nameInput.sendKeys(name);
	}

	public void enterEmail(String email) {
		emailInput.clear();
		emailInput.sendKeys(email);
	}

	public void enterPassword(String pwd) {
		passwordInput.clear();
		passwordInput.sendKeys(pwd);
	}

	public void clickRegister() {
		registerBtn.click();
	}
}
