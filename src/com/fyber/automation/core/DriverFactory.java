package com.fyber.automation.core;

import io.appium.java_client.ios.IOSDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {
	private static IOSDriver driver;
	
 
	public static IOSDriver getDriver()
	{

		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot,
				"/../../../Library/Developer/Xcode/DerivedData/SponsorPayTestApp-gjdjwcsqqzscszfekgzkjtayzkqo/Build/Products/Debug-iphonesimulator");
		File app = new File(appDir, "SponsorPayTestApp.app");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformVersion", "8.1");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("deviceName", "iPhone Simulator");
		capabilities.setCapability("app", app.getAbsolutePath());
		try {
			if(driver == null)
			{
			driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),
					capabilities);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}

}
