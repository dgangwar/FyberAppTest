package com.fyber.automation.pageobject;

import org.openqa.selenium.By;

import com.fyber.automation.core.AppiumCommands;
import com.fyber.automation.core.Validation;

public class MorePage {
	private AppiumCommands appiumcommand = new AppiumCommands();

	public Validation isMorePageOpened() {
		String value = appiumcommand.getAttributeAtLocatorByXpath(
				"//UIAButton[@name='More']", "value");
		return new Validation(value.equalsIgnoreCase("1"));
	}

	public MorePage selectLocation(String location) {
		appiumcommand
				.clickByName("Location")
				.sendKeysByXpath(
						"//UIAPickerWheel", location);
		return this;
	}

	public String getLocation() {
		return appiumcommand
				.getValueByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[6]");
	}

	public MorePage goToUserSettings() {
		appiumcommand.clickByName("User Settings");
		appiumcommand.waitForElementToExist(By.xpath("//UIAAlert")).acceptAlert();
		return this;
	}

}
