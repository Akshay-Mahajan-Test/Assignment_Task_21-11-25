package com.example.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

public class DriverFactory {
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	public static WebDriver getDriver() {
		return driver.get();
	}

	public static void initDriver(String browser) throws Exception {
		if (driver.get() == null) {
			String grid = com.example.framework.utils.ConfigReader.get("selenium.grid.url");
			ChromeOptions opts = new ChromeOptions();
			opts.addArguments("--no-sandbox");
			driver.set(new RemoteWebDriver(new URL(grid), opts));
		}
	}

	public static void quitDriver() {
		if (driver.get() != null) {
			driver.get().quit();
		}
	}
}
