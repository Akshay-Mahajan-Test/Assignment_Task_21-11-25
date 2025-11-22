package com.example.tests;

import com.example.framework.base.BaseTest;
import com.example.framework.pages.RegistrationPage;
import com.example.framework.pages.LoginPage;
import com.example.framework.pages.ProfilePage;
import com.example.framework.utils.TestDataGenerator;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class RegistrationFlowTest extends BaseTest {

	String base = com.example.framework.utils.ConfigReader.get("web.baseUrl");
	String email = TestDataGenerator.uniqueEmail();

	@Test
	public void registrationLoginAndProfileUpdate() throws Exception {

		RegistrationPage rp = new RegistrationPage(com.example.framework.base.DriverFactory.getDriver());
		rp.enterName("Akshay");
		rp.enterEmail(email);
		rp.enterPassword("StrongPass@123");
		rp.clickRegister();
	}

	@Test
	public void updateProfile() {
		LoginPage lp = new LoginPage(com.example.framework.base.DriverFactory.getDriver());
		lp.login(email, "StrongPass@123");
		ProfilePage pp = new ProfilePage(com.example.framework.base.DriverFactory.getDriver());
		pp.setName("Akshay Updated");
		pp.setBio("Bio from UI");
		pp.uploadAvatar("/tmp/avatar.png");
		pp.clickSave();

	}

}
