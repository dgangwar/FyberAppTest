package com.fyber.automation.core;

import java.util.List;

import io.appium.java_client.ios.IOSDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppiumCommands {

	final int DEFAULT_WAIT_IN_SECONDS = 5;

	IOSDriver driver = DriverFactory.getDriver();

	public void clickByID(String locator) {

		driver.findElementByAccessibilityId(locator).click();

	}

	public AppiumCommands clickByName(String locator) {

		driver.findElementByName(locator).click();
		return this;

	}

	public AppiumCommands type(String locator, String textValue) {

		driver.findElementByAccessibilityId(locator).sendKeys(textValue);
		return this;
	}

	public String getText(String locator) {
		return driver.findElementByAccessibilityId(locator).getText();

	}

	public String getAttributeAtLocatorByID(String locator, String attributeName) {
		return driver.findElementByAccessibilityId(locator).getAttribute(
				attributeName);

	}

	public String getAttributeAtLocatorByName(String locator,
			String attributeName) {
		return driver.findElementByName(locator).getAttribute(attributeName);

	}

	public String getAttributeAtLocatorByXpath(String locator,
			String attributeName) {
		return driver.findElementByXPath(locator).getAttribute(attributeName);

	}

	public List<WebElement> getElementsByXpath(String locator) {
		return driver.findElementsByXPath(locator);
	}

	public boolean isElementPresentByXpath(String locator) {

		return driver.findElementByXPath(locator).isDisplayed();

	}

	public boolean isElementPresentByName(String locator) {

		return driver.findElementByName(locator).isDisplayed();

	}

	public ScreenOrientation getOrientation() {
		return driver.getOrientation();

	}

	public void launchApp() {
		System.out.println(driver);
		driver.launchApp();

	}

	public void closeApp() {

	}

	public AppiumCommands waitForElementToExist(By locator) {
		Wait<WebDriver> wait = new WebDriverWait(driver,
				this.DEFAULT_WAIT_IN_SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return this;
	}

	public AppiumCommands acceptAlert() {
		driver.findElementByXPath("//UIAAlert");
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return this;
	}

	public AppiumCommands cancelAlert() {
		Alert alert = driver.switchTo().alert();
		System.out.println("Cancel Alert " + alert);
		alert.dismiss();
		return this;
	}

	public boolean isAlertPresent() {
		Alert alert = driver.switchTo().alert();
		return (alert == null);
	}

}
