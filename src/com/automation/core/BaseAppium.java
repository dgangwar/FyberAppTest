package com.automation.core;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public abstract class BaseAppium {

	private static String suiteName = "AppiumTest";
	AppiumCommands appiumCommands;
	AppiumDriver driver ;

	/**
	 * @param testContext
	 *            This method invoked very first of test suite execution This
	 *            starts the loggers and invokes creating hub and nodes
	 * @throws MalformedURLException 
	 * @throws VisuTestFrameworkException
	 */
	@BeforeSuite(alwaysRun = true)
	public void beforeSuite(ITestContext testContext) throws MalformedURLException {
		setSuiteName(testContext.getSuite().getName());
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
	}

	/**
	 * This method is invoked before every test case. Initializes the driver and
	 * launches landing page
	 * 
	 * @throws VisuTestFrameworkException
	 */
	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		driver.closeApp();
	}

	/**
	 * This method can be overridden in test classes to setup the test related
	 * actions
	 * 
	 * @throws VisuTestFrameworkException
	 */
	@SuppressWarnings("unused")
	protected void testSetUp() {
	}

	/**
	 * This method invokes after every test case execution It removes the driver
	 * and invokes logout method
	 */
	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		this.closeVisuAndWebDriver();
	}

	/**
	 * This method is executed very last of test suite execution This shutdowns
	 * loggers and hub
	 */
	@AfterSuite(alwaysRun = true)
	public void afterSuite(ITestContext testContext) {

	}

	/**
	 * Removes the driver
	 */
	protected void closeVisuAndWebDriver() {
		//appiumCommands.closeApp();
	}

}
