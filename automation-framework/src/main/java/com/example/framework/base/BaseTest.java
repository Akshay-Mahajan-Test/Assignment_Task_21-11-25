package com.example.framework.base;

import org.testng.annotations.*;

public class BaseTest {
	@BeforeMethod(alwaysRun = true)
	@Parameters({ "browser" })
	public void setUp(@Optional("chrome") String browser) throws Exception {
		DriverFactory.initDriver(browser);
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		DriverFactory.quitDriver();
	}
}
