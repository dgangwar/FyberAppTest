package com.fyber.automation.pageobject;

import org.openqa.selenium.By;

import com.fyber.automation.core.AppiumCommands;
import com.fyber.automation.core.Validation;

public class StartSDKPage {

	private AppiumCommands appiumcommand = new AppiumCommands();

	public Validation isMBEPageOpened() {
		String value = appiumcommand.getAttributeAtLocatorByName("Start",
				"value");
		return new Validation(value.equalsIgnoreCase("1"));
	}

	public StartSDKPage startSDK() {
		appiumcommand.clickByName("StartSDK_Button")
				.waitForElementToExist(By.xpath("//UIAAlert")).acceptAlert();
		return this;
	}

	public StartSDKPage clearSDKData() {
		appiumcommand.clickByName("ClearPersistedSDKData_Button")
				.waitForElementToExist(By.xpath("//UIAAlert")).acceptAlert()
				.acceptAlert();
		return this;
	}

	public StartSDKPage dntClearSDKData() {
		appiumcommand.clickByName("ClearPersistedSDKData_Button")
				.waitForElementToExist(By.xpath("//UIAAlert")).cancelAlert();
		return this;
	}

	public Validation areAppID_Fields_Present() {
		return new Validation(appiumcommand.isElementPresentByName("App ID:")
				&& appiumcommand.isElementPresentByName("AppID_TextField"));

	}
	
	public Validation areUserID_Fields_Present() {
		return new Validation(appiumcommand.isElementPresentByName("User ID:")
				&& appiumcommand.isElementPresentByName("AppID_TextField"));

	}
	
	public Validation areVcsKey_Fields_Present() {
		return new Validation(appiumcommand.isElementPresentByName("VCS Key:")
				&& appiumcommand.isElementPresentByName("VCSKey_TextField"));

	}

}
