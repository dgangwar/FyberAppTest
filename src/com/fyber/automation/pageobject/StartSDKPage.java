package com.fyber.automation.pageobject;

import com.fyber.automation.core.AppiumCommands;
import com.fyber.automation.core.Validation;

public class StartSDKPage 
{
	
	
	private AppiumCommands appiumcommand = new AppiumCommands();
	
	
	public Validation isMBEPageOpened() {
		String value = appiumcommand.getAttributeAtLocatorByName("Start", "value");
		return new Validation(value.equalsIgnoreCase("1"));
	}
	
	

}
