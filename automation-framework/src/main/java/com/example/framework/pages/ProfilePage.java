package com.example.framework.pages;

import com.example.framework.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {
	public ProfilePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "name")
	private WebElement name;
	@FindBy(id = "bio")
	private WebElement bio;
	@FindBy(id = "avatarUpload")
	private WebElement avatar;
	@FindBy(id = "saveBtn")
	private WebElement saveBtn;

	public void setName(String n) {
		name.clear();
		name.sendKeys(n);
	}

	public void setBio(String b) {
		bio.clear();
		bio.sendKeys(b);
	}

	public void uploadAvatar(String path) {
		avatar.sendKeys(path);
	}

	public void clickSave() {
		saveBtn.click();
	}
}
