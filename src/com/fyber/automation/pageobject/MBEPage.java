package com.fyber.automation.pageobject;

import com.fyber.automation.core.AppiumCommands;
import com.fyber.automation.core.Validation;

public class MBEPage 
{
	
	private AppiumCommands appiumcommand = new AppiumCommands();
	
	public Validation isMBEPageOpened() {
		String value = appiumcommand.getAttributeAtLocatorByName("MBE", "value");
		return new Validation(value.equalsIgnoreCase("1"));
	}
	
	public MBEPage turnOnNotification()
	{
		String value = this.getNotificationStatus();
		if(value.equalsIgnoreCase("0"))
		{
			appiumcommand.clickByName("ShowNotificationOnEngagementCompleted_Switch");
		}
		return this;
	}
	
	public MBEPage turnOffNotification()
	{
		String value = this.getNotificationStatus();
		if(value.equalsIgnoreCase("1"))
		{
			appiumcommand.clickByName("ShowNotificationOnEngagementCompleted_Switch");
		}
		return this;
	}
	
	public String getNotificationStatus()
	{
		return appiumcommand.getAttributeAtLocatorByName("ShowNotificationOnEngagementCompleted_Switch", "value");
	}
	
	

}
