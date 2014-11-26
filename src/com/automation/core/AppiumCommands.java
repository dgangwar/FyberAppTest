package com.automation.core;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;

public class AppiumCommands  {
	
	AppiumDriver driver = DriverFactory.getDriver();
	
	public void click(String locator) {

		driver.findElementByAccessibilityId(locator).click();

	}

	public void type(String locator, String textValue) {

		driver.findElementByAccessibilityId(locator).sendKeys(textValue);

	}

	public String getText(String locator) {
		return driver.findElementByAccessibilityId(locator).getText();

	}
	
	public String getAttributeAtLocator(String locator, String attributeName) {
		return driver.findElementByAccessibilityId(locator).getAttribute(attributeName);

	}
	
	public boolean isElementPresentByXpath(String locator) {

		return driver.findElementByXPath(locator).isEnabled();

	}
	

	public ScreenOrientation getOrientation()
	{
		return driver.getOrientation();
		
	}
	
	public void launchApp()
	{
		System.out.println(driver);
		driver.launchApp();
		
	}
	public void closeApp()
	{
		driver.closeApp();
		
	}
	
}
