package com.fyber.automation.core;

import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseAppium {

	private static String suiteName = "AppiumTest";
	AppiumCommands appiumCommands;
	IOSDriver driver ;

	/**
	 *
	 *            This method invoked very first of test suite execution This
	 *            starts the loggers and invokes creating hub and nodes
	 * @throws MalformedURLException 
	 *
	 */
	@BeforeSuite(alwaysRun = true)
	public void beforeSuite() throws MalformedURLException {
		// set up appium
		driver = DriverFactory.getDriver();
		

	}

	public static void setSuiteName(String name) {
		suiteName = name;
	}

	public static String getSuiteName() {
		return suiteName;
	}

	/**
	 * This method is invoked before every test class to cleanup the projects
	 * directory
	 */
	@BeforeClass(alwaysRun = true)
	public void beforeClass() throws Exception {
		System.out.println("before class");
		driver = DriverFactory.getDriver();
	}

	/**
	 * This method is invoked before every test case. Initializes the driver and
	 * launches landing page
	 * 
	 */
	@BeforeMethod(alwaysRun = true)
	public void setUp() {
	}

	/**
	 * This method can be overridden in test classes to setup the test related
	 * actions
	 * 
	 */
	protected void testSetUp() {
	}

	/**
	 * This method invokes after every test case execution It removes the driver
	 * and invokes logout method
	 */
	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		
	}

	/**
	 * This method is executed very last of test suite execution This shutdowns
	 * loggers and hub
	 */
	@AfterClass(alwaysRun = true)
	public void afterClass() {
		driver.closeApp();
	}

	/**
	 * Removes the driver
	 */
	protected void closeWebDriver() {
		appiumCommands.closeApp();
	}

}
